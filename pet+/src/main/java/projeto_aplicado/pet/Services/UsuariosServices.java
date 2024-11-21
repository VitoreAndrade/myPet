package projeto_aplicado.pet.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import projeto_aplicado.pet.DTO.DadosAtualizacaoUsuarioDTO;
import projeto_aplicado.pet.DTO.DadosCadastroUsuarioDTO;
import projeto_aplicado.pet.DTO.DadosListagemUsuariosDTO;
import projeto_aplicado.pet.Entity.Usuarios;
import projeto_aplicado.pet.Repository.UsuarioRepostory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



@Service
public class UsuariosServices {

    @Autowired
    private UsuarioRepostory usuarioRepostory;


    public void cadastrarUsuario (DadosCadastroUsuarioDTO dadosCadastroUsuario){
            usuarioRepostory.save(new Usuarios(dadosCadastroUsuario));
    }

    public List<DadosListagemUsuariosDTO> listaUsuarios (){
        List<Usuarios> usuarios = usuarioRepostory.findAll();
        return usuarios.stream().map(DadosListagemUsuariosDTO::new).collect(Collectors.toList());
    }

    public void excluirUsuario (Long id){
        usuarioRepostory.deleteById(id);
    }

    public ResponseEntity<?> atualizarUsuario (DadosAtualizacaoUsuarioDTO atualizarUsuario){
        Usuarios usuario = usuarioRepostory.findById(atualizarUsuario.id()).get();

        if(atualizarUsuario.nome() != null){
            usuario.setNome(atualizarUsuario.nome());
        }
        if(atualizarUsuario.contato() != null){
            usuario.setContato(atualizarUsuario.contato());
        }
        if(atualizarUsuario.idade() != null){
            usuario.setIdade(atualizarUsuario.idade());
        }
        if(atualizarUsuario.email() != null){
            usuario.setEmail(atualizarUsuario.email());
        }
        return ResponseEntity.ok().body(usuario);
    }

}
