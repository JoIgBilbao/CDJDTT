package com.example.Consola_de_juegos_todo_tipo.Service;

import com.example.Consola_de_juegos_todo_tipo.Model.Juegos;
import com.example.Consola_de_juegos_todo_tipo.Repository.JuegosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JuegosService {

    @Autowired
    private JuegosRepository juegosRepository;

    public List<Juegos> findAll() {
        return juegosRepository.findAll();
    }

    public Juegos findById(Integer id) {
        return juegosRepository.findById(id).orElse(null);
    }

    public Juegos save(Juegos juegos) {
        return juegosRepository.save(juegos);
    }

    public void deleteById(Integer id) {
        juegosRepository.deleteById(id);
    }
}
