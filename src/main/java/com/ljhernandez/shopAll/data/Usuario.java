package com.ljhernandez.shopAll.data;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @Column(name = "idUsuario", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    @Column(name ="nombre", nullable = false, length = 45)
    private String nombre;

    @Column(name ="apellidoPaterno", nullable = false, length = 45)
    private String apellidoPaterno;

    @Column(name ="apellidoMaterno", nullable = false, length = 45)
    private String apellidoMaterno;

    @Column(name ="correo", nullable = false, unique = true, length = 45)
    private String correo;

    @Column(name ="contrasena", nullable = false, length = 45)
    private String contrasena;

    @Column(name ="tipoUsuario", nullable = false, length = 45)
    private String tipoUsuario;


} // Fin de la clase Usuario
