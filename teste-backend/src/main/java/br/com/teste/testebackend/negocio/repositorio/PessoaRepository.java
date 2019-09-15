package br.com.teste.testebackend.negocio.repositorio;

import br.com.teste.testebackend.negocio.entidade.Cliente;
import br.com.teste.testebackend.negocio.entidade.Pessoa;
import org.springframework.data.repository.CrudRepository;

@org.springframework.stereotype.Repository
public interface PessoaRepository<E extends Pessoa> extends CrudRepository<E, Integer> {
}
