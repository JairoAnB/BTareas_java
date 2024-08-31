import modelo.Auto;
import modelo.Bicicleta;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Auto auto = new Auto(4, 5,"Pantone","Hyundai versa");
            Bicicleta bici = new Bicicleta(2,0,"Montaña");

        bici.encender();
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------");
        System.out.println("Hola! Bienvenido a cropec que bencina desea hacer?\n" +
                "1-.Cargar bencina\n" +
                "2-.Conocer su auto");
        int opcion = sc.nextInt();
        sc.nextLine();
        if (opcion == 1) {
            auto.tipoBencina();
        }else if(opcion == 2) {
            System.out.println("Los datos de su auto son " +  "'" + "Color - " + auto.getColor().toUpperCase() + " Modelo - " + auto.getModelo().toUpperCase() + " Contiene - " + auto.getCantidadVentanas() + " ventanas" + " - Tiene -  " + auto.getNumeroRuedas() + " ruedas" + "'");
        }else{
            System.out.println("Opcion no valida, por favor sea serio.");
        }

        }
    }
