package br.com.blog.ProjetoVac.controller.form;

import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class UsuarioForm {


    @NotBlank(message = "Campo nome é obrigatório")
    private String nome;

    @Email
    @NotBlank(message = "Campo email é obrigatório")
    @Column (name = "email", unique = true)
    private String email;

    @CPF
    @NotBlank(message = "Campo cpf é obrigatório")
    @Column(name = "cpf", unique = true)
    private String cpf;

    @NotBlank(message = "Campo data de nascimento é obrigatório: dd/mm/aaaa")
    private String dataNascimento;

}

