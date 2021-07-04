package br.com.blog.ProjetoVac.model;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Aplicacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //varias aplicaçoes por vacina
    @ManyToOne
    private Vacina vacina;

    private String datavacina;

    //varias aplicaçoes por usuario
    @ManyToOne
    private Usuario usuario;

    public Aplicacao(String nomevacina, String datavacina, String usuario) { }

    public Aplicacao() {}

}

