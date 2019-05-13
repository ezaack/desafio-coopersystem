package br.com.teste.testebackend.negocio.enumeracoes;

import java.io.Serializable;

public enum EnumTipoTelefone implements EnumModel {

    RESIDENCIAL("RE"),

    CELULAR("CE"),

    COMERCIAL("CO");


    private EnumTipoTelefone(String codigo) {
        this.codigo = codigo;
    }

    private String codigo;

    @Override
    public Serializable getCodigo() {
        return null;
    }
}
