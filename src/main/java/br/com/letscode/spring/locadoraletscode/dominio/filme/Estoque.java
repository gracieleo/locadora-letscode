package br.com.letscode.spring.locadoraletscode.dominio.filme;

import br.com.letscode.spring.locadoraletscode.dominio.Fornecedor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Estoque implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int codigoEstoque;
    private String nome;
    @OneToOne
    @JoinColumn(name="codigoFilme")
    private Filme filme;
    @OneToOne
    @JoinColumn(name="codigoPessoa")
    private Fornecedor fornecedor;

    private int qtde;

    public Estoque() {}


    public Estoque(String nome, Filme filme, Fornecedor fornecedor, int qtde) {
        super();
        this.nome = nome;
        this.filme = filme;
        this.fornecedor = fornecedor;
        this.qtde = qtde;
    }

    public int getCodigoEstoque() {
        return codigoEstoque;
    }

    public void setCodigoEstoque(int codigoEstoque) {
        this.codigoEstoque = codigoEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }


    @Override
    public String toString() {
        return "Estoque [codigoEstoque=" + codigoEstoque + ", nome=" + nome
                + ", filme=" + filme + ", fornecedor=" + fornecedor + ", qtde="
                + qtde + "]";
    }
}


