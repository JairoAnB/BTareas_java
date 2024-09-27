package clases;

public class Ruedas {
    private int capacidadPasajeros;
    private int numeroPuertas;
    private boolean puertasCerradas;
    private boolean buenEstado;

    public Ruedas() {
    }

    public Ruedas(int capacidadPasajeros, int numeroPuertas, boolean puertasCerradas, boolean buenEstado) {
        this.capacidadPasajeros = capacidadPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.puertasCerradas = puertasCerradas;
        this.buenEstado = buenEstado;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isPuertasCerradas() {
        return puertasCerradas;
    }

    public void setPuertasCerradas(boolean puertasCerradas) {
        this.puertasCerradas = puertasCerradas;
    }

    public boolean isBuenEstado() {
        return buenEstado;
    }

    public void setBuenEstado(boolean buenEstado) {
        this.buenEstado = buenEstado;
    }

    @Override
    public String toString() {
        return "Ruedas{" +
                "capacidadPasajeros=" + capacidadPasajeros +
                ", numeroPuertas=" + numeroPuertas +
                ", puertasCerradas=" + puertasCerradas +
                ", buenEstado=" + buenEstado +
                '}';
    }
    public void cerrarPuertas(){
        System.out.println("Ruedas en buen estado, puertas cerradas");
    }
}
