package com.ljhernandez.shopAll.data;

import jakarta.persistence.*;
import lombok.*;

import java.text.DecimalFormat;


@Getter
@Setter
@Entity
@Table(name = "detallesPedido")
public class DetallesPedido {
    @Id
    @Column(name = "idDetallesPedido", nullable = false)
    private Integer idDetallesPedido;

    @Column(name = "idPedido", nullable = false)
    private Integer idPedido;

    @Column(name = "IdProducto", nullable = false)
    private Integer idProducto;

    @Column(name ="cantidad", nullable = false)
    private Integer cantidad;

    @Column(name ="precioUnitario", nullable = false)
    private DecimalFormat precioUnitario;

} // Fin de la class DetallesInventario

