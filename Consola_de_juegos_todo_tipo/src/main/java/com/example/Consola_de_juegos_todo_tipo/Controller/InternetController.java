package com.example.Consola_de_juegos_todo_tipo.Controller;

import com.example.Consola_de_juegos_todo_tipo.Model.Internet;
import com.example.Consola_de_juegos_todo_tipo.Service.InternetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class InternetController {

    @Autowired
    private InternetService internetService;

    @GetMapping
    public List<Internet> getAllInternet() { return internetService.findAll(); }

    @GetMapping("/{id}")
    public Internet getInternetById(@PathVariable Integer id) { return internetService.findById(id); }

    @PostMapping
    public Internet createInternet(@RequestBody Internet internet) { return internetService.save(internet); }

    @PutMapping("/{id}")
    public Internet updateInternet(@PathVariable Integer id, @RequestBody Internet internet) {
        internet.setId(id);
        return internetService.save(internet);
    }

    @DeleteMapping("/{id}")
    public void deleteInternet(@PathVariable Integer id) { internetService.deleteById(id); }
}
