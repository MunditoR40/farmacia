package com.example.inkafarma.model;

import jakarta.persistence.*;

@Entity
public class Producto {
    @Id         //clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto incremental
    private long id;

    @Column(nullable = false, unique = true) //este atributo es único y no vacío
    private String codigo;

    private String nombre;
    private Double precio;
    private Integer stock;
    private Boolean requiereReceta;

    //constructor
    public Producto(){

    }

    //constructor con parametro

    public Producto(String codigo, String nombre, Double precio, Integer stock, Boolean requiereReceta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.requiereReceta = requiereReceta;
    }


    //métodos

    public boolean verificarStock(){
        return this.stock > 0;
    }

    // Getters and setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Boolean getRequiereReceta() {
        return requiereReceta;
    }

    public void setRequiereReceta(Boolean requiereReceta) {
        this.requiereReceta = requiereReceta;
    }
}

