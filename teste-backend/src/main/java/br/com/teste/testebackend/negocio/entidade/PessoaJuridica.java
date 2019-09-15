package br.com.teste.testebackend.negocio.entidade;

import br.com.teste.testebackend.negocio.enumeracoes.EnumTipoPessoaJuridica;

import javax.persistence.*;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name="id")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)
public abstract class PessoaJuridica extends Pessoa {

    protected String cnpj;

    protected String rasaoSocial;

    protected EnumTipoPessoaJuridica tipo;

    @OneToMany(mappedBy = "pessoaJuridica")
    protected List<Tributo> tributos;

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

    public List<Tributo> getTributos() {
        return tributos;
    }

    public void setTributos(List<Tributo> tributos) {
        this.tributos = tributos;
    }
}
