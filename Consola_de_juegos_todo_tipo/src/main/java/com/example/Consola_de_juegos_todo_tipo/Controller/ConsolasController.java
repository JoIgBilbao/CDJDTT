package com.example.Consola_de_juegos_todo_tipo.Controller;


import com.example.Consola_de_juegos_todo_tipo.Model.Consolas;
import com.example.Consola_de_juegos_todo_tipo.Service.ConsolasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consola")
public class ConsolasController {

    @Autowired
    private ConsolasService consolasService;

    @GetMapping
    public List<Consolas> getAllConsolas() {
        return consolasService.findAll();
    }

    @GetMapping("/{id}")
    public Consolas getConsolasById(@PathVariable Integer id) {
        return consolasService.findById(id);
    }

    @PostMapping
    public Consolas createConsolas(@RequestBody Consolas consolas) {
        return consolasService.save(consolas);
    }

    @PutMapping("/{id}")
    public Consolas updateConsolas(@PathVariable Integer id, @RequestBody Consolas consolas) {
        consolas.setId(id);
        return consolasService.save(consolas);
    }

    @DeleteMapping("/{id}")
    public void deleteConsolas(@PathVariable Integer id) {
        consolasService.deleteById(id);
    }
}
