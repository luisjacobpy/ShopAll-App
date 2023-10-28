package com.ljhernandez.shopAll.data.dto;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/*
 * DTO
 * */
@Getter // Genera con Lombok de manera automatica los setters y getters
@Setter
public class UsuarioDto implements Serializable {
    /*
     * Clase que sirve para especificar que información le quiero dar al usuario
     * */
    // Atributos
    Integer idUsuario;
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    String correo;
    String tipoUsuario;

    public UsuarioDto() {

    }

} // Fin de la clase UsuarioDto
