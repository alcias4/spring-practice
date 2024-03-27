package com.ps.demopractica.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Prestamos")
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_id")
    private  Long prestamoId;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private  Cliente cliente;

    private BigDecimal monto;
    private  BigDecimal tasaInteres;
    private  Integer plazo;
    private LocalDate fecha_inicio;
    private  String  estado;
}
