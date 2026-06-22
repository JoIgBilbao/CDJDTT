package com.example.Consola_de_juegos_todo_tipo.Controller;

import com.example.Consola_de_juegos_todo_tipo.Model.Juegos;
import com.example.Consola_de_juegos_todo_tipo.Service.JuegosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/juegos")
public class JuegosController {


    @Autowired
    private JuegosService juegosService;

    @GetMapping
    public List<Juegos> getAllJuegos() {
        return juegosService.findAll();
    }

    @GetMapping("/{id}")
    public Juegos getJuegosById(@PathVariable Integer id) {
        return juegosService.findById(id);
    }

    @PostMapping
    public Juegos createJuegos(@RequestBody Juegos juegos) {
        return juegosService.save(juegos);
    }

    @PutMapping("/{id}")
    public Juegos updateJuegos(@PathVariable Integer id, @RequestBody Juegos juegos) {
        juegos.setId(id);
        return juegosService.save(juegos);
    }

    @DeleteMapping("/{id}")
    public void deleteJuegos(@PathVariable Integer id) {
        juegosService.deleteById(id);
    }
}
