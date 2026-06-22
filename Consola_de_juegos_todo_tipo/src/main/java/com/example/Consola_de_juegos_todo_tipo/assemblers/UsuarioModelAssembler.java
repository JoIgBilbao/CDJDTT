package com.example.Consola_de_juegos_todo_tipo.assemblers;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import com.example.Consola_de_juegos_todo_tipo.Controller.UsuarioController;
import com.example.Consola_de_juegos_todo_tipo.Model.Usuario;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class UsuarioModelAssembler implements RepresentationModelAssembler<Usuario, EntityModel<Usuario>> {

    @Override
    public EntityModel<Usuario> toModel(Usuario usuario) {
        return EntityModel.of(usuario,
                linkTo(methodOn(UsuarioController.class).getUsuarioById(usuario.getId())).withSelfRel(),
                linkTo(methodOn(UsuarioController.class).getAllUsuarios()).withRel("usuarios"));
    }
}