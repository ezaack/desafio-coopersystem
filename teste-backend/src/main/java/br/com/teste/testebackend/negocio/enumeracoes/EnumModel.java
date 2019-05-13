package br.com.teste.testebackend.negocio.enumeracoes;

import java.io.Serializable;

public interface EnumModel<T extends Serializable> {

    T getCodigo();
}
