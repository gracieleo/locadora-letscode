package br.com.letscode.spring.locadoraletscode.filme;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable=false)
    private String titulo;

    @OneToOne
    @JoinColumn(name = "locacao-id")
    private Locacao locacao;


}
