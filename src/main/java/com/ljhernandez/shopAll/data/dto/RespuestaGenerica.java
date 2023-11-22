package com.ljhernandez.shopAll.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class RespuestaGenerica {
    private int codigo;
    private boolean exito;
    private String mensaje;
    private int idGenerado;
    private List<Object> datos;

    public RespuestaGenerica(){
        this.datos = new ArrayList<>();
    }
    public RespuestaGenerica(int codigo, boolean exito, String mensaje, int idGenerado) {
        this.codigo = codigo;
        this.exito = exito;
        this.mensaje = mensaje;
        this.idGenerado = idGenerado;
    }
}
