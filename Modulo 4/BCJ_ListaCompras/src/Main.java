public class Main {
    public static void main(String[] args) {
        //Variables
        int Cocina = 299990;
        int Lavadora = 234540;
        int Comedor = 159990;
        int Televisor = 345100;
        int Dolar = 916;
        //Sumatorias
        int Total = Cocina + Lavadora + Comedor + Televisor;
        double PriceIva = (double) (Total * 19)/100;
        double TotalIva = Total + PriceIva;
        int PriceTotal = (int) (TotalIva/Dolar);
        //Prints principales
        System.out.println("El total de su compra es: $" + Total + " CLP");
        System.out.println("El IVA es: $" + PriceIva + " CLP");
        System.out.println("El total más IVA es: " + TotalIva + " CLP");
        System.out.println("El total de su compra en dolares es: $" + PriceTotal + " USD");
    }
}