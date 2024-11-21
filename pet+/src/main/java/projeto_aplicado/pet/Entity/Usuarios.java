package projeto_aplicado.pet.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import projeto_aplicado.pet.DTO.DadosCadastroUsuarioDTO;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

@Entity(name = "usuarios")
@Table(name = "usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String idade;
    private String contato;
    private String email;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_login")
    private Login login;

    public Usuarios (DadosCadastroUsuarioDTO dadosCadastro){
        this.nome = dadosCadastro.nome();
        this.idade = dadosCadastro.idade();
        this.contato = dadosCadastro.contato();
        this.email = dadosCadastro.email();
        this.login = new Login(dadosCadastro.login());
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
