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

    @Column(name = "idCarrito", nullable = false)
    private Integer idCarrito;


    @Column(name = "idProducto", nullable = false)
    private Integer idProducto;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

} // Fin de la clase DetallesCarrito


