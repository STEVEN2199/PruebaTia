package com.example.PruebaTia.Repository;

import com.example.PruebaTia.Model.Tropas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TropasRepository extends JpaRepository<Tropas, Long> {
}