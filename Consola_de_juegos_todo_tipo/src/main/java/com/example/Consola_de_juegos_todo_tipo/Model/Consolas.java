package com.example.Consola_de_juegos_todo_tipo.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;


@Entity
@Table(name = "Consolas")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Consolas {

    @Id
    private Integer id;
    private Integer nombre_consola;
    private Integer piezas;
    private String estado_consola;
    private String categoria_consola;
    private String id_internet;

}
