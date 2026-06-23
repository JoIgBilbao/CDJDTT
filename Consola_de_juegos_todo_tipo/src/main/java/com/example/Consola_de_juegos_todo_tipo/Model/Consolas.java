package com.example.Consola_de_juegos_todo_tipo.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Consolas")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Consolas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer nombre_consola;

    private Integer piezas;

    private String estado_consola;

    private String categoria_consola;

    private String id_internet;

    private String id_usuario;

}
