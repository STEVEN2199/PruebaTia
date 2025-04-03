package com.example.PruebaTia.Controller;

import com.example.PruebaTia.Model.Potencia;
import com.example.PruebaTia.Model.Tropas;
import com.example.PruebaTia.Repository.PotenciaRepository;
import com.example.PruebaTia.Service.PotenciaService;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/Potencia")
public class PotenciaController {

    @Autowired
    private PotenciaService potenciaService;
    @Autowired
    PotenciaRepository potenciaRepository;

    @PostMapping("/enemigos")
    public void guardarPotencia(@RequestBody Potencia potencia) {
        potenciaService.saveOrUpdate(potencia);
    }

}