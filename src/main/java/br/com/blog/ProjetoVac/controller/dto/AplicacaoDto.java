package br.com.blog.ProjetoVac.controller.dto;

import br.com.blog.ProjetoVac.model.Aplicacao;
import br.com.blog.ProjetoVac.model.Usuario;
import br.com.blog.ProjetoVac.model.Vacina;
import lombok.Data;

@Data
public class AplicacaoDto {

    private Long id;
    private Vacina nomevacina;
    private String datavacina;
    private Usuario usuario;

    public AplicacaoDto(Aplicacao aplicacao){
        this.id = aplicacao.getId();
        this.nomevacina = aplicacao.getVacina();
        this.datavacina = aplicacao.getDatavacina();
        this.usuario = aplicacao.getUsuario();
    }

}
