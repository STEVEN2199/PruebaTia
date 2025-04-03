package com.example.PruebaTia.Service;


import com.example.PruebaTia.Dtos.TropasRequestDTO;
import com.example.PruebaTia.Model.Potencia;
import com.example.PruebaTia.Model.Tropas;
import com.example.PruebaTia.Repository.PotenciaRepository;
import com.example.PruebaTia.Repository.TropasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TropasService {

    @Autowired
    TropasRepository tropasRepository;

    private final PotenciaRepository potenciaRepository;

    public TropasService(PotenciaRepository potenciaRepository) {
        this.potenciaRepository = potenciaRepository;
    }

    public void saveOrUpdate(TropasRequestDTO tropasRequestDTO) {
        Potencia potencia = potenciaRepository.findByPotencia(tropasRequestDTO.getPotencia()).orElseGet(null);
        Tropas tropas = new Tropas();
        tropas.setNumeroTropas(tropasRequestDTO.getNumeroTropas());
        tropas.setFrente(tropasRequestDTO.getFrente());
        tropas.setHoraDespliegue(tropasRequestDTO.getHoraDespliegue());
        tropas.setTipoTropas(tropasRequestDTO.getTipoTropas());
        tropas.setPotenciaId(potencia.getidPotencia());

        tropasRepository.save(tropas);
    }
}

