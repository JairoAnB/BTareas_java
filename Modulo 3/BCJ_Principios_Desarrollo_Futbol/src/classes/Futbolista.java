package classes;

import interfaces.InterfaceFutbolista;

public class Futbolista extends Persona implements InterfaceFutbolista {

    private int numeroCamiseta;
    private String posicion;

    public Futbolista() {
    }

    public Futbolista(String nombre, String apellido, int edad, int numeroCamiseta, String posicion) {
        super(nombre, apellido, edad);
        this.numeroCamiseta = numeroCamiseta;
        this.posicion = posicion;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "numeroCamiseta=" + numeroCamiseta +
                ", posicion='" + posicion + '\'' +
                "} " + super.toString();
    }

    @Override
    public void hablar() {

    }

    @Override
    public void celebrar() {

    }

    @Override
    public void amonestado() {

    }

    @Override
    public void realizarMovimiento() {

    }
}
