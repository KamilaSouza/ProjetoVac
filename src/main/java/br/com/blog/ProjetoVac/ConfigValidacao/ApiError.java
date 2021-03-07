package br.com.blog.ProjetoVac.ConfigValidacao;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ApiError {
    private final HttpStatus status;
    private final String message;

    public ApiError(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }
}

