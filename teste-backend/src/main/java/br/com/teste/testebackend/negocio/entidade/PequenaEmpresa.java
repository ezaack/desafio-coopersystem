package br.com.teste.testebackend.negocio.entidade;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "PE")
public class PequenaEmpresa extends PessoaJuridica  {
}
