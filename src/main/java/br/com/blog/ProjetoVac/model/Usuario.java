package br.com.blog.ProjetoVac.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Usuario {

        @Id
        private Long id;
        private String nome;
        private String email;
        private String cpf;
        private String senha;
        private Date datanascimento;

}

