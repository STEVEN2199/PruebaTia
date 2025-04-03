package com.example.PruebaTia.Service;

import com.example.PruebaTia.Model.Potencia;
import com.example.PruebaTia.Repository.PotenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PotenciaService {

    @Autowired
    PotenciaRepository potenciaRepository;
    public void saveOrUpdate(Potencia potencia) {
        potenciaRepository.save(potencia);
    }
}
