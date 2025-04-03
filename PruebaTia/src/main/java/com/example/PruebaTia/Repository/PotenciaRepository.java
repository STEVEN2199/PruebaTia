package com.example.PruebaTia.Repository;

import com.example.PruebaTia.Model.Potencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PotenciaRepository extends JpaRepository<Potencia, Long> {

    Optional<Potencia> findByPotencia(String potencia);
}