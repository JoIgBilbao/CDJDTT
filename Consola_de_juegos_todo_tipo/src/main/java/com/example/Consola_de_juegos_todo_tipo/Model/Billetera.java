package com.example.Consola_de_juegos_todo_tipo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Billetera")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Billetera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int saldo;
    private Integer metodoPago;
    private String tarjeta;
}
