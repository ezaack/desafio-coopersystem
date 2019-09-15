package br.com.teste.testebackend.negocio.servico;

import br.com.teste.testebackend.negocio.entidade.PequenaEmpresa;
import br.com.teste.testebackend.negocio.repositorio.PequenaEmpresaRepository;
import org.springframework.stereotype.Service;

@Service
public class PequenaEmpresaService extends AbstractPessoaJuridicaService<PequenaEmpresa, PequenaEmpresaRepository> {
}
