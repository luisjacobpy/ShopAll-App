package com.ljhernandez.shopAll.controller;

import com.ljhernandez.shopAll.data.dto.UsuarioDto;
import com.ljhernandez.shopAll.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
@Validated

public class UsuariosController {
    @Autowired
    private UsuarioService usuarioService; // Se le dice a Spring que gestione el usuario service

    @GetMapping("/getUsuarios")
    public List<UsuarioDto> getTodosUsuarios(){
        return usuarioService.getUsuarios();
    }

    @PostMapping("/guardarUsuarios")
    public UsuarioDto guardarUsuario(@RequestBody UsuarioDto dto){
        return usuarioService.guardarUsuario(dto);
    }

} // Fin de la clase UsuariosController
