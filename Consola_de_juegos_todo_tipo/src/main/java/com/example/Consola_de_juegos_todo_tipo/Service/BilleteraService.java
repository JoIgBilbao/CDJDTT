package com.example.Consola_de_juegos_todo_tipo.Service;


import com.example.Consola_de_juegos_todo_tipo.Model.Billetera;
import com.example.Consola_de_juegos_todo_tipo.Repository.BilleteraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BilleteraService {

    @Autowired
    private BilleteraRepository billeteraRepository;

    public List<Billetera> findAll() {
        return billeteraRepository.findAll();
    }

    public Billetera findById(Integer id) {
        return billeteraRepository.findById(id).orElse(null);
    }

    public Billetera save(Billetera billetera) {
        return billeteraRepository.save(billetera);
    }

    public void deleteById(Integer id) {
        billeteraRepository.deleteById(id);
    }
}
