package com.example.Consola_de_juegos_todo_tipo.assembler;

import com.example.Consola_de_juegos_todo_tipo.Controller.UsuarioControllerv2;
import com.example.Consola_de_juegos_todo_tipo.Model.Usuario;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@Component
public class UsuarioModelAssembler implements RepresentationModelAssembler<Usuario, EntityModel<Usuario>>{

    @Override
    public EntityModel<Usuario> toModel(Usuario usuario) {
        return EntityModel.of(usuario,
                linkTo(methodOn(UsuarioControllerv2.class).getUsuarioById(usuario.getId())).withSelfRel(),
                linkTo(methodOn(UsuarioControllerv2.class).getAllUsuarios()).withRel("usuarios"));
    }
}
