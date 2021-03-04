package br.com.blog.ProjetoVac.controller.form;

import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UsuarioForm {

    @NotNull
    @NotBlank(message = "Campo nome é obrigatório")
    private String nome;

    @NotNull @Email
    @NotBlank(message = "Campo email é obrigatório")
    private String email;

    @NotNull @CPF
    @NotBlank(message = "Campo cpf é obrigatório")
    private String cpf;

    @NotNull @NotBlank(message = "Campo data de nascimento é obrigatório: dd/mm/aaaa")
    private String dataNascimento;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}

