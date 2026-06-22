package com.example.Consola_de_juegos_todo_tipo.Repository;

import com.example.Consola_de_juegos_todo_tipo.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
