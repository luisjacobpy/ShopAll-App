package com.ljhernandez.shopAll.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "tienda")
public class Tienda {

    @Id
    @Column(name = "idTienda", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTienda;

    @Column(name ="idUsuario", nullable = false, length = 45)
    private Integer idUsuario;

    @Column(name ="nombreTienda", nullable = false, length = 45)
    private String nombreTienda;

    @Column(name ="descripcionTienda", nullable = false, length = 100)
    private String descripcionTienda;

}// Fin de la clase Tiendas
