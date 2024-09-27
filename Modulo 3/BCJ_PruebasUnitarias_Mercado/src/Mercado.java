import java.util.List;

public class Mercado {
    private List<Producto> productos;

    public Mercado() {
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

    public void publicarAviso(List<Producto> productos, String Producto) {

    }
}
