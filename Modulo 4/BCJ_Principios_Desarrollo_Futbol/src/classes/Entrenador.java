package classes;

import interfaces.InterfaceEntrenador;

public class Entrenador extends Persona implements InterfaceEntrenador {
    private int aniosTrabajando;

    public Entrenador() {
    }

    public Entrenador(String nombre, String apellido, int edad, int aniosTrabajando) {
        super(nombre, apellido, edad);
        this.aniosTrabajando = aniosTrabajando;
    }

    public int getAniosTrabajando() {
        return aniosTrabajando;
    }

    public void setAniosTrabajando(int aniosTrabajando) {
        this.aniosTrabajando = aniosTrabajando;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "aniosTrabajando=" + aniosTrabajando +
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
}
