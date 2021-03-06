package br.com.blog.ProjetoVac.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Usuario {

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nome;

        @Column (name = "email", unique = true)
        private String email;

        @Column(name = "cpf", unique = true)
        private String cpf;

        @Column(name="datanascimento")
        private String dataNascimento;

}

