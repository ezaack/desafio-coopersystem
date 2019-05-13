package br.com.teste.testebackend.negocio.repositorio;

import br.com.teste.testebackend.negocio.entidade.Cliente;
import org.springframework.data.repository.CrudRepository;

@org.springframework.stereotype.Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
}
