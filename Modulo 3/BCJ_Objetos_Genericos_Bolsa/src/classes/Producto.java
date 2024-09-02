package classes;

public class Producto <T> {

    private T tipoProducto;
    private String atributo;

    public Producto() {
    }

    public Producto(T tipoProducto, String atributo) {
        this.tipoProducto = tipoProducto;
        this.atributo = atributo;
    }

    public T getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(T tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "tipoProducto=" + tipoProducto +
                ", atributo='" + atributo + '\'' +
                '}';
    }
}
