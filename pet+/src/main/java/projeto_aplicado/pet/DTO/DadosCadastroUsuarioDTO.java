package projeto_aplicado.pet.DTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.Date;

public record DadosCadastroUsuarioDTO(
        @NotBlank
        String nome,
        @NotBlank
        String idade,
        @NotBlank
        String contato,
        @NotBlank
        @Email
        String email,
        @Valid
        DadosCadastroLoginDTO login

) {
}
