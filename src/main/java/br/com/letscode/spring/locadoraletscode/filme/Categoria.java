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
@Table(name="Categoria")
@Entity

public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int codigoCategoria;

    @NotBlank(message = "Descrição não informada.")
    private String descricao;

}
