package br.com.blog.ProjetoVac.model;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Aplicacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Vacina vacina;

    private String datavacina;

    private String email;

    @ManyToOne
    private Usuario usuario;

    public Aplicacao( String nomevacina, String datavacina, String email) { }

    public Aplicacao() {}

}

