package com.example.proyectospringbootweb.controller;

import com.example.proyectospringbootweb.model.Equipo;
import com.example.proyectospringbootweb.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/equipos")
public class EquipoController {
    @Autowired
    private EquipoRepository equipoRepository;

    @GetMapping
    public List<Equipo> obtenerEquipos() {
        return equipoRepository.findAll();
    }

    @PostMapping
    public Equipo agregarEquipo(@RequestBody Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Equipo> editarEquipo(@PathVariable Long id, @RequestBody Equipo equipoActualizado) {
        Optional<Equipo> optionalEquipo = equipoRepository.findById(id);
        if (optionalEquipo.isPresent()) {
            Equipo equipo = optionalEquipo.get();
            equipo.setNombreEquipo(equipoActualizado.getNombreEquipo());
            equipo.setNombrePiloto1(equipoActualizado.getNombrePiloto1());
            equipo.setNombrePiloto2(equipoActualizado.getNombrePiloto2());
            Equipo equipoActualizadoDB = equipoRepository.save(equipo);
            return ResponseEntity.ok(equipoActualizadoDB);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

