package com.ljhernandez.shopAll.data;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @Column(name = "idCategoria", nullable = false)
    private Integer idCategoria;

    @Column(name ="nombreCategoria", nullable = false, length = 45)
    private String nombreCategoria;

} // Fin de la clase Categoria

