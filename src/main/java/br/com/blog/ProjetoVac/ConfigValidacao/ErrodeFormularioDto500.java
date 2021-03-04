package br.com.blog.ProjetoVac.ConfigValidacao;

import lombok.Data;

@Data
public class ErrodeFormularioDto500 {

    private String campo;
    private String erro;


    public ErrodeFormularioDto500(String field, String mensagem) {
        this.campo = campo;
        this.erro = erro;
    }
}
