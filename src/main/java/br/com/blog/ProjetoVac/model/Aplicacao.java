package br.com.blog.ProjetoVac.model;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Aplicacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String nomevacina;

    private String datavacina;

    @ManyToOne
    private Usuario usuario;

    public Aplicacao(String email, String nomevacina, String datavacina) { }

    public Aplicacao() { }

}

