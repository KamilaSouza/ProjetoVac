package br.com.blog.ProjetoVac.controller;

import br.com.blog.ProjetoVac.model.Aplicacao;
import br.com.blog.ProjetoVac.repository.RepositoryAplicacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/aplicacao")

public class ControllerAplicacao {

    @Autowired
    RepositoryAplicacao repoAplica;

    @PostMapping(consumes = "aplication/json")
    public ResponseEntity<?> adicionaAplicacao(@RequestBody Aplicacao aplicacao) {
        Aplicacao aplicacaoSalvo = repoAplica.save(aplicacao);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().replacePath("/aplicacao").path("/{id}")
                .buildAndExpand(aplicacaoSalvo.getId()).toUri();

        return ResponseEntity.created(uri).build();

    }

    @GetMapping
    public ResponseEntity<List<Aplicacao>> listaAplicacao() {
        return ResponseEntity.ok().body(repoAplica.findAll());

    }

    @GetMapping("/{id}")
    public ResponseEntity<Aplicacao> buscaPorId(@PathVariable Long id) {
        return ResponseEntity.ok().body(repoAplica.findById(id).get());
    }
}
