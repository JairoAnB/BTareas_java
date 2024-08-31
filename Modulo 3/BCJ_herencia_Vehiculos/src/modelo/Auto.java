package modelo;

import interfaces.InterfazVehiculo;

import java.util.Scanner;

public class Auto extends Vehiculo implements InterfazVehiculo{
    private String color;
    private String modelo;

    public Auto() {
    }

    public Auto(int numeroRuedas, int cantidadVentanas, String color, String modelo) {
        super(numeroRuedas, cantidadVentanas);
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Las caracteristicas de su auto es: Auto = " + "color = " + color +  "modelo = " + modelo + super.toString();
    }

    @Override
    void encender() {

    }

    @Override
    void apagar() {

    }

    @Override
    public void tipoBencina() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de la bencina que desea cargar (93 basico, 95 octanos, 97 premium)");
        int bencina = sc.nextInt();
        sc.nextLine();
        if (bencina == 93){
            System.out.println("Gracias por preferir cropec, Bencina de 93 octanos cargandose!");
        } else if (bencina == 95) {
            System.out.println("Gracias por preferir cropec, Bencina de 95 octanos cargandose!");
        }else if (bencina == 97){
            System.out.println("Gracias por preferir cropec, Bencina de 97 premium cargandose!");
        }
    }
}
