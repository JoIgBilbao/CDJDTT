package com.example.Consola_de_juegos_todo_tipo.Service;

import com.example.Consola_de_juegos_todo_tipo.Model.Tienda;
import com.example.Consola_de_juegos_todo_tipo.Repository.TiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TiendaService {

    @Autowired
    private TiendaRepository tiendaRepository;

    public List<Tienda> findAll() { return tiendaRepository.findAll(); }

    public Tienda findById(Integer id) { return tiendaRepository.findById(id).orElse(null); }

    public Tienda save(Tienda tienda) { return tiendaRepository.save(tienda); }

    public void deleteById(Integer id) { tiendaRepository.deleteById(id); }
}
