package com.example.Consola_de_juegos_todo_tipo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Internet")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Internet {

    @Id
    private Integer id;
    private String tipo;
    private String descripcion;
    private String categoria;
    private String estado;
}
