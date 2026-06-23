package com.example.Consola_de_juegos_todo_tipo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Comunidades")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comunidades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer idJuego;

    @Column(nullable = false)
    private String nombre;

    private String idusuario;

}
