package com.example.proyectospringbootweb.model;

import jakarta.persistence.*;


@Entity
@Table(name = "equipos")
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "anio_fundacion")
    private int anioFundacion;

    @Column(name = "numero_titulos")
    private int numeroTitulos;

    // Constructor vacío
    public Equipo() {
    }

    // Constructor con parámetros
    public Equipo(String nombre, int anioFundacion, int numeroTitulos) {
        this.nombre = nombre;
        this.anioFundacion = anioFundacion;
        this.numeroTitulos = numeroTitulos;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioFundacion() {
        return anioFundacion;
    }

    public void setAnioFundacion(int anioFundacion) {
        this.anioFundacion = anioFundacion;
    }

    public int getNumeroTitulos() {
        return numeroTitulos;
    }

    public void setNumeroTitulos(int numeroTitulos) {
        this.numeroTitulos = numeroTitulos;
    }
}