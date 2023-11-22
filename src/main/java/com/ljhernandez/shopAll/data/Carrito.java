package com.ljhernandez.shopAll.data;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "carrito")
public class Carrito {
    @Id
    @Column(name = "idCarrito", nullable = false)
    private Integer idCarrito;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name ="idUsuario", nullable = false)
    private Usuario idUsuario;



} // Fin de la clase Carrito

