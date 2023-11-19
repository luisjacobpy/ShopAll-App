package com.ljhernandez.shopAll.service;


import com.ljhernandez.shopAll.data.Categoria;
import com.ljhernandez.shopAll.data.Producto;
import com.ljhernandez.shopAll.data.dto.ProductoDto;
import com.ljhernandez.shopAll.repository.CategoriaRepository;
import com.ljhernandez.shopAll.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productosRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    public ProductoDto guardarProducto(ProductoDto productoDto){
        Producto productoNuevo = new Producto();
        productoNuevo.setNombreProducto(productoDto.getNombreProducto());
        productoNuevo.setDescripcionProducto(productoDto.getDescripcionProducto());
        productoNuevo.setPrecioUnitario(productoDto.getPrecioUnitario());

        Categoria categoria = buscarCategoriaPorId(productoDto.getIdCategoria());
        productoNuevo.setIdCategoria(categoria);
        productosRepository.save(productoNuevo);
        productoDto.setIdProdcuto(productoNuevo.getIdProducto());
        return productoDto;
    }
    private Categoria buscarCategoriaPorId(int idCategoria){
        Categoria cat = categoriaRepository.getReferenceById(idCategoria);
        return cat;

    }

}
