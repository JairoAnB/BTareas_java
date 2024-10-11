import classes.Entrenador;
import classes.Futbolista;
import classes.Persona;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Creo jugadores y entrenador y arraylist
        Entrenador entrenador = new Entrenador("Carlo", "Ancelotti",65,4);
        ArrayList<Futbolista> equipo = new ArrayList<Futbolista>();
        equipo.add(new Futbolista("Thibaut", "Courtois", 30, 1, "Portero"));
        equipo.add(new Futbolista("Dani", "Carvajal", 32, 2, "Lateral Derecho"));
        equipo.add(new Futbolista("Fran", "García", 25, 20, "Lateral Izquierdo"));
        equipo.add(new Futbolista("Antonio", "Rudiger", 31, 22, "Defensa Central"));
        equipo.add(new Futbolista("Eder", "Militao", 31, 3, "Defensa Central"));
        equipo.add(new Futbolista("Jude", "Bellingham", 21, 5, "Centrocampista"));
        equipo.add(new Futbolista("Federico", "Valverde", 22, 8, "Centrocampista"));
        equipo.add(new Futbolista("Luka", "Modric", 35, 10, "Centro campista ofensivo"));
        equipo.add(new Futbolista("Vinicius", "Junior", 23, 7, "Extremo derecho"));
        equipo.add(new Futbolista("Rodrygo", "Goes", 21, 11, "Extremo izquierdo"));
        equipo.add(new Futbolista("Kylian", "Mbappe", 23, 9, "Delantero Centro"));
        //Recorro el arraylist y muestro los datos
        System.out.println("Real Madrid C.F. - Plantilla 2024/2025");
        System.out.println("Entrenador: " + entrenador.getNombre() + " " + entrenador.getApellido() + " - " + "Edad: " + entrenador.getEdad() + " - " + "Años dirigiendo: " + entrenador.getAniosTrabajando());
        System.out.println(" ");
        for (Futbolista persona : equipo) {
            System.out.println("Jugador: " + persona.getNombre() + " " + persona.getApellido() + " - " +  "Edad: " + persona.getEdad() + " - " + "Posicion: " +  persona.getPosicion() );
        }
    }
}


