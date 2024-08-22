import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su peso en Kg: ");
        double Peso = sc.nextDouble();

        System.out.println("Ingrese su altura en metros: ");
        double Altura;
        Altura = sc.nextDouble();

        System.out.println("Calculando su IMC....");

        double Resultado;
        Resultado = Peso/Math.pow(Altura,2);
        System.out.println("Su indice de masa muscular es: " + Resultado);

    }
}