public class Metodo {
    public void dividir(int[] numerador, int[] denominador) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int maxLength = Math.max(numerador.length, denominador.length);
        for (int i = 0; i < maxLength; i++) {
            try {
                int resultado = denominador[i] / numerador[i];
                System.out.println(denominador[i] + "/" + numerador[i] + " = " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir por cero");
            }
        }
    }
}