package br.com.blog.ProjetoVac.ConfigValidacao;

import lombok.Getter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ValidacaoException extends Exception{

    @ExceptionHandler({Exception.class})
    private ResponseEntity<Object> serviceException(Exception ex) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        if (ex.getMessage().contains("CPF")) {
            String message = "CPF já cadastrado";
            ApiError apiError = new ApiError(status, message);
            return new ResponseEntity<>(apiError, new HttpHeaders(), apiError.getStatus());
        } else {

            String message = "Email já cadastrado";
            ApiError apiError = new ApiError(status, message);
            return new ResponseEntity<>(apiError, new HttpHeaders(), apiError.getStatus());
        }
    }

    @Getter
    public static class Error {
        private String message;

        Error(String message) {
            this.message = message;
        }
    }

}
