package com.example.Consola_de_juegos_todo_tipo.Service;

import com.example.Consola_de_juegos_todo_tipo.Model.Mando;
import com.example.Consola_de_juegos_todo_tipo.Repository.MandoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MandoService {

    @Autowired
    private MandoRepository mandoRepository;

    public List<Mando> findAll() {
        return mandoRepository.findAll();
    }

    public Mando findById(Integer id) {
        return mandoRepository.findById(id).orElse(null);
    }

    public Mando save(Mando mando) {
        return mandoRepository.save(mando);
    }

    public void deleteById(Integer id) {
        mandoRepository.deleteById(id);
    }
}
