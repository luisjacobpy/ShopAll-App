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

    @Column(name ="idUsuario", nullable = false)
    private Integer idUsuario;

} // Fin de la clase Carrito

