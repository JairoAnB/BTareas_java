package classes;

import Interfaces.Interfazvendedor;

public class Vendedor implements Interfazvendedor {
    private String nombre;
    private String rut;

    public Vendedor() {
    }

    public Vendedor(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                '}';
    }

    @Override
    public void horaBrake() {

    }
}
