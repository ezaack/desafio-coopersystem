package br.com.teste.testebackend.negocio.entidade;

import br.com.teste.testebackend.negocio.enumeracoes.EnumTipoPessoaFisica;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name="id")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 1, discriminatorType = DiscriminatorType.STRING)
public abstract class PessoaFisica extends  Pessoa {

    protected EnumTipoPessoaFisica tipo;

    @Column(length = 11, nullable = false)
    private String cpf;


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId(){
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
