package projeto_aplicado.pet.DTO;

import projeto_aplicado.pet.Entity.Usuarios;

public record DadosListagemUsuariosDTO(
        String nome,
        String idade,
        String contato,
        String email
) {

    public DadosListagemUsuariosDTO (Usuarios usuarios){
        this(usuarios.getNome(),
                usuarios.getIdade(),
                usuarios.getContato(),
                usuarios.getEmail()
        );
    }

}
