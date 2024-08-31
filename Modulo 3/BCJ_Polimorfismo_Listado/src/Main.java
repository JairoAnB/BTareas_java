import modal.Alumno;
import modal.Persona;
import modal.Profesor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();

        Profesor profesor = new Profesor("jose torres","12313-9","Historia");
        personas.add(profesor);
        Alumno alumno = new Alumno("Jose peralta","29383-0","jugar a la pelota",profesor);
        personas.add(alumno);
        Alumno alumno2 = new Alumno("pedro pica piedra","292343-0","pisar pasto",profesor);
        personas.add(alumno2);
        Alumno alumno3 = new Alumno("guillermo del toro","212183-0","Escribir libros",profesor);
        personas.add(alumno3);

        System.out.println("El curso esta compuesto por: ");
        System.out.println(profesor);
        System.out.println(alumno);
        System.out.println(alumno2);
        System.out.println(alumno3);
    }
}