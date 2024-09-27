package clases;

public class Avion {
    private String marca;
    private String modelo;
    private boolean listoParaDespegar;
    private Alas alas;
    private Motor motor;
    private Ruedas ruedas;
    private Cabina cabina;

    public Avion() {
    }

    public Avion(String marca, String modelo, boolean listoParaDespegar, Alas alas, Motor motor, Ruedas ruedas, Cabina cabina) {
        this.marca = marca;
        this.modelo = modelo;
        this.listoParaDespegar = listoParaDespegar;
        this.alas = alas;
        this.motor = motor;
        this.ruedas = ruedas;
        this.cabina = cabina;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isListoParaDespegar() {
        return listoParaDespegar;
    }

    public void setListoParaDespegar(boolean listoParaDespegar) {
        this.listoParaDespegar = listoParaDespegar;
    }

    public Alas getAlas() {
        return alas;
    }

    public void setAlas(Alas alas) {
        this.alas = alas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Ruedas getRuedas() {
        return ruedas;
    }

    public void setRuedas(Ruedas ruedas) {
        this.ruedas = ruedas;
    }

    public Cabina getCabina() {
        return cabina;
    }

    public void setCabina(Cabina cabina) {
        this.cabina = cabina;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", listoParaDespegar=" + listoParaDespegar +
                ", alas=" + alas +
                ", motor=" + motor +
                ", ruedas=" + ruedas +
                ", cabina=" + cabina +
                '}';
    }

    public void despegar(){
        if (isListoParaDespegar()){
            System.out.println("Despegando...");
        } else {
            System.out.println("No se puede despegar, no está listo");
        }
    }
    public void recibirPasajeros(){
        if (isListoParaDespegar()){
            System.out.println("Recibiendo pasajeros...");
        } else {
            System.out.println("No se puede recibir pasajeros, no está listo");
        }
    }
}
