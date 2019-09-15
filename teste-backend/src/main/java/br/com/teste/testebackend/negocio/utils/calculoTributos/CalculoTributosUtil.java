package br.com.teste.testebackend.negocio.utils.calculoTributos;

import br.com.teste.testebackend.negocio.entidade.PessoaJuridica;
import br.com.teste.testebackend.negocio.enumeracoes.EnumTipoPessoaJuridica;
import br.com.teste.testebackend.negocio.utils.calculoTributos.estrategias.CalculoTributosGrandeEmpresaStrategy;
import br.com.teste.testebackend.negocio.utils.calculoTributos.estrategias.CalculoTributosMicroEmpresaStrategy;
import br.com.teste.testebackend.negocio.utils.calculoTributos.estrategias.CalculoTributosPequenaEmpresaStrategy;
import br.com.teste.testebackend.negocio.utils.calculoTributos.estrategias.ITributoStrategy;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/*
PODERIA TER FEITO COMO UMA BEAN SINGLETON, MAS ACHEI MUITO SIMPLES PARA TANTO..
 */
public abstract class CalculoTributosUtil {

    public static BigDecimal calculaTributos(PessoaJuridica pessoa){
        return getEstrategias().get(pessoa.getTipo()).calculaEncargos(pessoa);
    }

    private static Map<EnumTipoPessoaJuridica, ITributoStrategy> getEstrategias(){
        Map<EnumTipoPessoaJuridica, ITributoStrategy> estrategias = new HashMap<>();
        estrategias.put(EnumTipoPessoaJuridica.ME, new CalculoTributosMicroEmpresaStrategy());
        estrategias.put(EnumTipoPessoaJuridica.PE, new CalculoTributosPequenaEmpresaStrategy());
        estrategias.put(EnumTipoPessoaJuridica.GE, new CalculoTributosGrandeEmpresaStrategy());

        return estrategias;
    }
}
