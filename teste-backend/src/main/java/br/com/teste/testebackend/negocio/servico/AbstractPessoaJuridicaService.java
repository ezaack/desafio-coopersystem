package br.com.teste.testebackend.negocio.servico;

import br.com.teste.testebackend.negocio.entidade.PessoaJuridica;
import br.com.teste.testebackend.negocio.repositorio.PessoaRepository;
import br.com.teste.testebackend.negocio.utils.calculoTributos.CalculoTributosUtil;

import java.math.BigDecimal;

public abstract class AbstractPessoaJuridicaService<E extends PessoaJuridica,  R extends PessoaRepository<E>> extends AbstractPessoaService<E, R> {

    public void processaTributos(E pessoa){
        BigDecimal tributos = CalculoTributosUtil.calculaTributos(pessoa);

        /*
         FAZ ALGUMA COISA COM OS TRIBUTOS...
         */
    }
}
