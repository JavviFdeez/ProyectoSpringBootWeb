package com.example.proyectospringbootweb.repository;

import com.example.proyectospringbootweb.model.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Long> {
    // Métodos adicionales del repositorio, si es necesario
}
