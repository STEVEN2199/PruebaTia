package com.example.PruebaTia.Controller;

import com.example.PruebaTia.Service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;
import java.io.IOException;

@Controller // Cambiado a @Controller
public class ReporteController {

    @Autowired
    private ReporteService reporteService;

    @GetMapping("/reporte")
    public String mostrarPaginaReporte(Model model) {
        model.addAttribute("mensaje", "Generar Reporte Excel");
        return "reporte"; // Nombre del archivo Thymeleaf (reporte.html)
    }

    @GetMapping("/descargarReporte")
    public ResponseEntity<Resource> descargarReporte() throws IOException {
        String filePath = "reporte_enemigo.xlsx";
        reporteService.generarReporte(filePath);

        File file = new File(filePath);
        Resource resource = new FileSystemResource(file);

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=reporte_enemigo.xlsx");

        return ResponseEntity.ok()
                .headers(headers)
                .contentLength(file.length())
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(resource);
    }
}
