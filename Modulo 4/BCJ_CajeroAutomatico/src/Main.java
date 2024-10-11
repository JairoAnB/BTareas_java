import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione la opcion:\n1. Depositar dinero a mi cuenta\n2. Retirar dinero de mi cuenta\n3. Salir ");
        int Opciones = sc.nextInt();
        int Saldo = 1000;
        switch (Opciones) {
                case 1:
                    System.out.println("Su saldo inicial es: " + Saldo + "\nDigite la cantidad que desea depositar");
                     int Deposito = sc.nextInt();
                     int SaldoD = Saldo + Deposito;
                     System.out.println("Su saldo actual es: " + SaldoD);
                     System.out.println("¡Gracias por operar con nosotros!");
                break;
                case 2:
                    System.out.println("Por favor digite el saldo a retirar: ");
                    int Retirardinero = sc.nextInt();
                    int SaldoR = Saldo - Retirardinero;
                    if (Saldo < Retirardinero) {
                        System.out.println("Su saldo en insuficiente.");
                        System.out.println("¡Gracias por operar con nosotros!");
                    }else {
                        System.out.println("¡Retiro con exito!");
                        System.out.println("Su saldo actual es: " + SaldoR);
                        System.out.println("¡Gracias por operar con nosotros!");
                    }
                    break;
                case 3:
                    System.out.println("¡Gracias por operar con nosotros!");
                    break;
        }



    }
}