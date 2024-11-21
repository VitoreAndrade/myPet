package projeto_aplicado.pet.Controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import projeto_aplicado.pet.DTO.DadosAtualizacaoUsuarioDTO;
import projeto_aplicado.pet.DTO.DadosCadastroUsuarioDTO;
import projeto_aplicado.pet.DTO.DadosListagemUsuariosDTO;
import projeto_aplicado.pet.Services.UsuariosServices;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {


    @Autowired
    private UsuariosServices usuariosServices;

    @PostMapping
    @Transactional
    public void cadastrarUsuario (@Valid @RequestBody DadosCadastroUsuarioDTO dadosCadastroUsuario){
        usuariosServices.cadastrarUsuario(dadosCadastroUsuario);
    }

    @GetMapping
    public List<DadosListagemUsuariosDTO> listaUsuarios (){
       return usuariosServices.listaUsuarios();
    }


    @DeleteMapping("/{id}")
    @Transactional
    public void excluirUsuario(@PathVariable Long id){
        usuariosServices.excluirUsuario(id);
    }

    @PutMapping
    public ResponseEntity<?> atualizarUsuario (@PathVariable Long id, @RequestBody @Valid DadosAtualizacaoUsuarioDTO atualizacaoUsuarioDTO){
        return usuariosServices.atualizarUsuario(atualizacaoUsuarioDTO);
    }
}
