package modelo;

 abstract class Vehiculo {

    private int numeroRuedas;
    private int CantidadVentanas;

     public Vehiculo() {
     }

     public Vehiculo(int numeroRuedas, int cantidadVentanas) {
         super();
         this.numeroRuedas = numeroRuedas;
         CantidadVentanas = cantidadVentanas;
     }

     public int getNumeroRuedas() {
         return numeroRuedas;
     }

     public void setNumeroRuedas(int numeroRuedas) {
         this.numeroRuedas = numeroRuedas;
     }

     public int getCantidadVentanas() {
         return CantidadVentanas;
     }

     public void setCantidadVentanas(int cantidadVentanas) {
         CantidadVentanas = cantidadVentanas;
     }

     @Override
     public String toString() {
         return "Vehiculo{" +
                 "numeroRuedas=" + numeroRuedas +
                 ", CantidadVentanas=" + CantidadVentanas +
                 '}';
     }

    abstract void encender();
    abstract void apagar();
}
