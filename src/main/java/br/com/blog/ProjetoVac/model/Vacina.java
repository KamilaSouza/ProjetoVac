package br.com.blog.ProjetoVac.model;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Vacina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(name = "data")
    private LocalDateTime dataCadastro;

}
