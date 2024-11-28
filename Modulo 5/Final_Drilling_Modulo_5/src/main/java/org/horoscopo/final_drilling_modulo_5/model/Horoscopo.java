package org.horoscopo.final_drilling_modulo_5.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "horoscopo")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Horoscopo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String animal;

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;
    @Column(name = "fecha_fin")
    private LocalDate fechaFin;

    //constructor momentanio

    public Horoscopo(String animal, LocalDate fechaInicio, LocalDate fechaFin) {
        this.animal = animal;
        this.fechaInicio = fechaInicio;

        this.fechaFin = fechaFin;
    }
}
