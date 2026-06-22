package com.example.Consola_de_juegos_todo_tipo.Repository;


import com.example.Consola_de_juegos_todo_tipo.Model.Juegos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JuegosRepository extends JpaRepository<Juegos, Integer> {
}
