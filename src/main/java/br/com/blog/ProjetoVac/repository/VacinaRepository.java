package br.com.blog.ProjetoVac.repository;

import br.com.blog.ProjetoVac.model.Usuario;
import br.com.blog.ProjetoVac.model.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacinaRepository extends JpaRepository<Vacina, Long> {

    Vacina findByNome(String nome);
}
