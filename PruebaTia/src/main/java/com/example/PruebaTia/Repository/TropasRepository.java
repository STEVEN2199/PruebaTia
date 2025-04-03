package com.example.PruebaTia.Repository;

import com.example.PruebaTia.Dtos.EnemigosDTO;
import com.example.PruebaTia.Model.Tropas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TropasRepository extends JpaRepository<Tropas, Long> {

    @Query(value = "SELECT P.potencia as potencia, T.frente as frente, SUM(T.numero_tropas) as numeroTropas FROM tbl_potencia P LEFT JOIN tbl_tropas T ON P.id_potencia = T.potencia_id " +
    "GROUP BY P.potencia, T.frente", nativeQuery = true)
    List<Object[]> getEnemigosReport();
}