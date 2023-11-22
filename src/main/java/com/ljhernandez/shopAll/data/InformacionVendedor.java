package com.ljhernandez.shopAll.data;

import jakarta.persistence.*;
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

    @ManyToOne(fetch = FetchType.EAGER, optional = false) // Se recupera la informacion de manera pronta
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario idUsuario;

    @Column(name ="descripcionVendedor", nullable = false, length = 45)
    private String descripcionVendedor;

} // Fin de la class DetallesInventario

