package com.ljhernandez.shopAll.data.dto;

import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
public class DetallesPedidoDto {
    private Integer idDetallesPedido;
    private Integer idPedido;
    private Integer idProducto;
    private Integer cantidad;
    private BigDecimal precioUnitario;
    private BigDecimal calcularTotal; // Agregar este campo para la cantidad total del detalle


} // Fin de clase DetallesPedidoDto
