package br.com.blog.ProjetoVac.ConfigValidacao;

import lombok.Data;

@Data
public class ErroDeFormularioDto400 {

    private String campo;
    private String erro;

    public ErroDeFormularioDto400(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;

    }
}
