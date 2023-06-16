package com.example.proyectospringbootweb.service;

import com.example.proyectospringbootweb.model.Equipo;
import com.example.proyectospringbootweb.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipoService {
    private final EquipoRepository equipoRepository;

    @Autowired
    public EquipoService(EquipoRepository equipoRepository) {
        this.equipoRepository = equipoRepository;
    }

    public List<Equipo> getAllEquipos() {
        return equipoRepository.findAll();
    }

    public Equipo getEquipoById(int equipoId) {
        Optional<Equipo> optionalEquipo = equipoRepository.findById((long) equipoId);
        return optionalEquipo.orElse(null);
    }

    public Equipo addEquipo(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    public Equipo updateEquipo(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    public void deleteEquipo(int equipoId) {
        equipoRepository.deleteById((long) equipoId);
    }
}
