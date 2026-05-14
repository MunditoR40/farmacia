package com.example.inkafarma.model;

import jakarta.persistence.*;

@Entity
public class Tienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String codigoTienda; // En la infografía figura como PK

    private String distrito;
    private String region;
    private String horarioAtencion;
    private Integer capacidadStock;
    private Integer cajasRegistradoras;

    // Constructor vacío
    public Tienda() {
    }

    // Constructor con parámetros
    public Tienda(String codigoTienda, String distrito, String region, String horarioAtencion, Integer capacidadStock, Integer cajasRegistradoras) {
        this.codigoTienda = codigoTienda;
        this.distrito = distrito;
        this.region = region;
        this.horarioAtencion = horarioAtencion;
        this.capacidadStock = capacidadStock;
        this.cajasRegistradoras = cajasRegistradoras;
    }

    // Métodos de negocio según infografía
    public void abrirTienda() {
        System.out.println("Tienda " + this.codigoTienda + " abierta en horario: " + this.horarioAtencion);
    }

    public void generarReporteDiario() {
        System.out.println("Generando reporte de ventas para la tienda de " + this.distrito);
    }

    public void transferirStock() {
        System.out.println("Iniciando transferencia de stock...");
    }

    // Getters y Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getCodigoTienda() { return codigoTienda; }
    public void setCodigoTienda(String codigoTienda) { this.codigoTienda = codigoTienda; }

    public String getDistrito() { return distrito; }
    public void setDistrito(String distrito) { this.distrito = distrito; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public String getHorarioAtencion() { return horarioAtencion; }
    public void setHorarioAtencion(String horarioAtencion) { this.horarioAtencion = horarioAtencion; }

    public Integer getCapacidadStock() { return capacidadStock; }
    public void setCapacidadStock(Integer capacidadStock) { this.capacidadStock = capacidadStock; }

    public Integer getCajasRegistradoras() { return cajasRegistradoras; }
    public void setCajasRegistradoras(Integer cajasRegistradoras) { this.cajasRegistradoras = cajasRegistradoras; }
}