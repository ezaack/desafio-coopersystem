package br.com.teste.testebackend.negocio.conversores;

import br.com.teste.testebackend.negocio.enumeracoes.EnumEstados;
import br.com.teste.testebackend.negocio.enumeracoes.EnumTipoTelefone;

import javax.persistence.Converter;

@Converter
public class EnumTipoTelefoneConverter extends EnumConverterBase<EnumTipoTelefone, String> {
    public EnumTipoTelefoneConverter(){
        super(EnumTipoTelefone.class);
    }

    @Override
    protected EnumTipoTelefone[] recuperaEnumValues() {
        return EnumTipoTelefone.values();
    }
}
