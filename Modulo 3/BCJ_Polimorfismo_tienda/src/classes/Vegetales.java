package classes;

import model.Producto;

import java.time.LocalDate;

public class Vegetales extends Producto {
    private LocalDate fechaEnvasado;
    private LocalDate fechaCaducidad;

    public Vegetales() {
    }

    public Vegetales(String codigo, String nombre, float precio, LocalDate fechaEnvasado, LocalDate fechaCaducidad) {
        super(codigo, nombre, precio);
        this.fechaEnvasado = fechaEnvasado;
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "Vegetales{" +
                "fechaEnvasado='" + fechaEnvasado + '\'' +
                ", fechaCaducidad='" + fechaCaducidad + '\'' +
                '}';
    }
}
