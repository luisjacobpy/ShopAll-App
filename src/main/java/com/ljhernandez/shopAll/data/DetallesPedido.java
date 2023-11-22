package com.ljhernandez.shopAll.data;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.text.DecimalFormat;


@Data
@Entity
@Table(name = "detallesPedido")
public class DetallesPedido {
    @Id
    @Column(name = "idDetallesPedido", nullable = false)
    private Integer idDetallesPedido;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idPedido", nullable = false)
    private Pedido idPedido;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdProducto", nullable = false)
    private Producto idProducto;

    @Column(name ="cantidad", nullable = false)
    private Integer cantidad;

    @Column(name ="precioUnitario", nullable = false)
    private BigDecimal precioUnitario;

} // Fin de la class DetallesInventario

