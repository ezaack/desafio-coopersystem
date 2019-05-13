package br.com.teste.testebackend.negocio.entidade;


import br.com.teste.testebackend.negocio.conversores.EnumTipoTelefoneConverter;
import br.com.teste.testebackend.negocio.enumeracoes.EnumTipoTelefone;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Telefone implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String numero;

    @Convert(converter = EnumTipoTelefoneConverter.class)
    private EnumTipoTelefone tipoTelefone;


    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public EnumTipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(EnumTipoTelefone tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }
}
