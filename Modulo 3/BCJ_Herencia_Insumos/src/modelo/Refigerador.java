package modelo;

import interfaces.ProductoInterface;
import interfaces.RefriInterface;

import java.util.Scanner;

public class Refigerador extends Producto implements ProductoInterface, RefriInterface {
    private char tipoGasto;
    private int numeroPuertas;

    public Refigerador() {
    }

    public Refigerador(float precio, int cantidad, char tipoGasto, int numeroPuertas) {
        super(precio, cantidad);
        this.tipoGasto = tipoGasto;
        this.numeroPuertas = numeroPuertas;
    }

    public char getTipoGasto() {
        return tipoGasto;
    }

    public void setTipoGasto(char tipoGasto) {
        this.tipoGasto = tipoGasto;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Refigerador{" +
                "tipoGasto=" + tipoGasto +
                ", numeroPuertas=" + numeroPuertas +
                "} " + super.toString();
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

    @Override
    public void incluyeDispensador() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Desea agregar un dispensador de agua mansam a su compra por $30.000? (Valor original 60.000$)");
        System.out.println("Digite 'Si' para confirmar 'No' para rechazar: ");
        String opcionDispensador = sc.nextLine();

        if (opcionDispensador.equals("Si") || opcionDispensador.equals("si")) {
            System.out.println("Felicidades ha comprado su nuevo refrigerador incluyendo la promocion del dispensador mamsam. ");
            cantidadDisponibles(getCantidad());
            sc.close();
        } else if (opcionDispensador.equals("No") || opcionDispensador.equals("no")) {
            System.out.println("Felicidades por su nueva compra, lamentablemente sin la INCREIBLE PROMOCION. =(");
            cantidadDisponibles(getCantidad());
            sc.close();
        }else {
            System.out.println("OPCION INVALIDA POR FAVOR SEA SERIO CON NUESTRA EMPRESA.");
        }
    }
}
