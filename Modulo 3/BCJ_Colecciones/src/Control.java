import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Control {
    private List<Integer> numeros = new ArrayList<Integer>();

    private void leerValores(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 8 numeros: ");
        while (numeros.size() <8){
            int num = sc.nextInt();
            numeros.add(num);
            if (num == -99){
                System.out.println("Saliendo del programa....");
                break;
            }
        }
    }
    private void calcularSuma(){
        int suma = 0;
        for (int i = 0; i < numeros.size(); i++){
            suma += numeros.get(i);
        }
        System.out.println("La suma total de todos los numeros es: " + suma);
    }
    private int calcularMedia(){
        int suma = 0;
        for (int numero : numeros){
            suma += numero;
        }
        return suma / numeros.size();
    }
    private int calcularMenores(){
        int contarMenores = 0;
        for (int numero : numeros){
            if(numero <= calcularMedia()){
                contarMenores++;
            }
        }
        return contarMenores;
    }
    private int calcularMayores() {
        int contarMayores = 0;
        for (int numero : numeros) {
            if (numero > calcularMedia()) {
                contarMayores ++;
            }
        }
        return contarMayores;
    }
    public void iniciar(){
        leerValores();
        calcularSuma();
        System.out.println("La media de todos los numeros es: " + calcularMedia());
        System.out.println("La cantidad de numeros mayores a la media es: " + calcularMayores());
        System.out.println("La cantidad de numeros menores a la media es: " + calcularMenores());

    }
}
