package classes;

import java.util.ArrayList;
import java.util.List;

public class Bolsa<T> {
    private int capacidad;
    private List<Producto<T>> productos;

    public Bolsa(int capacidad) {
        this.capacidad = capacidad;
        this.productos = new ArrayList<>();
    }

    public boolean agregarProducto(Producto<T> producto) {
        if (productos.size() < capacidad) {
            productos.add(producto);
            return true;
        }
        System.out.println("No puede agregar más productos a la bolsa.");
        return false;
    }

    public int getCantidadProductos() {
        return productos.size();
    }

    public void mostrarContenido() {
        System.out.println("Contenido de la bolsa:");
        for (Producto<T> producto : productos) {
            System.out.println(producto);
        }
    }
}

