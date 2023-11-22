package com.ljhernandez.shopAll.data;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "mediosPago")
public class MediosPago {
    @Id
    @Column(name = "idMediosPago", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMediosPago;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario idUsuario;

    @Column(name ="tipoMedio", nullable = false, length = 45)
    private String tipoMedio;

    @Column(name = "numeroCuenta", nullable = false)
    private Integer numeroCuenta;

    @Column(name = "fechaVencimiento", nullable = false)
    private Date fechaVencimiento;

    @Column(name = "cvv", nullable = false)
    private Integer cvv;

    @Column(name ="mediosPagocol", nullable = false, length = 45)
    private String mediosPagocol;

} // Fin de la clase Categoria

