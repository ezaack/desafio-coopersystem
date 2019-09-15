package br.com.teste.testebackend.negocio.entidade;

import br.com.teste.testebackend.negocio.enumeracoes.EnumTipoPessoaJuridica;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name="id")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)
public abstract class PessoaJuridica extends Pessoa {

    private String cnpj;

    private String rasaoSocial;

    private EnumTipoPessoaJuridica tipo;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId(){
        return id;
    }

    public EnumTipoPessoaJuridica getTipo() {
        return tipo;
    }

    public void setTipo(EnumTipoPessoaJuridica tipo) {
        this.tipo = tipo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRasaoSocial() {
        return rasaoSocial;
    }

    public void setRasaoSocial(String rasaoSocial) {
        this.rasaoSocial = rasaoSocial;
    }
}
