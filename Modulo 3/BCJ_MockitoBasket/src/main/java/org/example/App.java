package org.example;

import classes.EquipoBasket;
import classes.Jugador;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Jugador> jugadores = new ArrayList<>();

        EquipoBasket eb = new EquipoBasket();
        //Secuencia para generar un equipo de baloncesto

        //Crear jugadores
        jugadores.add(new Jugador("Juan", 25, 10));
        jugadores.add(new Jugador("Pedro", 23, 11));
        jugadores.add(new Jugador("Luis", 24, 12));
        //Crear equipo
        String equipo = eb.crearEquipo("Los Lakers", "Los Angeles", jugadores);

        System.out.println(equipo);
    }
}
