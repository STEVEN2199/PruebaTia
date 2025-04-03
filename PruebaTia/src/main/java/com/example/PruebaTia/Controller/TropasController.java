package com.example.PruebaTia.Controller;

import com.example.PruebaTia.Dtos.TropasRequestDTO;
import com.example.PruebaTia.Model.Tropas;
import com.example.PruebaTia.Repository.TropasRepository;
import com.example.PruebaTia.Service.TropasService;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/v1/Tropa")
public class TropasController {
    @Autowired
    private TropasService tropasService;
    @Autowired
    TropasRepository tropasRepository;

    @PostMapping("/tropas")
    public void saveUpdate(@RequestBody TropasRequestDTO tropasRequestDTO) {
        System.out.println(tropasRequestDTO);
        tropasService.saveOrUpdate(tropasRequestDTO);
    }
}
