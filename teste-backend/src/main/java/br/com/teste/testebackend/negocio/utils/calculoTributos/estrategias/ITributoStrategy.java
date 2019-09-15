package br.com.teste.testebackend.negocio.utils.calculoTributos.estrategias;

import br.com.teste.testebackend.negocio.entidade.PessoaJuridica;

import java.math.BigDecimal;

public interface ITributoStrategy {

    BigDecimal calculaEncargos(PessoaJuridica pessoaJuridica);
}
