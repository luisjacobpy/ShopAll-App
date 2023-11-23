package com.ljhernandez.shopAll.controller;

import com.ljhernandez.shopAll.data.dto.CategoriaDto;
import com.ljhernandez.shopAll.data.dto.RespuestaGenerica;
import com.ljhernandez.shopAll.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
@Validated

public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("/guardarCategoria")
    public ResponseEntity<RespuestaGenerica> guardarCategoria(@RequestBody CategoriaDto categoriaDto){

        RespuestaGenerica respuesta = categoriaService.guardarCategoria(categoriaDto);
        HttpStatus status = null;
        if(respuesta.isExito()){
            status = HttpStatus.OK;
            respuesta.setCodigo(status.value());
        }else {
            status = HttpStatus.BAD_REQUEST;
            respuesta.setCodigo(status.value());
        }
    return new ResponseEntity<>(respuesta, status);

    }
}