package br.com.blog.ProjetoVac.repository;

import br.com.blog.ProjetoVac.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByCpf(String cpf);
}
