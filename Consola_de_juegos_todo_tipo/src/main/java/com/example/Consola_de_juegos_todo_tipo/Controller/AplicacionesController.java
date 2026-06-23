package com.example.Consola_de_juegos_todo_tipo.Controller;


import com.example.Consola_de_juegos_todo_tipo.Model.Aplicaciones;
import com.example.Consola_de_juegos_todo_tipo.Service.AplicacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/aplicaciones")
public class AplicacionesController {

    @Autowired
    private AplicacionesService aplicacionesService;

    @GetMapping
    public List<Aplicaciones> getAllAplicaciones() { return aplicacionesService.findAll(); }

    @GetMapping("/{id}")
    public Aplicaciones getAplicacionesById(@PathVariable Integer id) { return aplicacionesService.findById(id); }

    @PostMapping
    public Aplicaciones createAplicaciones(@RequestBody Aplicaciones aplicaciones) { return aplicacionesService.save(aplicaciones); }

    @PutMapping("/{id}")
    public Aplicaciones updateAplicaciones(@PathVariable Integer id, @RequestBody Aplicaciones aplicaciones) {
        aplicaciones.setId(id);
        return aplicacionesService.save(aplicaciones);
    }

    @DeleteMapping("/{id}")
    public void deleteAplicaciones(@PathVariable Integer id) { aplicacionesService.deleteById(id); }
}
