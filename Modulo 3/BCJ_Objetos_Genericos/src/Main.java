import Classes.Alumno;
import Classes.Profesor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <T> void main(String[] args) {
        //profesores
        ArrayList<Profesor<String>> profesors = new ArrayList<>();
        Profesor<String> profesor = new Profesor<>("Jose Luis","09-01-1983");
        profesors.add(profesor);
        //alumnos
        ArrayList<Alumno<Integer>> alumnos = new ArrayList<>();
        Alumno <Integer> alumno = new Alumno<>("Jairo Gonzalez",21032004,2);
        Alumno <Integer> alumno2 = new Alumno<>("Luis Sepulveda",29101995,10);
        Alumno <Integer> alumno3 = new Alumno<>("Javier Gomez",28091998,100);
        alumnos.add(alumno);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        //Ciclos
        System.out.println(profesor);
        for (Alumno<Integer> p : alumnos) {
            System.out.println("Alumno - " + p.getNombre());
        }
    }
}