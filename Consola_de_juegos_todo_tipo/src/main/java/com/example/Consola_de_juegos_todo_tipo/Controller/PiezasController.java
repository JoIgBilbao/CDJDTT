package com.example.Consola_de_juegos_todo_tipo.Controller;

import com.example.Consola_de_juegos_todo_tipo.Model.Piezas;
import com.example.Consola_de_juegos_todo_tipo.Service.PiezasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/piezas")
public class PiezasController {

    @Autowired
    private PiezasService piezasService;

    @GetMapping
    public List<Piezas> getAllJuegos() {
        return piezasService.findAll();
    }

    @GetMapping("/{id}")
    public Piezas getPiezasById(@PathVariable Integer id) {
        return piezasService.findById(id);
    }

    @PostMapping
    public Piezas createPiezas(@RequestBody Piezas piezas) {
        return piezasService.save(piezas);
    }

    @PutMapping("/{id}")
    public Piezas updatePiezas(@PathVariable Integer id, @RequestBody Piezas piezas) {
        piezas.setId(id);
        return piezasService.save(piezas);
    }

    @DeleteMapping("/{id}")
    public void deleteMando(@PathVariable Integer id) {
        piezasService.deleteById(id);
    }
}
