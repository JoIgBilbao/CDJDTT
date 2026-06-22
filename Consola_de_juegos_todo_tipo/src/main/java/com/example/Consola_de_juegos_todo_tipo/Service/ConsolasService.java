package com.example.Consola_de_juegos_todo_tipo.Service;

import com.example.Consola_de_juegos_todo_tipo.Model.Consolas;
import com.example.Consola_de_juegos_todo_tipo.Repository.ConsolasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsolasService {

    @Autowired
    private ConsolasRepository consolasRepository;

    public List<Consolas> findAll() {
        return consolasRepository.findAll();
    }

    public Consolas findById(Integer id) {
        return consolasRepository.findById(id).orElse(null);
    }

    public Consolas save(Consolas consolas) {
        return consolasRepository.save(consolas);
    }

    public void deleteById(Integer id) {
        consolasRepository.deleteById(id);
    }
}
