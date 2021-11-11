package br.com.letscode.spring.locadoraletscode.dominio;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Pessoa implements Serializable {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private int codigoPessoa;
        private String nome;
        @ManyToMany
        @JoinTable(name="pessoaEndereco", joinColumns={@JoinColumn(name="codigoPessoa", referencedColumnName="codigoPessoa") }, inverseJoinColumns={@JoinColumn(name="codigoEndereco", referencedColumnName="codigoEndereco") } )
        private List<Endereco> enderecos;


        public int getCodigoPessoa() {
            return codigoPessoa;
        }

        public void setCodigoPessoa(int codigoPessoa) {
            this.codigoPessoa = codigoPessoa;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public List<Endereco> getEnderecos() {
            return enderecos;
        }

        public void setEnderecos(List<Endereco> enderecos) {
            this.enderecos = enderecos;
        }

}
