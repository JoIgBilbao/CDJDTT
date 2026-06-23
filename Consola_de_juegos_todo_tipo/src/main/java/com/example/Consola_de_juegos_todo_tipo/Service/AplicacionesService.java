package com.example.Consola_de_juegos_todo_tipo.Service;

import com.example.Consola_de_juegos_todo_tipo.Model.Aplicaciones;
import com.example.Consola_de_juegos_todo_tipo.Repository.AplicacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AplicacionesService {

    @Autowired
    private AplicacionesRepository aplicacionesRepository;

    public List<Aplicaciones> findAll() { return aplicacionesRepository.findAll(); }

    public Aplicaciones findById(Integer id) { return aplicacionesRepository.findById(id).orElse(null); }

    public Aplicaciones save(Aplicaciones aplicaciones) { return aplicacionesRepository.save(aplicaciones); }

    public void deleteById(Integer id) { aplicacionesRepository.deleteById(id); }
}
