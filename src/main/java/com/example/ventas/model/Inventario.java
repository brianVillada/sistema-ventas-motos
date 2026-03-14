package com.example.ventas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inventario")
    private Long id;

    private int cantidad;

    private String ubicacion;

    @OneToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;
}
