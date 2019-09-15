package br.com.teste.testebackend.negocio.servico;

import br.com.teste.testebackend.negocio.entidade.MicroEmpresa;
import br.com.teste.testebackend.negocio.repositorio.MicroEmpresaRepository;
import org.springframework.stereotype.Service;

@Service
public class MicroEmpresaService extends AbstractPessoaJuridicaService<MicroEmpresa, MicroEmpresaRepository> {
}
