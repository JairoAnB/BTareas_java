package Calculos;

public class Calculo {

    public static void IMC (double peso, double altura) {
        double imc = peso/(altura * altura);
        System.out.println("Su indice de masa muscular es: " + imc);
        if (imc < 18.5) {
            System.out.println("Usted se encuentra con un peso bajo");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Usted se encuentra con un peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Usted se encuentra con sobrepeso");
        } else if (imc >= 30 && imc <= 34.99) {
            System.out.println("Usted se encuentra con obesidad leve");
        } else if (imc >= 35 && imc <= 39.99) {
            System.out.println("Usted se encuentra con obesidad media");
        } else {
            System.out.println("Usted se encuentra con obesidad morbida");
        }
    }

    public static void Edad (int edad){
        if (edad >=18){
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("Usted es menor de edad ");
        }
    }
}
