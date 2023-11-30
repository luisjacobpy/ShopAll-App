package com.ljhernandez.shopAll.service;

import com.ljhernandez.shopAll.data.Categoria;
import com.ljhernandez.shopAll.data.dto.CategoriaDto;
import com.ljhernandez.shopAll.data.dto.RespuestaGenerica;
import com.ljhernandez.shopAll.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public RespuestaGenerica guardarCategoria(CategoriaDto categoriaDto){
        RespuestaGenerica respuesta = new RespuestaGenerica(false, "Error interno");

        // Crear una nueva categoría
        Categoria categoriaNueva = new Categoria();
        categoriaNueva.setNombreCategoria(categoriaDto.getNombreCategoria());

        try {
            // Guardar la nueva categoría en la base de datos
            Categoria categoriaGuardada = categoriaRepository.save(categoriaNueva);

            // Puedes establecer
            respuesta.setIdGenerado(categoriaGuardada.getIdCategoria());
            respuesta.setMensaje("Categoría guardada exitosamente");
        } catch (Exception e) {
            respuesta.setMensaje("Error al guardar la categoría: " + e.getMessage());
            // También podrías loguear la excepción para obtener más detalles
        }

        return respuesta;
    }
}