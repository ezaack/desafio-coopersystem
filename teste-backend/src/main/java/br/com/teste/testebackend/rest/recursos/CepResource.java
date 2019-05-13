package br.com.teste.testebackend.rest.recursos;

import br.com.teste.testebackend.negocio.integracao.adaptadores.ViaCepAdapter;
import br.com.teste.testebackend.negocio.integracao.adaptadores.dto.CEP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping("/rest/cep")
public class CepResource {

    @Autowired
    private ViaCepAdapter service;

    @RequestMapping(value = "/{cep}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CEP> get(@PathVariable String cep) {
        return ResponseEntity.ok(service.recuperaEnderecoCep(cep));
    }
}
