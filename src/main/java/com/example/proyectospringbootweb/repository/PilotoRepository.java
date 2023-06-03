package com.example.proyectospringbootweb.repository;

import com.example.proyectospringbootweb.model.Piloto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotoRepository extends JpaRepository<Piloto, Long> {
    // Métodos adicionales del repositorio, si es necesario
}
