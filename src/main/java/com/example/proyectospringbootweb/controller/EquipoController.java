package com.example.proyectospringbootweb.controller;

import com.example.proyectospringbootweb.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/equipos")
public class EquipoController {

    private final EquipoRepository equipoRepository;

    @Autowired
    public EquipoController(EquipoRepository equipoRepository) {
        this.equipoRepository = equipoRepository;
    }

    @GetMapping
    public String listaEquipos(Model model) {
        model.addAttribute("equipos", equipoRepository.findAll());
        return "equipo/lista";
    }

    // Otros métodos para inserción, modificación y borrado de equipos
    // ...
}