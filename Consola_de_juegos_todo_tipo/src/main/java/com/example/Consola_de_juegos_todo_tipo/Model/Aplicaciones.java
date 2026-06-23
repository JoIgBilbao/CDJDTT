package com.example.Consola_de_juegos_todo_tipo.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Aplicaciones")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aplicaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tipo;
    private String nombre;
    private String descripcion;
    private String categoria;
}
