package classes;

public class Jugador {
    private String nombre;
    private int edad;
    private int numero;

    public Jugador() {
    }

    public Jugador(String nombre, int edad, int numero) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", numero=" + numero +
                '}';
    }

    public String crearJugador(String nombre,int edad,int numero){

        return new Jugador(nombre,edad,numero).toString();
    }
}
