package br.com.teste.testebackend.negocio.servico.utils;

import br.com.teste.testebackend.negocio.entidade.PessoaJuridica;
import br.com.teste.testebackend.negocio.enumeracoes.EnumTipoPessoaJuridica;
import br.com.teste.testebackend.negocio.servico.utils.estrategias.DefineTributosGrandeEmpresaStrategy;
import br.com.teste.testebackend.negocio.servico.utils.estrategias.DefineTributosMicroEmpresaStrategy;
import br.com.teste.testebackend.negocio.servico.utils.estrategias.DefineTributosPequenaEmpresaStrategy;
import br.com.teste.testebackend.negocio.servico.utils.estrategias.ITributoStrategy;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/*
PODERIA TER FEITO COMO UMA BEAN SINGLETON, MAS ACHEI MUITO SIMPLES PARA TANTO..
 */
public abstract class DefineTributosUtil {

    public static void defineTributos(PessoaJuridica pessoa){
        getEstrategias().get(pessoa.getTipo()).defineTributos(pessoa);
    }

    private static Map<EnumTipoPessoaJuridica, ITributoStrategy> getEstrategias(){
        Map<EnumTipoPessoaJuridica, ITributoStrategy> estrategias = new HashMap<>();
        estrategias.put(EnumTipoPessoaJuridica.ME, new DefineTributosMicroEmpresaStrategy());
        estrategias.put(EnumTipoPessoaJuridica.PE, new DefineTributosPequenaEmpresaStrategy());
        estrategias.put(EnumTipoPessoaJuridica.GE, new DefineTributosGrandeEmpresaStrategy());

        return estrategias;
    }
}
