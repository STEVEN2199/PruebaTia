package com.example.PruebaTia.Service;


import com.example.PruebaTia.Model.Tropas;
import com.example.PruebaTia.Repository.TropasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TropasService {

    @Autowired
    TropasRepository tropasRepository;

    public void saveOrUpdate(Tropas tropas) {
        tropasRepository.save(tropas);
    }
}

