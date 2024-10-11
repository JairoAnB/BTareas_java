package classes;
import model.Producto;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Control {
    private String nombre;
    private String rut;
    public void inicioSesion() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Ingrese su nombre: ");
            nombre = sc.nextLine();
        } while (!validacionNombre(nombre));

        do {
            System.out.print("Ingrese su rut: ");
            rut = sc.nextLine();
        } while (!validacionRut(rut));
        System.out.println("Bienvenido@ " + nombre);
    }

    boolean validacionNombre(String nombre) {
        if (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacio, por favor ingrese uno.");
            return false;
        }
        return true;
    }

    boolean validacionRut(String rut) {
        if (rut.isEmpty()) {
            System.out.println("El rut no puede estar vacio, por favor ingrese uno.");
            return false;
        }
        return true;
    }
    public void menu(List<Producto> productos) {
        Scanner sc = new Scanner(System.in);
        List<Producto> carrito = new ArrayList<>();
        boolean fin = true;
        while (fin) {
            System.out.println("Que desea hacer?\n" +
                    "1.- Mostrar lista de productos\n" +
                    "2.- Comprar productos\n" +
                    "3.- Ver carrito de compras\n" +
                    "4.- Pagar\n" +
                    "5.- Salir");
            String opcion = sc.nextLine();
            float boletaFinal = 0;
            switch (opcion) {
                case "1":
                    System.out.println("----------------PRODUCTOS------------------");
                    for (Producto producto : productos) {
                        System.out.println(producto.getCodigo() + " - " + producto.getNombre());
                    }
                    System.out.println("-------------------------------------------");
                    break;
                case "2":
                    System.out.println("Seleccione un producto a comprar: ");
                    String seleccion = sc.nextLine();
                    boolean productoEncontrado = false;
                    if(carrito.size() >= 10) {
                        System.out.println("No puede agregar mas de 10 productos");
                        break;
                    }
                    for (Producto producto : productos) {
                        if (producto.getCodigo().trim().equalsIgnoreCase(seleccion.trim())) {
                            carrito.add(producto);
                            productoEncontrado = true;
                            System.out.println("Producto " + producto.getNombre() + " agregado exitosamente");
                            break;
                        }
                    }
                    if (!productoEncontrado) {
                        System.out.println("El producto no existe");
                    }
                    break;
                case "3":
                    if (carrito.isEmpty()){
                        System.out.println("----------------------------------------");
                        System.out.println("No tiene productos en su carrito. Agrege unos para que aparezcan aqui.");
                        System.out.println("----------------------------------------");
                        break;
                    }
                    System.out.println("----------------Carrito de compras------------------");
                    for (Producto producto : carrito) {
                        System.out.println(producto.getNombre());
                    }
                    System.out.println("----------------------------------------");
                    break;
                case "4":
                    String pago;
                    System.out.println("----------------BOLETA------------------");
                            for (Producto producto : carrito) {
                                System.out.println("Producto: " + producto.getNombre() + " $" + producto.getPrecio());
                                boletaFinal += producto.getPrecio();
                            }
                    System.out.println("");
                    System.out.println("El total de su cuenta es: " + boletaFinal);
                    System.out.println("----------------------------------------");
                    System.out.println("¿Desea pagar los "+ "$"+ boletaFinal + " para finalizar su compra?");
                    pago = sc.nextLine();
                    if (pago.equalsIgnoreCase("si")) {
                        System.out.println("Imprimiento boleta de compra...");
                        System.out.println("");
                        System.out.println("----------------VENDEDOR------------------");
                        System.out.println("Ha sido atentido por: " + nombre);
                        System.out.println("Su rut es: " + rut);
                        System.out.println("----------------BOLETA------------------");
                        for (Producto producto : carrito) {
                            System.out.println("Producto: " + producto.getNombre() + " $" + producto.getPrecio());
                            boletaFinal += producto.getPrecio();
                        }
                        System.out.println("");
                        System.out.println("----------------------------------------");
                        System.out.println("Gracias por pagar y preferir WALMORT");
                    } else if (pago.equalsIgnoreCase("no")) {
                        System.out.println("Cuando desee puede pagar. ");
                    }
                    break;
                case "5":
                    fin = false;
                    System.out.println("Gracias por su preferencia. Saliendo del menu....");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo");
                    break;
            }
        }
    }
}
























