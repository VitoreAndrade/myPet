package projeto_aplicado.pet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import projeto_aplicado.pet.DTO.DadosListagemUsuariosDTO;
import projeto_aplicado.pet.Entity.Usuarios;

import java.util.List;
@Repository
public interface UsuarioRepostory extends JpaRepository<Usuarios, Long> {

//    @Query("SELECT u.nome, u.email, u.contato, u.idade FROM usuarios u")
//    List<DadosListagemUsuariosDTO> listarUsuarios(DadosListagemUsuariosDTO lista);

}
