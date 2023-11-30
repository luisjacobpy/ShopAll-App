package com.ljhernandez.shopAll.controller;

import com.ljhernandez.shopAll.data.dto.CategoriaDto;
import com.ljhernandez.shopAll.data.dto.RespuestaGenerica;
import com.ljhernandez.shopAll.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("/guardarCategoria")
    public ResponseEntity<RespuestaGenerica> guardarCategoria(@RequestBody CategoriaDto categoriaDto) {
        try {
            RespuestaGenerica respuesta = categoriaService.guardarCategoria(categoriaDto);
            HttpStatus status = respuesta.isExito() ? HttpStatus.OK : HttpStatus.BAD_REQUEST;
            respuesta.setCodigo(status.value());
            return new ResponseEntity<>(respuesta, status);
        } catch (Exception e) {
            return new ResponseEntity<>(new RespuestaGenerica(false, "Error interno"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
