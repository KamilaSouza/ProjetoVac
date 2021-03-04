package br.com.blog.ProjetoVac.controller.dto;

import br.com.blog.ProjetoVac.model.Aplicacao;

public class AplicacaoDto {

    private Long id;
    private String email;
    private String nomevacina;
    private String datavacina;
    private String cpf;
    private UsuarioDto usuarioDto;

    public AplicacaoDto(Aplicacao aplicacao){
        this.id = aplicacao.getId();
        this.email = aplicacao.getEmail();
        this.nomevacina = aplicacao.getNomevacina();
        this.datavacina = aplicacao.getDatavacina();
        //this.cpf = aplicacao.getCpf();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
