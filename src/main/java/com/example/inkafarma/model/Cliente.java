package com.example.inkafarma.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String dni;

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private LocalDate fechaNacimiento;
    private Integer puntosBeneficio;

    // Constructor vacío exigido por JPA
    public Cliente() {
    }

    // Constructor con parámetros
    public Cliente(String dni, String nombre, String apellido, String email, String telefono, LocalDate fechaNacimiento, Integer puntosBeneficio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.puntosBeneficio = puntosBeneficio;
    }

    // Métodos de negocio según infografía
    public void acumularPuntos(int puntos) {
        if (this.puntosBeneficio == null) this.puntosBeneficio = 0;
        this.puntosBeneficio += puntos;
    }

    public void canjearPuntos(int puntos) {
        if (this.puntosBeneficio != null && this.puntosBeneficio >= puntos) {
            this.puntosBeneficio -= puntos;
        }
    }

    public List<String> obtenerHistorial() {
        // Lógica simulada por ahora
        return new ArrayList<>();
    }

    // Getters y Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public Integer getPuntosBeneficio() { return puntosBeneficio; }
    public void setPuntosBeneficio(Integer puntosBeneficio) { this.puntosBeneficio = puntosBeneficio; }
}