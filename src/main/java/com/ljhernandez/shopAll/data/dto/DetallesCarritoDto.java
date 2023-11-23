package com.ljhernandez.shopAll.data.dto;

import com.ljhernandez.shopAll.data.Carrito;
import com.ljhernandez.shopAll.data.Producto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetallesCarritoDto {
private Integer idDetallesCarrito;
private Carrito idCarrito;
private Producto idProducto;
private Integer cantidad;

}
