package br.com.teste.testebackend.negocio.conversores;

import br.com.teste.testebackend.negocio.enumeracoes.EnumEstados;

import javax.persistence.Converter;

@Converter
public class EnumEstadosConverter extends EnumConverterBase<EnumEstados, String> {
    public EnumEstadosConverter(){
        super(EnumEstados.class);
    }

    @Override
    protected EnumEstados[] recuperaEnumValues() {
        return EnumEstados.values();
    }
}
