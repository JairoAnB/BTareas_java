import clases.*;

public class Main {
    public static void main(String[] args) {
        Alas alas = new Alas("10", true);
        Cabina cabina = new Cabina(100, 2, true, true);
        Motor motor = new Motor(true, true);
        PistaAeropuerto pistaAeropuerto = new PistaAeropuerto(true);
        Ruedas ruedas = new Ruedas(120,4,true,true);
        Avion avion = new Avion("Boeing", "747", true, alas, motor, ruedas, cabina);


        System.out.println("------Revision del avion: " + avion.getMarca() + "------");
        System.out.println("------Revision de las alas------");
        alas.pruebaAlas();
        System.out.println("------Revision de la cabina------");
        cabina.cerrarPuertas();
        System.out.println("------Revision de las ruedas------");
        ruedas.cerrarPuertas();
        System.out.println("------Revision del motor------");
        motor.cargarCombustible();
        System.out.println("------Revision de la pista------");
        pistaAeropuerto.pruebaPista();
        System.out.println("------Despegue del avion------");
        avion.recibirPasajeros();
        System.out.println("------INICIANDO DESPEGE------");
        avion.despegar();
    }
}