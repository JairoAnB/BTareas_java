package modal;

import Interface.Interface;

public class Profesor extends Persona implements Interface {

    private String especialidad;

    public Profesor() {
    }

    public Profesor(String especialidad) {
        this.especialidad = especialidad;
    }

    public Profesor(String nombre, String rut, String especialidad) {
        super(nombre, rut);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor [" + "especialidad= " + especialidad  + ", Nombre= " + nombre +  ", RUT= " + rut + "]" ;
    }

    @Override
    public void leer() {

    }

    @Override
    public void realizarEjercicios() {

    }
}