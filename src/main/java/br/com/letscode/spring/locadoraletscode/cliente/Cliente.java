package br.com.letscode.spring.locadoraletscode.cliente;

import lombok.*;
import org.hibernate.validator.constraints.br.CPF;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Cliente")
public class Cliente  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome não informado")
    @Pattern(regexp = "[a-zA-Z]+(.)*",message = "Primeira letra do nome deve ser maiúscula")
    private String nome;

    @Email(message = "E-mail inválido")
    @NotBlank(message = "E-mail não informado")
    private String email;

    @CPF(message = "Número CPF inválido")
    @NotBlank(message = "CPF não informado")
    private String cpf;


}
