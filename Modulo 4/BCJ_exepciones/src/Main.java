public class Main {
    public static void main(String[] args) {
        int denominador[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int numerador[] = {2, 0, 4, 4, 0, 8};

        Metodo metodo = new Metodo();

        try {
            metodo.dividir(numerador, denominador);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Fuera del limite de la matriz.");
            System.out.println("Exepcion en el main, fin del programa.");
        }
    }
}
