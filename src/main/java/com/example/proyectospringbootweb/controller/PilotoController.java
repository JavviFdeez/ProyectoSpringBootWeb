package com.example.proyectospringbootweb.controller;

import com.example.proyectospringbootweb.repository.PilotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/piloto")
public class PilotoController {

    private final PilotoRepository pilotoRepository;

    @Autowired
    public PilotoController(PilotoRepository pilotoRepository) {
        this.pilotoRepository = pilotoRepository;
    }

    @GetMapping
    public String listaPilotos(Model model) {
        model.addAttribute("pilotos", pilotoRepository.findAll());
        return "piloto/lista";
    }

    // Otros métodos para inserción, modificación y borrado de pilotos
    // ...
}
