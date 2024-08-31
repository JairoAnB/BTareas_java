import modelo.Cocina;
import modelo.Refigerador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objetos
        Scanner sc = new Scanner(System.in);
        Cocina coci = new Cocina(15000,5,5);
        Refigerador refri = new Refigerador(20000,10, 'A',2);

        System.out.println("¿Seleccione que producto desea comprar?\n" +
                "1-. Cocina\n" +
                "2-. Refrigerador");
        int opcion = sc.nextInt();
        sc.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("Valor: " + coci.getPrecio());
                System.out.println("Cuenta con: " + coci.getQuemadores() + " Quemadores");
                System.out.println("Articulos disponibles: " + coci.getQuemadores());
                System.out.println("Presione Y para continuar. N para cancelar");

                char opcionCocina = sc.next().charAt(0);
                if (opcionCocina == 'Y' || opcionCocina == 'y') {
                    coci.incluyeGas();
                    break;
                } else if (opcionCocina == 'N' || opcionCocina == 'n') {
                    System.out.println("Compra cancelada, muchas gracias por su preferencia.");
                    break;
                }
            case 2:
                System.out.println("Valor: " + refri.getPrecio());
                System.out.println("Cuenta con: " + refri.getNumeroPuertas() + " Puertas");
                System.out.println("Tiene un gasto energetico tipo: " + refri.getTipoGasto());
                System.out.println("Articulos disponibles: " + refri.getCantidad());
                System.out.println("Presione Y para continuar. N para cancelar");

                char opcionRefri = sc.next().charAt(0);
                if (opcionRefri == 'Y' || opcionRefri == 'y') {
                    refri.incluyeDispensador();
                    break;
                } else if (opcionRefri == 'N' || opcionRefri == 'n') {
                    System.out.println("Compra cancelada, muchas gracias por su preferencia.");
                    break;
                }
            default:
                System.out.println("Opcion no valida");
            }
        }
    }