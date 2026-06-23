package com.example.Consola_de_juegos_todo_tipo.Service;

import com.example.Consola_de_juegos_todo_tipo.Model.Comunidades;
import com.example.Consola_de_juegos_todo_tipo.Repository.ComunidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComunidadesService {

    @Autowired
    private ComunidadesRepository comunidadesRepository;

    public List<Comunidades> findAll() {
        return comunidadesRepository.findAll();
    }

    public Comunidades findById(Integer id) {
        return comunidadesRepository.findById(id).orElse(null);
    }

    public Comunidades save(Comunidades comunidades) {
        return comunidadesRepository.save(comunidades);
    }

    public void deleteById(Integer id) {
        comunidadesRepository.deleteById(id);
    }
}
