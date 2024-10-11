package classes;

import model.Producto;

public class Vestuario extends Producto {
    private int talla;
    private String color;

    public Vestuario() {
    }

    public Vestuario(String codigo, String nombre, float precio, int talla, String color) {
        super(codigo, nombre, precio);
        this.talla = talla;
        this.color = color;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vestuario [" + "Talla=" + talla + " Color='" + color  + " Codigo = " + getCodigo() + " Nombre=" + getNombre() + "] ";
    }
}
