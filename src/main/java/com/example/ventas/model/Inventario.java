package com.example.ventas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int cantidad;

    @OneToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

}
