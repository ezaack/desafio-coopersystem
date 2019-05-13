import { ClienteService } from './../cliente.service';
import { LoginService } from './../login.service';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  public form: FormGroup;

  constructor(
    private provider: LoginService,
    private formBuilder: FormBuilder,
    private router: Router) { }

  public ngOnInit() {

    this.form = this.formBuilder.group(
      {

        usuario: ['', [Validators.required]],
        senha: ['', [Validators.required]]
      }
    );
  }
  ionViewDidLoad() {
    console.log('ionViewDidLoad LoginPage');
  }

  public onSubmit() {
    debugger;
    this.provider.login(
      this.form.get('usuario').value,
      this.form.get('senha').value

    ).subscribe(
      (retorno) => {
        debugger;
        console.log(retorno.headers.get('Authorization'));
        sessionStorage.setItem('auth', retorno.headers.get('Authorization'));
        this.router.navigate(['cliente']);
      },
      (error) => {
        debugger;
      }
      );
  }

}
