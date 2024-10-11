package clases;

public class Alas {
    private  String largoEnMetro;
    private  boolean buenEstado;

    public Alas() {
    }

    public Alas(String largoEnMetro, boolean buenEstado) {
        this.largoEnMetro = largoEnMetro;
        this.buenEstado = buenEstado;
    }

    public String getLargoEnMetro() {
        return largoEnMetro;
    }

    public void setLargoEnMetro(String largoEnMetro) {
        this.largoEnMetro = largoEnMetro;
    }

    public boolean isBuenEstado() {
        return buenEstado;
    }

    public void setBuenEstado(boolean buenEstado) {
        this.buenEstado = buenEstado;
    }

    @Override
    public String toString() {
        return "Alas{" +
                "largoEnMetro='" + largoEnMetro + '\'' +
                ", buenEstado=" + buenEstado +
                '}';
    }
    public void pruebaAlas(){
        System.out.println("Las alas estan en buen estado");
    }
}
