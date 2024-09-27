package clases;

public class Motor {
    private boolean tieneCombustible;
    private boolean buenEstado;

    public Motor() {
    }

    public Motor(boolean tieneCombustible, boolean buenEstado) {
        this.tieneCombustible = tieneCombustible;
        this.buenEstado = buenEstado;
    }

    public boolean isTieneCombustible() {
        return tieneCombustible;
    }

    public void setTieneCombustible(boolean tieneCombustible) {
        this.tieneCombustible = tieneCombustible;
    }

    public boolean isBuenEstado() {
        return buenEstado;
    }

    public void setBuenEstado(boolean buenEstado) {
        this.buenEstado = buenEstado;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "tieneCombustible=" + tieneCombustible +
                ", buenEstado=" + buenEstado +
                '}';
    }
    public void cargarCombustible(){
        System.out.println("Cargando combustible");
    }
}
