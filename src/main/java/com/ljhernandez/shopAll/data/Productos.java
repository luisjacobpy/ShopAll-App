package com.ljhernandez.shopAll.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "productos")
public class Productos {
    @Id
    @Column(name = "idProductos", nullable = false)
    private Integer idProductos;

    @Column(name ="nombreProducto", nullable = false, length = 45)
    private String nombreProducto;

    @Column(name ="descripcionProducto", nullable = false, length = 100)
    private String descripcionProducto;

    @Column(name = "precio", nullable = false)
    private double precio;

    @Column(name = "idCategoria", nullable = false)
    private Integer idCategoria;

    @Column(name = "stockDisponible", nullable = false)
    private Integer stockDisponible;

}// Fin de la clase Productos
