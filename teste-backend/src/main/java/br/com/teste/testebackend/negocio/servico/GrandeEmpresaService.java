package br.com.teste.testebackend.negocio.servico;

import br.com.teste.testebackend.negocio.entidade.GrandeEmpresa;
import br.com.teste.testebackend.negocio.entidade.MicroEmpresa;
import br.com.teste.testebackend.negocio.repositorio.GrandeEmpresaRepository;
import br.com.teste.testebackend.negocio.repositorio.MicroEmpresaRepository;
import org.springframework.stereotype.Service;

@Service
public class GrandeEmpresaService extends AbstractPessoaJuridicaService<GrandeEmpresa, GrandeEmpresaRepository> {
}
