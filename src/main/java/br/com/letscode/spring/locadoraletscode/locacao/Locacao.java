package br.com.letscode.spring.locadoraletscode.locacao;

import br.com.letscode.spring.locadoraletscode.cliente.Cliente;
import br.com.letscode.spring.locadoraletscode.filme.Filme;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.text.SimpleDateFormat;



@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Locacao")

public class Locacao implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoLocacao;


    private String dataInicioLocacao ;
    private String dataFimLocacao ;

    @OneToOne
    @JoinColumn(name="codigoFilme")
    @NotNull(message = "Pelo menos um filme deve ser selecionado")
    private Filme filme;


    @ManyToOne
    @JoinColumn(name="cliente_id")
    @NotNull(message = "Um cliente deve ser selecionado")
    private Cliente cliente;


}
