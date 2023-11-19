package com.ljhernandez.shopAll.data;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "busquedaProductos")
public class BusquedaProductos {

    @Id
    @Column(name = "idBusqueda", nullable = false)
    private Integer idBusqueda;

    @Column(name ="idProducto", nullable = false)
    private Integer idProducto;

    @Column(name ="palabraClave", nullable = false, length = 45)
    private String palabraClave;


}

