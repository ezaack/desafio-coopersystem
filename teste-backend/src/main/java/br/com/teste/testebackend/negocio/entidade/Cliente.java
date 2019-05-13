package br.com.teste.testebackend.negocio.entidade;


import br.com.teste.testebackend.negocio.conversores.EnumEstadosConverter;
import br.com.teste.testebackend.negocio.enumeracoes.EnumEstados;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 11, nullable = false)
    private String cpf;

    @OneToMany(mappedBy = "cliente")
    private List<Telefone> telefones;

    @OneToMany(mappedBy = "cliente")
    private List<Email> emails;
    /*
    dados do endereço
     */
    private String cep;
    @Enumerated
    @Convert(converter = EnumEstadosConverter.class)
    private EnumEstados uf;
    private String cidade;
    private String logradouro;
    private String complemento;


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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
}
