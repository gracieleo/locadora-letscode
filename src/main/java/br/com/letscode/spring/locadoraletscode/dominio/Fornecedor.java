package br.com.letscode.spring.locadoraletscode.dominio;


import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Fornecedor extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cnpj;
    @Column(name="razaoSocial")
    private String razaoSocial;
    private String ie;

    public Fornecedor() {}

    public Fornecedor(String cnpj, String razaoSocial, String ie) {
        super();
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.ie = ie;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    @Override
    public String toString() {
        return "Fornecedor [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial
                + ", ie=" + ie + "]";
    }

}
