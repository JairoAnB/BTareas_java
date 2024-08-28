import Calculos.Calculo;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList();

        personas.add(new Persona("Jairo", 20, 120, 1.72));
        personas.add(new Persona("Daniel", 20, 70, 1.90));
        personas.add(new Persona("Jose", 22, 60, 1.76));
        personas.add(new Persona("Javier", 24, 80, 1.20));
        personas.add(new Persona("Sheccid", 17, 54, 1.60));


        personas.forEach(persona -> {
            System.out.println("------------------------------------");
            System.out.println(persona.getNombre() + " :");
            System.out.println("Calculando su IMC...");
            Calculo.IMC(persona.getPeso(), persona.getAltura());
            System.out.println("");
            System.out.println("Su edad es: " + persona.getEdad());
            Calculo.Edad(persona.getEdad());
            System.out.println(persona);
            System.out.println("------------------------------------");
        });
    }
}