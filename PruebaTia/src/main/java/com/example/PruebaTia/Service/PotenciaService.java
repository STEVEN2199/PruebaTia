package com.example.PruebaTia.Service;

import com.example.PruebaTia.Model.Potencia;
import com.example.PruebaTia.Repository.PotenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PotenciaService {

    @Autowired
    PotenciaRepository potenciaRepository;
    public void saveOrUpdate(Potencia potencia) {
        Optional<Potencia> potenciaFinded = potenciaRepository.findByPotencia(potencia.getpotencia());
        if(potenciaFinded.isPresent()) {
            return;
        }
        potenciaRepository.save(potencia);
    }
}
