package br.com.blog.ProjetoVac.controller;


import br.com.blog.ProjetoVac.controller.dto.UsuarioDto;
import br.com.blog.ProjetoVac.controller.form.UsuarioForm;
import br.com.blog.ProjetoVac.model.Usuario;
import br.com.blog.ProjetoVac.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/usuarios")

public class ControllerUsuario {

    @Autowired
    private UsuarioRepository repoUsuario;

    @PostMapping(consumes = "application/json")
    public ResponseEntity<UsuarioDto> adicionaUsuario(@RequestBody @Valid UsuarioForm usuarioForm, UriComponentsBuilder uriBuilder) {
        Usuario usuario = new Usuario();
        usuario.setCpf(usuarioForm.getCpf());
        usuario.setEmail(usuarioForm.getEmail());
        usuario.setNome(usuarioForm.getNome());
        usuario.setDataNascimento(usuarioForm.getDataNascimento());
        repoUsuario.save(usuario);

        URI uri = uriBuilder.path("/usuarios/{id}").buildAndExpand(usuario.getId()).toUri();

        return ResponseEntity.created(uri).body(new UsuarioDto(usuario));

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
