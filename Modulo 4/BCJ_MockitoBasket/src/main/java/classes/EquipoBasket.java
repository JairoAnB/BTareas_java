package classes;

import java.util.List;

public class EquipoBasket {
    private String nombreEquipo;
    private String ciudad;
    private List<Jugador> listaJugadores;

    public EquipoBasket() {
    }

    public EquipoBasket(String nombreEquipo, String ciudad, List<Jugador> listaJugadores) {
        this.nombreEquipo = nombreEquipo;
        this.ciudad = ciudad;
        this.listaJugadores = listaJugadores;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    @Override
    public String toString() {
        return "EquipoBasket{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", listaJugadores=" + listaJugadores +
                '}';
    }

    public String crearEquipo (String nombreEquipo, String ciudad, List<Jugador> listaJugadores){
        return new EquipoBasket(nombreEquipo,ciudad,listaJugadores).toString();
    }
}
