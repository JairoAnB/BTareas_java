package classes;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class TiendaTest {

    @Test
    @DisplayName("Test para metodo crear aviso")
    public void testCrearAviso() {
        String nombre = "Producto 1";
        int id = 1;
        String condicion = "Nuevo";
        String precio = "$1000";

        Producto p = new Producto(nombre, id, condicion, precio);
        assertNotNull(p);
    }

    @Test
    @DisplayName("Test para publicar aviso")
    public void testPublicarAviso() {
        Mercado m = new Mercado();
        Producto p = Producto.crearAviso("Cuchara",10,"siempre usado","$2 MILLONESSSS");

        String aviso = m.publicarAviso(p);

        assertNotNull(aviso);
        assertTrue(m.getProductos().contains(p));
        assertEquals(1,m.getProductos().size());
    }

}
