package com.ljhernandez.shopAll.controller;


import com.ljhernandez.shopAll.data.dto.ProductoDto;
import com.ljhernandez.shopAll.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")

public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping("/guardar")
    public ProductoDto guardarProducto(@RequestBody ProductoDto productoDto){
        return productoService.guardarProducto(productoDto);
    }

}
