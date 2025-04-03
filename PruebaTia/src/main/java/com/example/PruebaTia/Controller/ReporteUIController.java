package com.example.PruebaTia.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class ReporteUIController {
    @GetMapping
    public String home(Model model){
        return "reporte";
    }
}
