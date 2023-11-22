package com.ljhernandez.shopAll.data.dto;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductoDto {
    private Integer idProdcuto;
    private String nombreProducto;
    private String descripcionProducto;
    private BigDecimal precioUnitario;
    private int idCategoria;
    private Integer stockDisponible;

}
