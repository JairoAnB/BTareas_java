package controller;

import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {

   static ArrayList<Persona> personas = new ArrayList<>();


    static {
        personas.add(new Persona("jairo","isa2993"));
        personas.add(new Persona("sheccid","mateo685"));
    }

    public static void Ingreso(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario: ");
        String usuario = sc.nextLine().trim();
        System.out.println("Ingrese su contraseña: ");
        String password = sc.nextLine().trim();
        boolean pasa = false;
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getNombre().equals(usuario) && personas.get(i).getPassword().equals(password)){

                System.out.println("Bienvenido/a " + personas.get(i).getNombre().toUpperCase());
                System.out.println("¿Que desea realizar?\n" +
                        "1- Calcular la raiz Cuadrada de un numero.\n" +
                        "2- Ver el valor de pi.\n" +
                        "3- Calcular la potencia de un numero.");
                String eleccion = sc.nextLine().trim();
                switch (eleccion){
                    case "1":
                        System.out.println("Ingrese el numero que desea ver la raiz cuadrada: ");
                        double numero = sc.nextDouble();
                        sc.nextLine();
                        double raizResultado = Math.sqrt(numero);
                        System.out.println("La raiz cuadrada de " + numero + " es " + raizResultado);
                        break;
                    case "2":
                        double valorPi= Math.PI;
                        System.out.println("El valor de pi es: " + valorPi);
                        break;
                    case "3":
                        System.out.println("Ingresa la base: ");
                        double primero = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Ingrese el exponente: ");
                        double segundoNumero = sc.nextDouble();
                        sc.nextLine();

                        double potencia = Math.pow(primero, segundoNumero);

                        System.out.println("La potencia de " + primero + " es " + potencia);
                }
                pasa = true;
                break;
            }
        }
        if(!pasa){
            System.out.println("No existe el usuario con ese nombre");
        }
    }
}
