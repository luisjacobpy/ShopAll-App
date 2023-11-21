package com.ljhernandez.shopAll.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @Column(name = "idProducto", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Al registrar un producto que sea la base de datos la que me regrese el numero
    private Integer idProducto;

    @Column(name ="nombreProducto", nullable = false, unique = true, length = 45)
    private String nombreProducto;

    @Column(name ="descripcionProducto", nullable = false, length = 100)
    private String descripcionProducto;

    @Column(name = "precioUnitario", nullable = false)
    private double precioUnitario;

//    @Column(name = "idCategoria", nullable = false)
//    private Integer idCategoria;
   @ManyToOne(fetch = FetchType.LAZY, optional = false)
   @JoinColumn(name = "idCategoria", nullable = false)
   private Categoria idCategoria; // Estamos instanciando un Objeto Categoria, para mapearse la relacion por objetos

    @Column(name = "stockDisponible", nullable = false)
    private Integer stockDisponible;

}// Fin de la clase Productos
