package org.example;

import classes.Mercado;
import classes.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Mercado m = new Mercado();
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        while(bandera){
            System.out.println("Los productos disponibles en el mercado ahora son:");

            System.out.println("Introduzca el nombre de su producto:");
            String nombre = sc.nextLine();
            System.out.println("Introduzca el ID del su producto:");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("¿Cual es la condicion de su producto?");
            String condicion = sc.nextLine();
            System.out.println("¿Cual es el precio de su producto?");
            String precio = sc.nextLine();
            Producto p = new Producto(nombre, id, condicion, precio);
            m.publicarAviso(p);
            m.mostrarProductos();
        }

    }
}
