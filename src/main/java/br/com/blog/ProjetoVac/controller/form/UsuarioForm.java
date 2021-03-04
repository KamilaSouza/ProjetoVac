package br.com.blog.ProjetoVac.controller.form;

import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class UsuarioForm {


    @NotBlank
    private String nome;

    @Email @NotBlank
    private String email;

    @CPF @NotBlank
    private String cpf;

    @NotBlank
    private String dataNascimento;

}

