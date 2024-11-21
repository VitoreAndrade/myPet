package projeto_aplicado.pet.DTO;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroLoginDTO(
        @NotBlank
        String login,
        String senha

) {
}
