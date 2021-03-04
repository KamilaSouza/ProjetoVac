package br.com.blog.ProjetoVac.controller.dto;

import br.com.blog.ProjetoVac.model.Usuario;
import lombok.Data;

@Data
public class UsuarioDto {

    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private String dataNascimento;

    public UsuarioDto(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.cpf = usuario.getCpf();
        this.dataNascimento = usuario.getDataNascimento();
    }
}
