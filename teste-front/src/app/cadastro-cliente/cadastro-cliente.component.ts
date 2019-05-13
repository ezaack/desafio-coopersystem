import { CepService } from './../cep-service.service';
import { CEP } from './../model/cep.model';
import { Validadores } from './../uteis/validadores';
import { Cliente } from './../model/cliente.model';
import { ClienteService } from './../cliente.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-cadastro-cliente',
  templateUrl: './cadastro-cliente.component.html',
  styleUrls: ['./cadastro-cliente.component.css']
})
export class CadastroClienteComponent implements OnInit {

  public form: FormGroup;
  public validadores: Validadores = new Validadores();
  public clientesCadastrados: Observable<Cliente[]>;
  public cep: Observable<CEP>;


  constructor(private formBuilder: FormBuilder,
    private clienteService: ClienteService,
    private cepService: CepService) { }

  ngOnInit() {
    this.form = this.formBuilder.group(
      {
        nome: [''],
        email: [''],
        cpf: ['', [this.validadores.validaCpf, Validators.required]],
        cep: ['', [Validators.required]],
        complemento: [''],
      }
    );

    this.form.get('cep').valueChanges.subscribe(
      (value: string) => {
        if (value.length === 8) {
          this.recuperaEndereco(value);
        }
      }
    );
    this.recuperaClientes();
  }

  private recuperaEndereco(value: any) {
    this.cepService.get(value).subscribe((retorno) => {
      this.cep = new Observable((p) => {
        p.next(retorno.body);
        p.complete();
      });
    });
  }

  public recuperaClientes(): void {
    this.clienteService.getAll().subscribe(
      (response) => {
        this.clientesCadastrados = new Observable(
          (p) => {
            p.next(response.body);
            p.complete();
          }
        );
      }
    );
  }

  public onSubmit(): void {
    if (this.form.valid) {
      this.clienteService.post(this.getClienteFromForm()).subscribe(
        (retorno) => {
          this.recuperaClientes();
        },
        (error) => { }
      );
    }
  }

  private getClienteFromForm(): Cliente {
    this.cep.subscribe(
      (c) => {
        cliente.cidade = c.localidade;
        cliente.logradouro = c.logradouro;
        cliente.uf = c.uf;
      }
    );
    const cliente = new Cliente();
    cliente.nome = this.form.get('nome').value;
    cliente.cpf = this.form.get('cpf').value;
    cliente.email = this.form.get('email').value;
    cliente.cep = this.form.get('cep').value;
    cliente.complemento = this.form.get('complemento').value;
    return cliente;
  }
}
