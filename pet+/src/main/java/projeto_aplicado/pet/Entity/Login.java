package projeto_aplicado.pet.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import projeto_aplicado.pet.DTO.DadosCadastroLoginDTO;

@Entity(name = "login")
@Table(name = "login")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String senha;


    public Login (DadosCadastroLoginDTO dadosCadastroLogin){
        this.login = dadosCadastroLogin.login();
        this.senha = dadosCadastroLogin.senha();
    }
}
