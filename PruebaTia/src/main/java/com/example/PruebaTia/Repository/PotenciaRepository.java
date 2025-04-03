package com.example.PruebaTia.Repository;

import com.example.PruebaTia.Model.Potencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PotenciaRepository extends JpaRepository<Potencia, Long> {
}