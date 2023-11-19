package com.ljhernandez.shopAll.data;

import jakarta.persistence.*;
import lombok.*;



@Getter
@Setter
@Entity
@Table(name = "detallesInventario")
public class DetallesInventario {
    @Id
    @Column(name = "idDetallesInventario", nullable = false)
    private Integer idDetallesInventario;

    @Column(name = "IDVendedor", nullable = false)
    private Integer idVendedor;

    @Column(name = "IDProducto", nullable = false)
    private Integer idProducto;

    @Column(name ="stockDisponible", nullable = false)
    private Integer cantidadDisponible;
} // Fin de la class DetallesInventario

