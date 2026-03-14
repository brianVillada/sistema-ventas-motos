package com.example.ventas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;

    private String nombre;

    private String correo;

    private String password;

    private boolean activo;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Role rol;

    public Usuario() {
    }
}
