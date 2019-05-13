package br.com.teste.testebackend.negocio.servico;

import br.com.teste.testebackend.negocio.entidade.Cliente;
import br.com.teste.testebackend.negocio.repositorio.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente salvar(Cliente cliente){
        return this.repository.save(cliente);
    }

    public Cliente recupera(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<Cliente> listaTodos(){
        return (List<Cliente>) repository.findAll();
    }

    public void apaga(Cliente cliente){
        repository.delete(cliente);
    }
}
