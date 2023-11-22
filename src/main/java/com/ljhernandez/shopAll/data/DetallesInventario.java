package com.ljhernandez.shopAll.data;

import jakarta.persistence.*;
import lombok.*;



@Data
@Entity
@Table(name = "detallesInventario")
public class DetallesInventario {
    @Id
    @Column(name = "idDetallesInventario", nullable = false)
    private Integer idDetallesInventario;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDVendedor", nullable = false)
    private InformacionVendedor idVendedor;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDProducto", nullable = false)
    private Producto idProducto;

    @Column(name ="stockDisponible", nullable = false)
    private Integer cantidadDisponible;
} // Fin de la class DetallesInventario

