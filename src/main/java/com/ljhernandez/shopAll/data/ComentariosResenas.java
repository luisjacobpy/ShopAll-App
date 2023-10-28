package com.ljhernandez.shopAll.data;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "comentariosResenas")
public class ComentariosResenas {
    @Id
    @Column(name = "idCarrito",unique = true, nullable = false)
    private Long idCarrito;

    @Column(name ="idUsuario", nullable = false)
    private Integer idUsuario;

    @Column(name ="idProducto", nullable = false)
    private Integer idProducto;


    @Column(name ="comentario", nullable = false)
    private String comentario;


    @Column(name ="puntuacion", nullable = false)
    private Integer puntuacion;

} // Fin de la clase Carrito

