package com.ljhernandez.shopAll.data;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "detallescarrito")
public class DetallesCarrito {
    @Id
    @Column(name = "idDetallesCarrito", nullable = false)
    private Integer idDetallesCarrito;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idCarrito", nullable = false)
    private Carrito idCarrito;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idProducto", nullable = false)
    private Producto idProducto;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

} // Fin de la clase DetallesCarrito


