package br.com.teste.testebackend.negocio.integracao.adaptadores.dto;

public class CEP {

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;

    /**
     * Cria um novo CEP vazio
     */
    public CEP() {
    }

    /**
     * Cria um novo CEP completo
     * @param CEP
     * @param Logradouro
     * @param complemento
     * @param bairro
     * @param localidade
     * @param uf
     * @param ibge
     * @param gia
     */
    public CEP(String CEP, String Logradouro, String complemento, String bairro, String localidade, String uf, String ibge, String gia) {
        this.cep = CEP;
        this.logradouro = Logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.ibge = ibge;
        this.gia = gia;
    }

    /**
     * Cria um novo CEP parcial
     * @param Logradouro
     * @param localidade
     * @param uf
     */
    public CEP(String Logradouro, String localidade, String uf) {
        this.localidade = Logradouro;
        this.localidade = localidade;
        this.uf = uf;
    }


    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}
