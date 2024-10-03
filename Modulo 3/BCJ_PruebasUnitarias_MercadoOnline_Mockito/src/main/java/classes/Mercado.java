package classes;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
    private List<Producto> productos;

    public Mercado() {
        this.productos = new ArrayList<>();
    }

    public Mercado(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Mercado{" +
                "productos=" + productos +
                '}';
    }
    public String publicarAviso(Producto p) {
        productos.add(p);
        return p.toString();
    }
    public void mostrarProductos(){
        System.out.println("Productos en el mercado actualmente: ");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}
