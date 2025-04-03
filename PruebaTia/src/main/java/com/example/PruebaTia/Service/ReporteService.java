package com.example.PruebaTia.Service;

import com.example.PruebaTia.Dtos.EnemigosDTO;
import com.example.PruebaTia.Dtos.TropasRequestDTO;
import com.example.PruebaTia.Model.*;
import com.example.PruebaTia.Repository.TropasRepository;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Service
public class ReporteService {
    @Autowired
    private TropasRepository tropasRepo;

    public void generarReporte(String filePath) throws IOException { // Método actualizado para aceptar String
//        List<Tropas> tropas = tropasRepo.findAll();
//        List<EnemigosDTO> enemigosDTOS = tropasRepo.getEnemigosReport();
        List<Object[]> resultados = tropasRepo.getEnemigosReport();
        List<EnemigosDTO> enemigosDTOS = resultados.stream()
                .map(r -> new EnemigosDTO(
                        (String) r[0],  // potencia
                        (String) r[1],  // frente
                        ((Number) r[2]).longValue() // numeroTropas
                ))
                .toList();
        Workbook workbook = new XSSFWorkbook();

        Sheet sheet = workbook.createSheet("Reporte Tropas");

        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("Potencia");
        header.createCell(1).setCellValue("Frente");
        header.createCell(2).setCellValue("Total de Tropas");

        int rowNum = 1;
        for (EnemigosDTO e : enemigosDTOS) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(e.getPotencia() != null ? e.getPotencia() : "0");
            row.createCell(1).setCellValue(e.getFrente() != null ? e.getFrente() : "0");
            row.createCell(2).setCellValue(e.getNumeroTropas() != null ? e.getNumeroTropas().toString() : "0");
        }

        FileOutputStream fileOut = new FileOutputStream(filePath); // Usa el filePath pasado como argumento
        workbook.write(fileOut);
        fileOut.close();
        workbook.close();
    }
}