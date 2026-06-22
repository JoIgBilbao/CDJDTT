package com.example.Consola_de_juegos_todo_tipo.Service;

import com.example.Consola_de_juegos_todo_tipo.Model.Piezas;
import com.example.Consola_de_juegos_todo_tipo.Repository.PiezasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PiezasService {

    @Autowired
    private PiezasRepository piezasRepository;

    public List<Piezas> findAll() {
        return piezasRepository.findAll();
    }

    public Piezas findById(Integer id) {
        return piezasRepository.findById(id).orElse(null);
    }

    public Piezas save(Piezas piezas) {
        return piezasRepository.save(piezas);
    }

    public void deleteById(Integer id) {
        piezasRepository.deleteById(id);
    }
}
