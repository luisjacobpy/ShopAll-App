package com.ljhernandez.shopAll.data;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "busquedaproductos")
public class BusquedaProductos {

    @Id
    @Column(name = "idBusqueda", nullable = false)
    private Integer idCarrito;

    @Column(name ="idUsuario", nullable = false)
    private Integer idUsuario;


}

