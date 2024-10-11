import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables
        int Total;
        System.out.print("Ingrese su nombre: ");
        String Nombre = sc.nextLine();

        System.out.print("Ingrese el valor del producto 1: ");
        int Producto1 = sc.nextInt();

        System.out.print("Ingrese el valor del producto 2: ");
        int Producto2 = sc.nextInt();

        System.out.print("Ingrese el valor del producto 3: ");
        int Producto3 = sc.nextInt();

        System.out.print("Ingrese el valor del producto 4: ");
        int Producto4 = sc.nextInt();

        System.out.print("Ingrese el valor del producto 5: ");
        int Producto5 = sc.nextInt();

        //Condicionales y sumatorias
        Total = Producto1 + Producto2 + Producto3 + Producto4 + Producto5;
        if (Total < 10001){
            System.out.print(Nombre + " Pagaras con efectivo el total de: " + Total);
        } else if (Total < 20000) {
            System.out.print(Nombre + " Pagaras con tarjeta el total de: " + Total);
        } else {
            System.out.print(Nombre + " Pagaras con cheque el total de: " + Total);
        }
    }
}