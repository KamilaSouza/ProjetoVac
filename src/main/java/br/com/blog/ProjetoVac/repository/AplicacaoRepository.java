
package br.com.blog.ProjetoVac.repository;

import br.com.blog.ProjetoVac.model.Aplicacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AplicacaoRepository extends JpaRepository<Aplicacao, Long> {
}
