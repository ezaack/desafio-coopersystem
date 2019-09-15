package br.com.teste.testebackend.negocio.servico;

import br.com.teste.testebackend.negocio.entidade.Cliente;
import br.com.teste.testebackend.negocio.entidade.Pessoa;
import br.com.teste.testebackend.negocio.repositorio.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class AbstractPessoaService<E extends Pessoa, R extends PessoaRepository<E>> {

    @Autowired
    private  PessoaRepository<E> repository;

    public E salvar(E entidade){
        return this.repository.save(entidade);
    }

    public E recupera(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<E> listaTodos(){
        return (List<E>) repository.findAll();
    }

    public void apaga(E entidade){
        repository.delete(entidade);
    }
}
