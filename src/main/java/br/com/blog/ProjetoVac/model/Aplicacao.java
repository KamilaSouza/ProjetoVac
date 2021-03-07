package br.com.blog.ProjetoVac.model;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Aplicacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //o usuario pode receber  varias vacinas
    @ManyToOne
    private Vacina vacina;

    private String datavacina;

    //o usuario pode receber varias aplicações
    @ManyToOne
    private Usuario usuario;

    public Aplicacao(String nomevacina, String datavacina, String usuario) { }

    public Aplicacao() {}

}

