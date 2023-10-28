package com.ljhernandez.shopAll.service;

import com.ljhernandez.shopAll.data.Usuario;
import com.ljhernandez.shopAll.data.dto.UsuarioDto;
import com.ljhernandez.shopAll.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
// import java.lang.annotation.*;
@Service // Anotacion que indica que es un servicio
public class UsuarioService {

    @Autowired  // Inyección de dependencias, nos permite obtener una sola instancia de una cosa
    UsuarioRepository usuarioRepository;

    public List<UsuarioDto> getUsuarios() {
        List<UsuarioDto> listaUsuarios = new ArrayList<>();

        for(Usuario user: usuarioRepository.findAll()){
            UsuarioDto usuarioDto = new UsuarioDto();
            usuarioDto.setIdUsuario(user.getIdUsuario());
            usuarioDto.setNombre(user.getNombre());
            usuarioDto.setApellidoPaterno(user.getApellidoPaterno());
            usuarioDto.setApellidoMaterno(user.getApellidoMaterno());
            usuarioDto.setCorreo(user.getCorreo());
            listaUsuarios.add(usuarioDto);

        }
        return listaUsuarios;
    }
    public UsuarioDto guardarUsuario(UsuarioDto dto){
        Usuario usuario = new Usuario();
        usuario.setNombre(dto.getNombre());
        usuario.setApellidoPaterno(dto.getApellidoPaterno());
        usuario.setApellidoMaterno(dto.getApellidoMaterno());
        usuario.setCorreo(dto.getCorreo());
        usuario = usuarioRepository.save(usuario);
        dto.setIdUsuario(usuario.getIdUsuario());
        return dto;
    }

}