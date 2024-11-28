package org.horoscopo.final_drilling_modulo_5.dto;

import java.time.LocalDate;

public class HoroscopoDtoCreate {
    private String animal;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public HoroscopoDtoCreate() {
    }

    public HoroscopoDtoCreate(String animal, LocalDate fechaInicio, LocalDate fechaFin) {
        this.animal = animal;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
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
        return "HoroscopoDtoCreate{" +
                "animal='" + animal + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }
}
