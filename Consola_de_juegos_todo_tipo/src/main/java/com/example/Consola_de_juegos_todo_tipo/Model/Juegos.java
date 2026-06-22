package com.example.Consola_de_juegos_todo_tipo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Juegos")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Juegos {

    @Id
    private Integer id;
    private String nombreJuego;
    private String estadoJuego;
    private String correoJuego;


}
