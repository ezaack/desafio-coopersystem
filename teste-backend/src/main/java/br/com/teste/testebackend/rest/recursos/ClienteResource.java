package br.com.teste.testebackend.rest.recursos;

import br.com.teste.testebackend.negocio.entidade.Cliente;
import br.com.teste.testebackend.negocio.servico.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/rest/cliente")
public class ClienteResource {

    @Autowired
    private ClienteService service;
    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Cliente>> get() {

            return ResponseEntity.ok(service.listaTodos());
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE    )
    public ResponseEntity<Cliente> get(@PathVariable Integer id) {

        return ResponseEntity.ok(service.recupera(id));

    }

    @RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cliente> post(@RequestBody Cliente entidade) {
        return ResponseEntity.of(Optional.of(service.salvar(entidade)));
    }

    @RequestMapping(value = "", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cliente> put(@RequestBody Cliente entidade) {
        return ResponseEntity.of(Optional.of(service.salvar(entidade)));

    }
    @RequestMapping(value = "", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@RequestBody Cliente entidade) {
        service.apaga(entidade);

    }

}
