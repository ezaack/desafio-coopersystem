package br.com.teste.testebackend.negocio.integracao.adaptadores;

import br.com.teste.testebackend.negocio.integracao.adaptadores.dto.CEP;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ViaCepAdapter {

    private static final String URL = "https://viacep.com.br/ws/";


    public CEP recuperaEnderecoCep(String cep) {
        RestTemplate restTemplate = new RestTemplate();

        StringBuilder sb = new StringBuilder(URL);
        sb.append(cep).append("/json");
        return restTemplate.getForObject(sb.toString(), CEP.class);
    }
}
