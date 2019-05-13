package br.com.teste.testebackend.negocio.entidade;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Email implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String email;

    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
