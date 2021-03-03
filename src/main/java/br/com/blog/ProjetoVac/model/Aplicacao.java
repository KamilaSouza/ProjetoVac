package br.com.blog.ProjetoVac.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import com.sun.istack.NotNull;
import lombok.Data;

@Entity
@Data
public class Aplicacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull @Email @NotBlank(message = "Campo email é obrigatório")
    private String email;

    @NotNull @NotBlank(message = "O nome da vacina é obrigatório")
    private String nomevacina;

    @NotNull @NotBlank(message = "A data da aplicação da vacina é obrigatório: dd/mm/aaaa")
    private String datavacina;

}

