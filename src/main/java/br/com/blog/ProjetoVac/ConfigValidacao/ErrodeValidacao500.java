package br.com.blog.ProjetoVac.ConfigValidacao;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Email ou CPF já cadastrados")
public class ErrodeValidacao500 extends RuntimeException {

    public ErrodeValidacao500(String message) {

        super(message);
    }
}
