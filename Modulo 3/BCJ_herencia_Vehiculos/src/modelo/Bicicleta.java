package modelo;

public class Bicicleta extends Vehiculo{
    private String tipoBicicleta;

    public Bicicleta() {
    }

    public Bicicleta(int numeroRuedas, int cantidadVentanas, String tipoBicicleta) {
        super(numeroRuedas, cantidadVentanas);
        this.tipoBicicleta = tipoBicicleta;
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "tipoBicicleta='" + tipoBicicleta + '\'' +
                "} " + super.toString();
    }

    @Override
    public void encender() {
        System.out.println("Su IMC es demsiado alto, por favor considere salir a tocar pasto...");
    }

    @Override
    public void apagar() {
    }
}
