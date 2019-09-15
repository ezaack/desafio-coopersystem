package br.com.teste.testebackend.negocio.entidade;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "GE")
public class GrandeEmpresa extends PessoaJuridica {
}
