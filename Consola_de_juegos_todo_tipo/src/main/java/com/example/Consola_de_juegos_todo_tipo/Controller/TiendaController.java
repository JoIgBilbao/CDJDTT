package com.example.Consola_de_juegos_todo_tipo.Controller;

import com.example.Consola_de_juegos_todo_tipo.Model.Usuario;
import com.example.Consola_de_juegos_todo_tipo.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class TiendaController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAllUsuario() { return usuarioService.findAll(); }

    @GetMapping("/{id}")
    public Usuario getUsuarioById(@PathVariable Integer id) { return usuarioService.findById(id); }

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) { return usuarioService.save(usuario); }

    @PutMapping("/{id}")
    public Usuario updateUsuario(@PathVariable Integer id, @RequestBody Usuario usuario) {
        usuario.setId(id);
        return usuarioService.save(usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Integer id) { usuarioService.deleteById(id); }
}
