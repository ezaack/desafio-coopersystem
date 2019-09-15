package br.com.teste.testebackend.negocio.entidade;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;
@Entity
@DiscriminatorValue(value = "F")
public class Funcionario extends PessoaFisica  {

    private String matricula;

    private Date dataAdimicao;
    private Date dataDemicao;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getDataAdimicao() {
        return dataAdimicao;
    }

    public void setDataAdimicao(Date dataAdimicao) {
        this.dataAdimicao = dataAdimicao;
    }

    public Date getDataDemicao() {
        return dataDemicao;
    }

    public void setDataDemicao(Date dataDemicao) {
        this.dataDemicao = dataDemicao;
    }
}
