package com.example.inkafarma.model;

import jakarta.persistence.*;

@Entity
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String codigoEmpleado; // En la infografía figura como PK

    private String nombre;
    private String cargo;
    private String tienda; // Más adelante el inge seguro pedirá que esto sea un objeto Tienda con @ManyToOne
    private String turno;
    private Double sueldo;

    // Constructor vacío
    public Empleado() {
    }

    // Constructor con parámetros
    public Empleado(String codigoEmpleado, String nombre, String cargo, String tienda, String turno, Double sueldo) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.cargo = cargo;
        this.tienda = tienda;
        this.turno = turno;
        this.sueldo = sueldo;
    }

    // Métodos de negocio según infografía
    public void registrarAsistencia() {
        System.out.println("Asistencia registrada para el empleado: " + this.nombre);
    }

    public void procesarVenta() {
        System.out.println("Procesando venta en caja...");
    }

    public void abrirCaja() {
        System.out.println("Caja abierta para el turno: " + this.turno);
    }

    // Getters y Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getCodigoEmpleado() { return codigoEmpleado; }
    public void setCodigoEmpleado(String codigoEmpleado) { this.codigoEmpleado = codigoEmpleado; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public String getTienda() { return tienda; }
    public void setTienda(String tienda) { this.tienda = tienda; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }

    public Double getSueldo() { return sueldo; }
    public void setSueldo(Double sueldo) { this.sueldo = sueldo; }
}