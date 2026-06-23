package com.example.Consola_de_juegos_todo_tipo.Controller;


import com.example.Consola_de_juegos_todo_tipo.Model.Comunidades;
import com.example.Consola_de_juegos_todo_tipo.Service.ComunidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comunidades")
public class ComunidadesController {

    @Autowired
    private ComunidadesService comunidadesService;

    @GetMapping
    public List<Comunidades> getAllComunidades() { return comunidadesService.findAll(); }

    @GetMapping("/{id}")
    public Comunidades getComunidadesById(@PathVariable Integer id) { return comunidadesService.findById(id); }

    @PostMapping
    public Comunidades createComunidades(@RequestBody Comunidades comunidades) { return comunidadesService.save(comunidades); }

    @PutMapping("/{id}")
    public Comunidades updateComunidades(@PathVariable Integer id, @RequestBody Comunidades comunidades) {
        comunidades.setId(id);
        return comunidadesService.save(comunidades);
    }

    @DeleteMapping("/{id}")
    public void deleteComunidades(@PathVariable Integer id) { comunidadesService.deleteById(id); }
}
