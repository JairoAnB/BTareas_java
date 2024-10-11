import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables
        System.out.println("Bienvenido");
        System.out.println("Por favor, ingrese la temperatura de hoy: ");
        int temperatura = sc.nextInt();

        if (temperatura <= 10) {
            System.out.println("Hay " + temperatura + " Grados. El tipo de clima de hoy es Frio");
        } else if (temperatura >11 && temperatura<20) {
            System.out.println("hay " + temperatura + " Grados. El tipo de clima de hoy es Nublado");
        } else if (temperatura >20 && temperatura <30) {
            System.out.println("Hay " + temperatura + " Grados. El tipo de clima de hoy es Caluroso");
        } else if (temperatura >= 30) {
            System.out.println("Hay " + temperatura + " Grados. El tipo de clima de hoy es Tropical");
        }
    }
}