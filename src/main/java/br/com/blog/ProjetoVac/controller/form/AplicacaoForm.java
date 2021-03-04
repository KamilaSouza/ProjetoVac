package br.com.blog.ProjetoVac.controller.form;

import br.com.blog.ProjetoVac.model.Aplicacao;
import br.com.blog.ProjetoVac.model.Usuario;
import br.com.blog.ProjetoVac.model.Vacina;
import br.com.blog.ProjetoVac.repository.UsuarioRepository;
import br.com.blog.ProjetoVac.repository.VacinaRepository;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class AplicacaoForm {


    @NotBlank(message = "O nome da vacina é obrigatório")
    private String nomevacina;

    @NotBlank(message = "A data da aplicação da vacina é obrigatório: dd/mm/aaaa")
    private String datavacina;

    @NotBlank(message = "O email é obrigatório")
    private String email;


    public Aplicacao converterUsuario(UsuarioRepository usuarioRepository) {
        Usuario usuario = usuarioRepository.findByEmail(email);
        return new Aplicacao(nomevacina,datavacina,email);
    }

    public Aplicacao converterVacina(VacinaRepository vacinaRepository) {
        Vacina vacina = vacinaRepository.findByNome(nomevacina);
        return new Aplicacao(nomevacina,datavacina,email);
    }
}

