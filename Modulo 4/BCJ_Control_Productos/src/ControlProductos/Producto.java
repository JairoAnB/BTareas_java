package ControlProductos;

public class Producto {
    private String Nombre;
    private int Valor;
    private String Descripcion;

    public Producto() {
    }

    public Producto(String nombre, int valor, String descripcion) {
        Nombre = nombre;
        Valor = valor;
        Descripcion = descripcion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int valor) {
        Valor = valor;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    @Override
    public String toString() {
        return "Producto: "+ Nombre + " - " + "Valor: " + Valor + ": " + "Descripcion: " + Descripcion + ".";
    }
}
