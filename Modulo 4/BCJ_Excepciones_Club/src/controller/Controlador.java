package controller;

import models.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {
    private String nombre;
    private int edad;
    private String cargo;

    private void anadirAfiliado(ArrayList<Persona> afiliados) {
        Scanner sc = new Scanner(System.in);
        try {
            capacidadAfiliados(afiliados);
            if (afiliados.size() >= 7) {
                System.out.println("No se pueden añadir más afiliados. Se ha alcanzado la capacidad máxima.");
                return;
            }
            System.out.println("Si desea incorporar a un nuevo afiliado, por favor ingrese los siguientes datos:");
            System.out.println("Nombre:");
            nombre = sc.nextLine();
            System.out.println("Edad:");
            edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Cargo:");
            cargo = sc.nextLine();

            for (Persona afiliado : afiliados) {
                if (afiliado.getNombre().equalsIgnoreCase(nombre) && afiliado.getEdad() == edad && afiliado.getCargo().equalsIgnoreCase(cargo)) {
                    System.out.println("El afiliado ya existe: " + afiliado.getNombre());
                    return;
                }
            }
            afiliados.add(new Persona(nombre, edad, cargo));
            System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Cargo: " + cargo);
            System.out.println("Socio afiliado exitosamente: " + nombre);
        } catch (Exception e) {
            System.out.println("Error al añadir afiliado: " + e.getMessage());
        }
    }

    private void mostrarAfiliados(ArrayList<Persona> afiliados) {
        if (afiliados.isEmpty()) {
            System.out.println("No hay afiliados registrados.");
        } else {
            System.out.println("Lista de afiliados:");
            for (Persona afiliado : afiliados) {
                System.out.println(afiliado);
            }
        }
    }

    private void numeroAfiliados(ArrayList<Persona> afiliados) {
        System.out.println("El número actual de afiliados es: " + afiliados.size());
    }

    private void capacidadAfiliados(ArrayList<Persona> afiliados) {
        // Este método solo se usa para imprimir el estado, no es necesario en cada método
    }

    public void menu() {
        try {
            ArrayList<Persona> afiliados = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            String opcion;
            // Añado afiliados originales
            afiliados.add(new Persona("Roberto", 30, "Gerente"));
            afiliados.add(new Persona("Maria", 25, "Secretaria"));
            afiliados.add(new Persona("Juan", 35, "Contador"));
            afiliados.add(new Persona("Pedro", 40, "Vendedor"));
            do {
                numeroAfiliados(afiliados);
                System.out.println("Bienvenido al sistema de afiliados");
                System.out.println("1. Añadir afiliado");
                System.out.println("2. Mostrar afiliados");
                System.out.println("3. Salir");
                System.out.println("Seleccione una opción:");
                opcion = sc.nextLine();

                switch (opcion) {
                    case "1":
                        anadirAfiliado(afiliados);
                        break;
                    case "2":
                        mostrarAfiliados(afiliados);
                        break;
                    case "3":
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida, intente nuevamente.");
                        break;
                }
            } while (!opcion.equals("3"));
        } catch (Exception e) {
            System.out.println("Error en el sistema: " + e.getMessage());
        }
    }
}
