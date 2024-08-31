package modelo;

import interfaces.CocinaInterface;

import java.util.Scanner;

public class Cocina extends Producto implements CocinaInterface {
    private int quemadores;

    public Cocina() {
    }

    public Cocina(float precio, int cantidad, int quemadores) {
        super(precio, cantidad);
        this.quemadores = quemadores;
    }

    public int getQuemadores() {
        return quemadores;
    }

    public void setQuemadores(int quemadores) {
        this.quemadores = quemadores;
    }

    @Override
    public String toString() {
        return "Cocina{" +
                "quemadores=" + quemadores +
                "} " + super.toString();
    }

    @Override
    public void incluyeGas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Desea agregar un gas a su compra por 1.000 pesos? (Precio original: 100.000)");
        System.out.println("Digite 'Si' para confirmar 'No' para rechazar: ");
        String gas = sc.nextLine();

            if (gas.equals("Si") || gas.equals("si")){
                System.out.println("Felicidades ha comprado su cocina incluyendo un gas.");
                cantidadDisponibles(this.getCantidad());
                sc.close();
            } else if (gas.equals("No") || gas.equals("no")) {
                System.out.println("Felicidades ha comprado su cocina sin el gas :(");
                cantidadDisponibles(this.getCantidad());
            }else {
                System.out.println("OPCION INVALIDA POR FAVOR SEA SERIO CON NUESTRA EMPRESA.");
            }
    }

    @Override
    public void cambiarPrecio(double precio) {
    }

    @Override
    public void cantidadDisponibles(int cantidad) {
        int ventaRealizada;
        ventaRealizada = cantidad - 1;
        System.out.println("Nueva cantidad de articulos disponible " + ventaRealizada );
    }
}
