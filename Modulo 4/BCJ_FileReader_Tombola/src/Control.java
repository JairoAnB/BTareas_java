import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Control {

    private List<String> participantes = new ArrayList<>();
    private String path = "src/";
    private String file = "Concursantes.txt";
    private String rutaArchivo = path + file;

    private void leerTxt(){
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                participantes.add(linea);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void leerParticipantes() {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void AgregarParticipante(String path, String file) {
        String rutaArchivo = path + file;
        System.out.println("Ingrese el nombre del participante: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine().trim();
        System.out.println("Ingrese el apellido del participante: ");
        String apellido = sc.nextLine().trim();
        String nombreCompleto = nombre + " " + apellido;
        List<Object> participantes = new ArrayList<>();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            bw.write(nombreCompleto);
            bw.newLine();
            System.out.println("Participante agregado con exito");
        } catch (IOException e) {
            System.out.println("Error al agregar participante" + e.getMessage());
        }
    }

    private void elegirGanador() {
        Random random = new Random();
        if (participantes.isEmpty()){
            System.out.println("No hay participantes para elegir un ganador");
            return;
        }
        int ganador = random.nextInt(participantes.size());
        System.out.println("El ganador es: " + participantes.get(ganador));

        System.out.println("Imprimiento mensaje personalizado para el ganador.... Muchas gracias a todos los participantes por estar interesados. ¡Nos vemos en un proximo sorteo!");
        String rutaPremio = path + "ganador.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(rutaPremio))){
            bw.write("Muchas felicidades por ganar la bicicleta, esperamos disfrutes y aproveches este premio. Gracias por participar " + participantes.get(ganador));
        } catch (IOException e) {
            System.out.println("Error al imprimir el ganador" + e.getMessage());
        }
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        boolean salir = true;
        while (salir) {
            leerTxt();
            System.out.println("¡Bienvenido a la TOMBOLA para ganar una bicicleta!\n" +
                    "1.- Agregar un nuevo participante.\n" +
                    "2.- Ver lista completa de participantes\n" +
                    "3.- Selecionar a un GANADOR!!");
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    AgregarParticipante("src/", "Concursantes.txt");
                    break;
                case "2":
                    System.out.println("------------Lista de participantes------------");
                    leerParticipantes();
                    System.out.println("----------------------------------------------");
                    break;
                case "3":
                    System.out.println("ELIGIENDO GANADOR AL AZAR....");
                    elegirGanador();
                    salir = false;
            }
        }
    }
}