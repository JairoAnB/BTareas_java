import Molde.Auto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Auto auto = new Auto("Tesla", "Model 3", "Pantone", 350, false, false);
        System.out.println("Felicidades por su nuevo " + auto);
        boolean Ciclo = true;
        while (Ciclo) {
            System.out.println("Seleccione que desea hacer: \n" +
                    "1- Encender el auto\n2- Apagar auto\n" +
                    "3- Ascelerar el auto\n4- Salir");
            String Eleccion = sc.nextLine();
            switch (Eleccion) {
                case "1":
                    if (!auto.isEncendido()){
                        System.out.println("Se ha encendido su auto");
                        auto.setEncendido(true);
                    }else{
                        System.out.println("No se puede realizar esta accion por que su auto ya se encuentra encendido");
                    }
                    break;
                case "2":
                    if (auto.isEncendido()){
                        System.out.println("Se ha apagado su auto");
                        auto.setEncendido(false);
                    }else{
                        System.out.println("No se puede realizar esta accion por que su auto ya se encuentra apagado");
                    }
                    break;
                case "3":
                    auto.setAcelerado(true);
                    if (auto.isEncendido() == true){
                        System.out.println("ACELERADO");
                    }else{
                        System.out.println("No puedes realizar esta accion por que su auto esta apagado");
                    }

                    break;
                case "4":
                    Ciclo = false;
            }
        }
  }
}