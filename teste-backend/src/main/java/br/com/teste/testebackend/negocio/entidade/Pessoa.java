package br.com.teste.testebackend.negocio.entidade;

import br.com.teste.testebackend.negocio.conversores.EnumEstadosConverter;
import br.com.teste.testebackend.negocio.enumeracoes.EnumEstados;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa implements Serializable {

    @Id
    protected Integer id;

    @Column(length = 100, nullable = false)
    protected String nome;

    @OneToMany(mappedBy = "cliente")
    protected List<Telefone> telefones;

    @OneToMany(mappedBy = "cliente")
    protected List<Email> emails;

    protected String cep;
    @Enumerated
    @Convert(converter = EnumEstadosConverter.class)
    protected EnumEstados uf;
    protected String cidade;
    protected String logradouro;
    protected String complemento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public EnumEstados getUf() {
        return uf;
    }

    public void setUf(EnumEstados uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
