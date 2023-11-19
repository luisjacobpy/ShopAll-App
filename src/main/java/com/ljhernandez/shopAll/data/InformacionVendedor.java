package com.ljhernandez.shopAll.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "informacionVendedor")
public class InformacionVendedor {
    @Id
    @Column(name = "idInformacionVendedor", nullable = false)
    private Integer idInformacionendedor;

    @Column(name = "idUsuario", nullable = false)
    private Integer idUsuario;

    @Column(name ="descripcionVendedor", nullable = false, length = 45)
    private String descripcionVendedor;

} // Fin de la class DetallesInventario

