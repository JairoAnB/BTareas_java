package classes;

import classes.Mercado;
import classes.Producto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

public class TiendaTest {

    @Test
    @DisplayName("Test para verificar crear aviso")
    public void testCrearAviso() {
        String nombre = "TV";
        int idProducto = 1;
        String condicion = "Nuevo";
        String precio = "$100.000";

        Producto producto = Producto.crearAviso(nombre, idProducto, condicion, precio);
        assertEquals(nombre, producto.getNombre());
        assertEquals(idProducto, producto.getIdProducto());
        assertEquals(condicion, producto.getCondicion());
        assertEquals(precio, producto.getPrecio());
    }

    @Test
    @DisplayName("Test para verificar publicación de aviso")
    public void testPublicarAviso() {
        Mercado mercado = new Mercado();
        Producto producto = new Producto("Producto1", 1, "Nuevo", "10.99");
        mercado.publicarAviso(producto);

        List<Producto> productos = mercado.getProductos();
        assertEquals(1, productos.size());
        assertEquals(producto, productos.get(0));
    }

    @Test
    @DisplayName("Test para verificar mostrar productos de avisos")
    public void testMostrarProductos() {
        Mercado mercadoMock = Mockito.mock(Mercado.class);
        Producto producto = new Producto("Producto1", 1, "Nuevo", "10.99");
        mercadoMock.publicarAviso(producto);
        mercadoMock.mostrarProductos();
        verify(mercadoMock).mostrarProductos();
    }

    @Test
    @DisplayName("Test para verificar orden de invocación")
    public void testOrdenDeInvocacion() {
        Mercado mercadoMock = Mockito.mock(Mercado.class);
        Producto productoMock = new Producto("Producto1", 1, "Nuevo", "10.99");
        mercadoMock.publicarAviso(productoMock);
        mercadoMock.mostrarProductos();
        verify(mercadoMock).publicarAviso(productoMock);
        verify(mercadoMock).mostrarProductos();
    }
}




