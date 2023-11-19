package com.ljhernandez.shopAll.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "pedido")
public class Pedido {
    @Id
    @Column(name = "idPedido", nullable = false)
    private Integer idPedido;

    @Column(name ="idUsuario", nullable = false)
    private Integer idUsuario;

    @Column(name ="fechaHoraPedido", nullable = false)
    private Date fechaHoraPedido;


}// Fin de la clase Pedido