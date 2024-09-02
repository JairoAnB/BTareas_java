import classes.Bolsa;
import classes.Producto;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido, ¿qué desea comprar? zapatos o poleras");
        String eleccion = sc.nextLine();

        System.out.println("¿De qué tamaño desea la bolsa?");
        int tamanoBolsa = sc.nextInt();
        sc.nextLine();

        Bolsa<String> bolsa = new Bolsa<>(tamanoBolsa);

        if (eleccion.equalsIgnoreCase("zapato")) {
            while (true) {
                if (bolsa.getCantidadProductos() >= tamanoBolsa) {
                    System.out.println("No puede agregar más productos a su bolsa.");
                    break;
                }
                System.out.println("Añada la marca del zapato o salir:");
                String marca = sc.nextLine();

                if (marca.equalsIgnoreCase("salir")) {
                    break;
                }
                Producto<String> zapato = new Producto<>();
                zapato.setTipoProducto("zapato");
                zapato.setAtributo(marca);
                bolsa.agregarProducto(zapato);
            }

        } else if (eleccion.equalsIgnoreCase("polera")) {
            while (true) {
                if (bolsa.getCantidadProductos() >= tamanoBolsa) {
                    System.out.println("No puede agregar más productos a su bolsa.");
                    break;
                }
                System.out.println("Añada el color de la polera o salir para terminar el programa:");
                String color = sc.nextLine();

                if (color.equalsIgnoreCase("salir")) {
                    break;
                }
                Producto<String> polera = new Producto<>();
                polera.setTipoProducto("polera");
                polera.setAtributo(color);
                bolsa.agregarProducto(polera);
            }
        } else {
            System.out.println("Opción no válida.");
        }
        bolsa.mostrarContenido();
        sc.close();
    }
}
