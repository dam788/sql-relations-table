package com.jpa.fcdemo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "competition")
public class CompetitionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            columnDefinition = "VARCHAR(30)"
    )
    private String name;

    @Column(
            name = "quantity_price",
            length = 10, // cantidad de caracteres
            nullable = false, // no permite nulos
            unique = false, // no se puede repetir, en el caso de false si...
            insertable = true, // para insertar valores en la columna, por defecto true
            updatable = true // por ejemplo si es un saldo de cuenta lo mejor es FALSE
    )
    private Integer quantityPrice;

    @Column(
            name = "start_date",
            columnDefinition = "DATE"
    )
    private LocalDate startDate;

    @Column(name = "end_date", columnDefinition = "DATE")
    private LocalDate endDate;

}
