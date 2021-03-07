package br.com.blog.ProjetoVac.controller;

import br.com.blog.ProjetoVac.controller.dto.AplicacaoDto;
import br.com.blog.ProjetoVac.controller.form.AplicacaoForm;
import br.com.blog.ProjetoVac.model.Aplicacao;
import br.com.blog.ProjetoVac.repository.AplicacaoRepository;
import br.com.blog.ProjetoVac.repository.UsuarioRepository;
import br.com.blog.ProjetoVac.repository.VacinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/aplicacao")

public class AplicacaoController {

    @Autowired
    private AplicacaoRepository aplicacaoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private VacinaRepository vacinaRepository;

    @PostMapping(consumes = "application/json")
    public ResponseEntity<AplicacaoDto> adicionaAplicacao(@RequestBody @Valid AplicacaoForm aplicacaoForm, UriComponentsBuilder uriBuilder) {

        Aplicacao aplicacao = aplicacaoForm.converterUsuario(usuarioRepository);
        aplicacaoForm.converterVacina(vacinaRepository);
        aplicacao.setVacina(vacinaRepository.findByNome(aplicacaoForm.getNomevacina()));
        aplicacao.setDatavacina(aplicacaoForm.getDatavacina());
        aplicacao.setUsuario(usuarioRepository.findByEmail(aplicacaoForm.getEmail()));
        aplicacaoRepository.save(aplicacao);

        URI uri = uriBuilder.path("/aplicacao/{id}").buildAndExpand(aplicacao.getId()).toUri();

        return ResponseEntity.created(uri).body(new AplicacaoDto(aplicacao));


    }

    @GetMapping
    public ResponseEntity<List<Aplicacao>> listaAplicacao() {
        return ResponseEntity.ok().body(aplicacaoRepository.findAll());

    }

    @GetMapping("/{id}")
    public ResponseEntity<Aplicacao> buscaPorId(@PathVariable Long id) {
        return ResponseEntity.ok().body(aplicacaoRepository.findById(id).get());
    }
}
