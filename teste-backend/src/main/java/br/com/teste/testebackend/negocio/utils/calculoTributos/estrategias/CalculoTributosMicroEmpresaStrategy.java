package br.com.teste.testebackend.negocio.utils.calculoTributos.estrategias;

import br.com.teste.testebackend.negocio.entidade.PessoaJuridica;

import java.math.BigDecimal;

public class CalculoTributosMicroEmpresaStrategy implements ITributoStrategy {
    @Override
    public BigDecimal calculaEncargos(PessoaJuridica pessoaJuridica) {
        /*
        DO THE MAGIC...
         */
        return BigDecimal.ZERO;
    }
}
