package vistas;

import modelo.Alumno;
import servicios.AlumnoServicio;
import servicios.ArchivoServicio;
import modelo.Materia;
import modelo.MateriaEnum;

import java.util.List;

public class Menu extends MenuTemplate {
    private AlumnoServicio alumnoServicio = new AlumnoServicio();
    private ArchivoServicio archivoServicio = new ArchivoServicio();

    @Override
    protected void mostrarMenu() {
        System.out.println("Bienvenido al sistema de gestión de alumnos, Por favor elige una opcion valida para continuar con su ejecucion. ");
        System.out.println();
        System.out.println("1. Crear Alumnos");
        System.out.println("2. Listar Alumnos");
        System.out.println("3. Agregar Materias");
        System.out.println("4. Agregar Notas");
        System.out.println("5. Salir");
        System.out.println("6. Exportar Datos");
    }

    @Override
    protected void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                crearAlumno();
                break;
            case 2:
                listarAlumnos();
                break;
            case 3:
                agregarMateria();
                break;
            case 4:
                agregarNotaPasoUno();
                break;
            case 5:
                terminarPrograma();
                break;
            case 6:
                exportarDatos();
                break;
            default:
                System.out.println("Opción no válida, Intente una opcion dentro del bucle.");
        }
    }

    @Override
    protected void exportarDatos() {
        System.out.println("--- Exportar Datos ---");
        System.out.println("Exportando datos... ");
        System.out.println("Datos exportados con éxito, al escritorio.");
        archivoServicio.exportarDatos(alumnoServicio.listarAlumnos());
    }

    @Override
    protected void crearAlumno() {
        System.out.println("--- Crear Alumno ---");
        System.out.print("Ingresa RUT: ");
        String rut = scanner.nextLine();
        System.out.print("Ingresa nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingresa dirección: ");
        String direccion = scanner.nextLine();
        alumnoServicio.crearAlumno(new Alumno(rut, nombre, apellido, direccion));
        System.out.println("--- ¡Alumno agregado! ---");
    }

    @Override
    protected void agregarMateria() {
        System.out.println("--- Agregar Materia ---");
        System.out.print("Ingresa rut del Alumno: ");
        String rutAlumno = scanner.nextLine();

        System.out.println("Selecciona una Materia:");
        for (MateriaEnum materia : MateriaEnum.values()) {
            System.out.println((materia.ordinal() + 1) + ". " + materia);
        }

        int seleccion = scanner.nextInt();
        scanner.nextLine();
        Materia materia = new Materia(MateriaEnum.values()[seleccion - 1]);
        alumnoServicio.agregarMateria(rutAlumno, materia);
        List<Materia> materias = alumnoServicio.materiasPorAlumnos(rutAlumno);
        System.out.println("Materias del alumno:");
        for (Materia mat : materias) {
            System.out.println("- " + mat.getNombre());
        }
        System.out.println("--- ¡Materia agregada! ---");
    }

    @Override
    protected void agregarNotaPasoUno() {
        System.out.println("--- Agregar Nota ---");
        System.out.print("Ingresa rut del Alumno: ");
        String rutAlumno = scanner.nextLine();
        List<Materia> materias = alumnoServicio.materiasPorAlumnos(rutAlumno);
        System.out.println("Materias del alumno:");
        int contador = 1;
        for (Materia materia : materias) {
            System.out.println((contador ++) + "- " + materia.getNombre());
        }
        System.out.println("Selecciona la materia para agregar nota:");
        int seleccion = scanner.nextInt();
        Materia materiaSeleccionada = materias.get(seleccion - 1);

        System.out.print("Ingresa la nota: ");
        double nota = scanner.nextDouble();
        materiaSeleccionada.getNotas().add(nota);
        System.out.println("--- ¡Nota agregada! ---");
    }

    @Override
    protected void listarAlumnos() {
        System.out.println("--- Lista de Alumnos ---");
        for (Alumno alumno : alumnoServicio.listarAlumnos().values()) {
            System.out.println("Rut: " +  alumno.getNombre());
            System.out.println("Nombre: " + alumno.getRut());
            System.out.println("Apellido: " + alumno.getApellido());
            System.out.println("Dirección: " + alumno.getDireccion());
            System.out.println();
            System.out.println("--- Materias y Notas ---");
            if (alumno.getMaterias().isEmpty()) {
                System.out.println("No hay materias registradas.");
                continue;
            }
            for (Materia materia : alumno.getMaterias()) {
                System.out.println(materia.getNombre() + " - Notas: " + materia.getNotas());
            }
            System.out.println();
            }
        }

    @Override
    protected void terminarPrograma() {
        System.out.println("Gracias por ocupar el programa. Saliendo...");
        System.exit(0);
    }
}


