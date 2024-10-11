import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        System.out.println("Patron 1: ");

        for(int i = 1; i <= numero; ++i) {
            if (i % 2 != 0) {
                System.out.print("*");
            } else {
                System.out.print(".");
            }
        }
        System.out.println(" ");
        System.out.println("Patron 2: ");

        int d;
        for(d = 0; d < numero; ++d) {
            System.out.print("*");
        }

        System.out.println();

        for(d = 1; d < numero - 1; ++d) {
            System.out.print("*");

            for(int c = 1; c < numero - 1; ++c) {
                System.out.print(" ");
            }

            System.out.println("*");
        }

        for(d = 0; d < numero; ++d) {
            System.out.print("*");
        }

        System.out.println();
    }
}
