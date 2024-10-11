package classes;

import java.util.List;

public class Producto {
    private String nombre;
    private int idProducto;
    private String condicion;
    private String precio;

    public Producto() {
    }

    public Producto(String nombre, int idProducto, String condicion, String precio) {
        this.nombre = nombre;
        this.idProducto = idProducto;
        this.condicion = condicion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", idProducto=" + idProducto +
                ", condicion='" + condicion + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }
    public static Producto crearAviso(String nombre,int IdProducto,String condicion,String precio){
        return new Producto(nombre,IdProducto,condicion,precio);
    }
}
