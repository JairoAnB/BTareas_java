package classes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PruebasMockito {


    @Test
    @DisplayName("Test para verificar crear Equipo")
    public void testVerificarCrearEquipo() {
        List<Jugador> jugadoresMock = Mockito.mock(List.class);
        EquipoBasket equipoMock = Mockito.mock(EquipoBasket.class);

        equipoMock.crearEquipo("Los Lakers", "Los Angeles", jugadoresMock);
        verify(equipoMock).crearEquipo("Los Lakers", "Los Angeles", jugadoresMock);

    }
    @Test
    @DisplayName("Test para verificar agregar jugadores")
    public void testVerificarAgregarJugadores() {
        Jugador jugadorMock = Mockito.mock(Jugador.class);

        List<Jugador> jugadoresMock = Mockito.mock(List.class);
        jugadoresMock.add(jugadorMock);
        verify(jugadoresMock).add(jugadorMock);

    }
    @Test
    @DisplayName("Test Crear Equipo")
    public void testCrearEquipo() {
        List<Jugador> jugadoresMock = Mockito.mock(List.class);
        EquipoBasket equipoMock = Mockito.mock(EquipoBasket.class);
        when(equipoMock.crearEquipo("Los Lakers", "Los Angeles", jugadoresMock))
                .thenReturn("EquipoBasket{nombreEquipo='Los Lakers', ciudad='Los Angeles', listaJugadores=[]}");

        String resultado = equipoMock.crearEquipo("Los Lakers", "Los Angeles", jugadoresMock);
        verify(equipoMock).crearEquipo("Los Lakers", "Los Angeles", jugadoresMock);

        assertEquals("EquipoBasket{nombreEquipo='Los Lakers', ciudad='Los Angeles', listaJugadores=[]}", resultado);
    }
    @Test
    @DisplayName("Test para agregar jugadores")
    public void testAgregarJugadores() {
        Jugador jugadorMock = Mockito.mock(Jugador.class);

        List<Jugador> jugadoresMock = Mockito.mock(List.class);
        jugadoresMock.add(jugadorMock);
    }
}


