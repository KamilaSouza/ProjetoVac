package br.com.blog.ProjetoVac.controller.form;

import br.com.blog.ProjetoVac.model.Aplicacao;
import br.com.blog.ProjetoVac.model.Usuario;
import br.com.blog.ProjetoVac.repository.UsuarioRepository;
import com.sun.istack.NotNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class AplicacaoForm {

    @NotNull
    @Email
    @NotBlank(message = "Campo email é obrigatório")
    private String email;

    @NotNull @NotBlank(message = "O nome da vacina é obrigatório")
    private String nomevacina;

    @NotNull @NotBlank(message = "A data da aplicação da vacina é obrigatório: dd/mm/aaaa")
    private String datavacina;

    @NotNull
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomevacina() {
        return nomevacina;
    }

    public void setNomevacina(String nomevacina) {
        this.nomevacina = nomevacina;
    }

    public String getDatavacina() {
        return datavacina;
    }

    public void setDatavacina(String datavacina) {
        this.datavacina = datavacina;
    }


    public Aplicacao converter(UsuarioRepository usuarioRepository) {
        Usuario usuario = usuarioRepository.findByCpf(cpf);
        return new Aplicacao(email,nomevacina,datavacina);
    }
}

