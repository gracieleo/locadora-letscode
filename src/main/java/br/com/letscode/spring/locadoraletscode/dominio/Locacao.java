package br.com.letscode.spring.locadoraletscode.dominio;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Locacao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int codigoLocacao;

}



