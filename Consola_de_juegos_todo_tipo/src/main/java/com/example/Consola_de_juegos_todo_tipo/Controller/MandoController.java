package com.example.Consola_de_juegos_todo_tipo.Controller;


import com.example.Consola_de_juegos_todo_tipo.Model.Mando;
import com.example.Consola_de_juegos_todo_tipo.Service.MandoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mando")
public class MandoController {

    @Autowired
    private MandoService mandoService;

    @GetMapping
    public List<Mando> getAllJuegos() {
        return mandoService.findAll();
    }

    @GetMapping("/{id}")
    public Mando getMandoById(@PathVariable Integer id) {
        return mandoService.findById(id);
    }

    @PostMapping
    public Mando createMando(@RequestBody Mando mando) {
        return mandoService.save(mando);
    }

    @PutMapping("/{id}")
    public Mando updateMando(@PathVariable Integer id, @RequestBody Mando mando) {
        mando.setId(id);
        return mandoService.save(mando);
    }

    @DeleteMapping("/{id}")
    public void deleteMando(@PathVariable Integer id) {
        mandoService.deleteById(id);
    }
}
