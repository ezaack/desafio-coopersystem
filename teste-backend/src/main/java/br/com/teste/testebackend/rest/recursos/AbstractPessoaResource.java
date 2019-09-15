package br.com.teste.testebackend.rest.recursos;

import br.com.teste.testebackend.negocio.entidade.Pessoa;
import br.com.teste.testebackend.negocio.repositorio.PessoaRepository;
import br.com.teste.testebackend.negocio.servico.AbstractPessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

public abstract class AbstractPessoaResource<E extends Pessoa, R extends PessoaRepository<E>, S extends AbstractPessoaService> {

    @Autowired
    private AbstractPessoaService<E, R> service;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<E>> get() {

        return ResponseEntity.ok(service.listaTodos());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<E> get(@PathVariable Integer id) {

        return (ResponseEntity<E>) ResponseEntity.ok(service.recupera(id));

    }

    @RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<E> post(@RequestBody E entidade) {
        return (ResponseEntity<E>) ResponseEntity.of(Optional.of(service.salvar(entidade)));
    }

    @RequestMapping(value = "", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<E> put(@RequestBody E entidade) {
        return (ResponseEntity<E>) ResponseEntity.of(Optional.of(service.salvar(entidade)));

    }

    @RequestMapping(value = "", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@RequestBody E entidade) {
        service.apaga(entidade);

    }

}
