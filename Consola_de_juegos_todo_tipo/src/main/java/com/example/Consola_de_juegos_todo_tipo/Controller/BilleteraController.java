package com.example.Consola_de_juegos_todo_tipo.Controller;

import com.example.Consola_de_juegos_todo_tipo.Model.Billetera;
import com.example.Consola_de_juegos_todo_tipo.Service.BilleteraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/billetera")
public class BilleteraController {

    @Autowired
    private BilleteraService billeteraService;

    @GetMapping
    public List<Billetera> getAllConsolas() {
        return billeteraService.findAll();
    }

    @GetMapping("/{id}")
    public Billetera getConsolasById(@PathVariable Integer id) {
        return billeteraService.findById(id);
    }

    @PostMapping
    public Billetera createConsolas(@RequestBody Billetera billetera) {
        return billeteraService.save(billetera);
    }

    @PutMapping("/{id}")
    public Billetera updateConsolas(@PathVariable Integer id, @RequestBody Billetera billetera) {
        billetera.setId(id);
        return billeteraService.save(billetera);
    }

    @DeleteMapping("/{id}")
    public void deleteConsolas(@PathVariable Integer id) {
        billeteraService.deleteById(id);
    }
}
