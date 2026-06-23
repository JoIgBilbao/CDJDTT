package com.example.Consola_de_juegos_todo_tipo.Service;

import com.example.Consola_de_juegos_todo_tipo.Model.Internet;
import com.example.Consola_de_juegos_todo_tipo.Repository.InternetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternetService {

    @Autowired
    private InternetRepository internetRepository;

    public List<Internet> findAll() { return internetRepository.findAll(); }

    public Internet findById(Integer id) { return internetRepository.findById(id).orElse(null); }

    public Internet save(Internet internet) { return internetRepository.save(internet); }

    public void deleteById(Integer id) { internetRepository.deleteById(id); }
}
