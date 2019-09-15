package br.com.teste.testebackend.negocio.servico.utils.estrategias;

import br.com.teste.testebackend.negocio.entidade.PessoaJuridica;

import java.math.BigDecimal;

public interface ITributoStrategy {

    void defineTributos(PessoaJuridica pessoaJuridica);
}
