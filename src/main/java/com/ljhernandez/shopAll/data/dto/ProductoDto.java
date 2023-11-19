package com.ljhernandez.shopAll.data.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoDto {
    private Integer idProdcuto;
    private String nombreProducto;
    private String descripcionProducto;
    private double precioUnitario;
    private int idCategoria;
    private Integer stockDisponible;

}
