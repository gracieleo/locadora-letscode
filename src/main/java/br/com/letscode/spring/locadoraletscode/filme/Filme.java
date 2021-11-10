package br.com.letscode.spring.locadoraletscode.filme;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Filmes")

public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoFilme;

    @NotBlank(message = "Titulo não informado")
    private String titulo;

    @NotBlank(message = "Sinopse não informado")
    private String sinopse;

    @NotBlank(message = "Valor não informado")
    private double valorDaLocacao;

    @NotBlank(message = "Genero não informado")
    private String genero;



}
