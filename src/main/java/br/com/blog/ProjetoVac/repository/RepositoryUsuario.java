package br.com.blog.ProjetoVac.repository;

import br.com.blog.ProjetoVac.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUsuario extends JpaRepository<Usuario, Long> {
}
