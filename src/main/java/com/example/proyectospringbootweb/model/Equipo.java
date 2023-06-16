package com.example.proyectospringbootweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreEquipo;
    private String nombrePiloto1;
    private String nombrePiloto2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombrePiloto1() {
        return nombrePiloto1;
    }

    public void setNombrePiloto1(String nombrePiloto1) {
        this.nombrePiloto1 = nombrePiloto1;
    }

    public String getNombrePiloto2() {
        return nombrePiloto2;
    }

    public void setNombrePiloto2(String nombrePiloto2) {
        this.nombrePiloto2 = nombrePiloto2;
    }
}