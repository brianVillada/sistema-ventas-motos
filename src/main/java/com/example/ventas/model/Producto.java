package com.example.ventas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id;

    private String nombre;

    private double precio;

    private String codigo;

    private boolean activo;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @OneToOne(mappedBy = "producto")
    private Inventario inventario;
}
