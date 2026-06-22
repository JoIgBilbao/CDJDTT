package com.example.Consola_de_juegos_todo_tipo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Tienda")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tienda {

    @Id
    private Integer id;
    private Integer idJuego;
    private int billetera;
    private Integer tarjeta;

}
