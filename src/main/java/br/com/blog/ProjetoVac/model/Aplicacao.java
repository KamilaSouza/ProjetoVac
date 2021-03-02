package br.com.blog.ProjetoVac.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import lombok.Data;

@Entity
@Table
@Data
public class Aplicacao {

    private Long id;
    private String email;
    private String nomevacina;
    private Date datavacina;

}
