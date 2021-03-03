package br.com.blog.ProjetoVac.model;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Data
public class Usuario {

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotNull @NotBlank(message = "Campo nome é obrigatório")
        private String nome;

        @NotNull @Email @NotBlank(message = "Campo email é obrigatório")
        private String email;

        @NotNull @CPF @NotBlank(message = "Campo cpf é obrigatório")
        private String cpf;

        @NotNull @NotBlank(message = "Campo data de nascimento é obrigatório: dd/mm/aaaa")
        private String datanascimento;


}

