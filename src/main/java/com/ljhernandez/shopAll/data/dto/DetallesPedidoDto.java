package com.ljhernandez.shopAll.data.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetallesPedidoDto {
    private Integer idDetallesPedido;
    private Integer idPedido;
    private Integer idProducto;
    private Integer cantidad;
    private BigDecimal precioUnitario;
    private BigDecimal total;  // Agregar este campo para la cantidad total del detalle
}
