package br.com.teste.testebackend.negocio.servico.utils.estrategias;

import br.com.teste.testebackend.negocio.entidade.PessoaJuridica;
import br.com.teste.testebackend.negocio.entidade.Tributo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DefineTributosGrandeEmpresaStrategy implements ITributoStrategy {
    @Override
    public void defineTributos(PessoaJuridica pessoaJuridica) {
        List<Tributo> tributos = new ArrayList<>();
        /*
        DO THE MAGIC...
         */
        pessoaJuridica.setTributos(tributos);
    }
}
