package Molde;

public class Auto {
    private String Marca;
    private String Modelo;
    private String Color;
    private int VelocidadMaxima;
    private boolean Encendido;
    private boolean Acelerado;

    public Auto() {
    }

    public Auto(String marca, String modelo, String color, int velocidadMaxima, boolean encendido, boolean acelerado) {
        Marca = marca;
        Modelo = modelo;
        Color = color;
        VelocidadMaxima = velocidadMaxima;
        Encendido = encendido;
        Acelerado = acelerado;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public boolean isAcelerado() {
        return Acelerado;
    }

    public void setAcelerado(boolean acelerado) {
        Acelerado = acelerado;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getVelocidadMaxima() {
        return VelocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        VelocidadMaxima = velocidadMaxima;
    }

    public boolean isEncendido() {
        return Encendido;
    }

    public void setEncendido(boolean encendido) {
        Encendido = encendido;
    }

    @Override
    public String toString() {
        return "Auto[" +
                "Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Color='" + Color + '\'' +
                ", VelocidadMaxima=" + VelocidadMaxima +
                ", Encendido=" + Encendido +
                ", Acelerado=" + Acelerado +
                ']';
    }
}
