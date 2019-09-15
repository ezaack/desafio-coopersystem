package br.com.teste.testebackend.negocio.servico;

import br.com.teste.testebackend.negocio.entidade.PessoaJuridica;
import br.com.teste.testebackend.negocio.repositorio.PessoaRepository;
import br.com.teste.testebackend.negocio.servico.utils.DefineTributosUtil;

import java.math.BigDecimal;

public abstract class AbstractPessoaJuridicaService<E extends PessoaJuridica,  R extends PessoaRepository<E>> extends AbstractPessoaService<E, R> {

    public E salvar(E entidade){
        DefineTributosUtil.defineTributos(entidade);
        return super.salvar(entidade);
    }

}
