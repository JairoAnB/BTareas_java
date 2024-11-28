package org.horoscopo.final_drilling_modulo_5.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class HoroscopoUpdateDTO {
    private Long id;
    private String animal;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public HoroscopoUpdateDTO() {
    }

    public HoroscopoUpdateDTO(Long id, String animal, LocalDate fechaInicio, LocalDate fechaFin) {
        this.id = id;
        this.animal = animal;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "HoroscopoUpdateDTO{" +
                "id=" + id +
                ", animal='" + animal + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }
}
