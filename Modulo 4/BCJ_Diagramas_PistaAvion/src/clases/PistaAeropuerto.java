package clases;

public class PistaAeropuerto {
    private boolean disponible;

    public PistaAeropuerto() {
    }

    public PistaAeropuerto(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "PistaAeropuerto{" +
                "disponible=" + disponible +
                '}';
    }
    public void pruebaPista(){
        System.out.println("La pista esta disponible");
    }
}
