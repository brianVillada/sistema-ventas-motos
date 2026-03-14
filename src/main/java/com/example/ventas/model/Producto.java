package com.example.ventas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private double precio;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

}