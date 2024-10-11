package Controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Control {
    static ArrayList<Persona> personas = new ArrayList();


    static {
        personas.add(new Persona("Heekit", "isa2993", "jairo", "21-03-2004"));
    }

    public void Ingreso() {
        // Variables scanner
        Scanner sc = new Scanner(System.in);
    while (true){
        if (personas.size() >= 10) {
            System.out.println("Lista llena, por favor reinicie el programa.");
            return;
        }

        System.out.println("Ingrese su usuario:");
        String usuario = sc.nextLine();

        String password;
        do {
            System.out.println("Ingrese su contraseña:");
            password = sc.nextLine();
            String resultadoValidacion = validarPassword(password);
            if (!resultadoValidacion.equals("Contraseña segura.")) {
                System.out.println(resultadoValidacion);
            } else {
                break;
            }
        } while (true);

        System.out.println("Ingrese su nombre completo:");
        String nombreCompleto = sc.nextLine();
        System.out.println("Ingrese su fecha de nacimiento (DD-MM-YYYY):");
        String fechaNacimiento = sc.nextLine();

        personas.add(new Persona(usuario, password, nombreCompleto, fechaNacimiento));

        System.out.println("¡Usuario registrado satisfactoriamente!");
        System.out.println("Bienvenido " + usuario);

        if(validarEdad(fechaNacimiento)){
            System.out.println("Puede pasar a la zona para mayores de 18 años");
        }else{
            System.out.println("Tiene prohibido pasar a la zona de mayores de 18 años. Lo siento!");
        }
        System.out.println("");
        System.out.println("Lista total de usuarios registrados: ");
        mostrarPersonas();
    }
    }
    public void mostrarPersonas() {
        for (int i = 0; i <personas.size(); i++) {
            System.out.println((i + 1) + ". " + personas.get(i).getNombre());
        }
        System.out.println("------------------------------------------");
    }

    private String validarPassword(String password) {
        if (password.length() < 10) {
            return "La contraseña debe tener al menos 10 caracteres.";
        }
        int contadorsimbolos = 0;
        int contadorMayusculas = 0;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                contadorMayusculas++;
            }
            if (Character.isDigit(c)|| !Character.isLetter(c) ) {
                contadorsimbolos++;
            }
        }
        if (contadorMayusculas < 2) {
            return "La contraseña es debil debe tener al menos 2 letras mayúsculas.";
        }
        if(contadorsimbolos < 3) {
            return "La contraseña sigue siendo debil debe tener al menos 3 simbolos.";
        }
        return "Contraseña segura.";
    }


    private boolean validarEdad(String edad) {
      String[] partes = edad.split("-");
      int anio = Integer.parseInt(partes[2]);

      int anioactual = Calendar.getInstance().get(Calendar.YEAR);
      int anios = anioactual - anio;

    return anios >= 18;
    }
}

