import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Videoclub {

    private static Videoclub instance;
    private String tipoCobro;
    private List<Pelicula> peliculas = new ArrayList<>();

    private Videoclub() {
    }

    public static Videoclub getInstance() {
        if (instance == null) {
            instance = new Videoclub();
        }
        return instance;
    }
    Calendar cal = Calendar.getInstance();

    //Añado peliculas
    {
        cal.set(2005, Calendar.SEPTEMBER, 16);
        peliculas.add(new Pelicula("Orgullo y Prejuicio", cal.getTime(), true));

        cal.set(2000, Calendar.SEPTEMBER, 29);
        peliculas.add(new Pelicula("Deseando Amar", cal.getTime(), false));

        cal.set(2007, Calendar.SEPTEMBER, 7);
        peliculas.add(new Pelicula("Expiación", cal.getTime(), true));

        cal.set(2007, Calendar.DECEMBER, 26);
        peliculas.add(new Pelicula("There Will Be Blood", cal.getTime(), false));

        cal.set(2012, Calendar.SEPTEMBER, 8);
        peliculas.add(new Pelicula("Las ventajas de ser invisible", cal.getTime(), true));

        cal.set(2001, Calendar.JULY, 20);
        peliculas.add(new Pelicula("El viaje de Chihiro", cal.getTime(), false));

        cal.set(1989, Calendar.NOVEMBER, 17);
        peliculas.add(new Pelicula("La Sirenita", cal.getTime(), true));

        cal.set(2015, Calendar.MARCH, 13);
        peliculas.add(new Pelicula("La Cenicienta", cal.getTime(), false));

        cal.set(2014, Calendar.OCTOBER, 26);
        peliculas.add(new Pelicula("Interstellar", cal.getTime(), true));

        cal.set(2021, Calendar.DECEMBER, 17);
        peliculas.add(new Pelicula("Spider-Man No Way Home", cal.getTime(), true));

    }

    private void listarPeliculas() {
        int index = 1;
        System.out.println("---------------Lista de peliculas-----------------------");
        for (Pelicula listaPelicula : peliculas) {
            System.out.println(index + ". " + listaPelicula.getTitulo() + " - Esta arrendada: " + listaPelicula.isFueArrendada());
            index++;
        }
        System.out.println("--------------------------------------------------------");
    }

    private void listarPeliculasDisponibles() {
        int index = 1;
        System.out.println("-------------Peliculas Disponibles--------------");
        for (Pelicula peliculaReservada : peliculas) {
            if (!peliculaReservada.isFueArrendada()) {
                System.out.println(index + ". " + peliculaReservada.getTitulo());
                index++;
            }
        }
        System.out.println("------------------------------------------------");
    }

    private void arrendarPelicula() {
        Scanner sc = new Scanner(System.in);
        listarPeliculasDisponibles();
        System.out.println("Ingrese el nombre de la pelicula a arrendar: ");
        String opcionPelicula = sc.nextLine();

        for (Pelicula peliculas : peliculas) {
            if (opcionPelicula.equalsIgnoreCase(peliculas.getTitulo())) {
                pago();
                peliculas.setFueArrendada(true);
            }
        }
    }

    private void pago() {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Con que medio de pago desea pagar?");
        String opcionPago = sc.nextLine();

        if (opcionPago.equalsIgnoreCase("efectivo")) {
            CobroEfectivo efectivo = new CobroEfectivo();
            efectivo.pago();
        } else if (opcionPago.equalsIgnoreCase("tarjeta") || opcionPago.equalsIgnoreCase("credito")) {
            CobroTarjeta credito = new CobroTarjeta();
            credito.pago();
        } else {
            System.out.println("Medio de pago no existente, por favor pruebe con efectivo o tarjeta");

        }
    }

    private void devolverPelicula() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la pelicula que desea devolver: ");
        String opcionDevolucion = sc.nextLine();
        for (Pelicula peliculas : peliculas) {
            if (opcionDevolucion.equalsIgnoreCase(peliculas.getTitulo())) {
                peliculas.setFueArrendada(false);
                System.out.println("La pelicula " + peliculas.getTitulo() + " ha sido devuelta con exito, lamentamos si es que no te haya gustado o no hayas podido terminar de verla. =( ");
            }
        }
    }

    public void iniciarVideoclub() {
        Scanner sc = new Scanner(System.in);
        boolean salir = true;
        System.out.println("Bienvenido a blockflix");
        while(salir) {
        System.out.println("¿Que deseas hacer?\n" +
                "1.- Ver lista de peliculas\n" +
                "2.- Ver lista de peliculas disponibles\n" +
                "3.- Arrendar pelicula\n" +
                "4.- Devolver pelicula\n" +
                "5.- Salir");
        String opcion = sc.nextLine();
        switch (opcion) {
            case "1":
                listarPeliculas();
                break;
            case "2":
                listarPeliculasDisponibles();
                break;
            case "3":
                arrendarPelicula();
                break;
            case "4":
                devolverPelicula();
                break;
            case "5":
                System.out.println("Saliendo del programa...");
                salir = false;
                break;
            default:
                System.out.println("Ingrese una opcion valida que sea valida (1-5).");
             }
         }
    }
}