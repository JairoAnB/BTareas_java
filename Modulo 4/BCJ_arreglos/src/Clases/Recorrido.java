package Clases;

import java.util.Arrays;
import java.util.Scanner;

public class Recorrido {
    public static void Asignatura(){
        float [] notas;
        notas = new float[5];
        String asignatura [];
        asignatura = new String[5];

        notas[0] = 0;
        notas[1] = 0;
        notas[2] = 0;
        notas[3] = 0;
        notas[4] = 0;
        asignatura[0] = "";
        asignatura[1] = "";
        asignatura[2] = "";
        asignatura[3] = "";
        asignatura[4] = "";


        for (int i = 0; i < asignatura.length; i++ ) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese la materia a asignar: ");
            asignatura[i] = sc.nextLine();
            Scanner sc2 = new Scanner(System.in);
            System.out.print("Ingrese el promedio de la asignatura " + asignatura[i] + ": ");
            notas[i] = sc2.nextFloat();
        }
        System.out.println("Sus notas son las siguentes: ");
        System.out.println(asignatura[0] + " = " + notas[0]);
        System.out.println(asignatura[1] + " = " + notas[1]);
        System.out.println(asignatura[2] + " = " + notas[2]);
        System.out.println(asignatura[3] + " = " + notas[3]);
        System.out.println(asignatura[4] + " = " + notas[4]);
        float suma= notas[0] + notas[1] + notas[2] + notas[3] + notas[4];
        float PromedioFinal = suma/5;
        System.out.println("Su promedio general es: " + PromedioFinal);
    }
}
