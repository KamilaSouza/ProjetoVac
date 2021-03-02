package br.com.blog.ProjetoVac.modelo;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.swing.*;
import java.util.Date;

@Entity
@Table
@Data
public class Usuario {

        private Long id;
        private Spring nome;
        private Spring email;
        private Spring cpf;
        private Spring senha;
        private Date datanascimento;

}

