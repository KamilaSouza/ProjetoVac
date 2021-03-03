package br.com.blog.ProjetoVac.controller;


import br.com.blog.ProjetoVac.model.Usuario;
import br.com.blog.ProjetoVac.repository.RepositoryUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/usuarios")

public class ControllerUsuario {

    @Autowired
    RepositoryUsuario repoUsuario;

    @PostMapping(consumes = "application/json")
    public ResponseEntity<?> adicionaUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioSalvo = repoUsuario.save(usuario);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().replacePath("/usuarios").path("/{id}")
                .buildAndExpand(usuarioSalvo.getId()).toUri();

                return ResponseEntity.created(uri).build();

    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listaUsuarios() {
        return ResponseEntity.ok().body(repoUsuario.findAll());

    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscaPorId(@PathVariable Long id) {
        return ResponseEntity.ok().body(repoUsuario.findById(id).get());
    }
}
