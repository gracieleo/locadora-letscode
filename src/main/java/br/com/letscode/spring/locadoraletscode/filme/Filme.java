package br.com.letscode.spring.locadoraletscode.filme;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Filme")

public class Filme implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoFilme;

    @NotBlank(message = "Titulo não informado")
    private String titulo;

    @NotBlank(message = "Sinopse não informado")
    private String sinopse;


    private double valor;

    @OneToOne
    @JoinColumn(name="codigoCategoria")
    private Categoria categoria;


}


