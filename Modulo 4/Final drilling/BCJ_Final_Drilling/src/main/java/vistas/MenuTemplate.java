package vistas;

import java.util.Scanner;

public abstract class MenuTemplate {
    protected Scanner scanner = new Scanner(System.in);

    public void iniciarMenu() {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            procesarOpcion(opcion);
        } while (opcion != 5);
    }

    protected abstract void mostrarMenu();
    protected abstract void procesarOpcion(int opcion);


    protected abstract void exportarDatos();
    protected abstract void crearAlumno();
    protected abstract void agregarMateria();
    protected abstract void agregarNotaPasoUno();
    protected abstract void listarAlumnos();
    protected abstract void terminarPrograma();
}
