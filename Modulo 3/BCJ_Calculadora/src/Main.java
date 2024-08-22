import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int altura, base,  resultadoP, resultadoA;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la altura del rectangulo: ");   altura = sc.nextInt();
        System.out.println("Ingrese la base del rectangulo: ");   base = sc.nextInt();
        //Calculo
        resultadoA = base*altura;
        resultadoP = base*2+altura*2;
        System.out.println("El area del perimetro es: " + resultadoP + " metros" );
        System.out.println("El area del Area es: " + resultadoA + " metros");
    }
}