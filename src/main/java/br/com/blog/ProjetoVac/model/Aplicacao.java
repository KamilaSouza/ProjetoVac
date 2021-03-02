package br.com.blog.ProjetoVac.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import lombok.Data;

@Entity
@Data
public class Aplicacao {

    @Id
    private Long id;
    private String email;
    private String nomevacina;
    private Date datavacina;

}

