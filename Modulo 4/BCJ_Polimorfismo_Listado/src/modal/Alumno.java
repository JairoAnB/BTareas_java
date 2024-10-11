package modal;

import Interface.Interface;

public class Alumno extends Persona implements Interface {

     private String hobby;
     private Profesor profesor;

    public Alumno() {
    }

    public Alumno(String nombre, String rut, String hobby, Profesor profesor) {
        super(nombre, rut);
        this.hobby = hobby;
        this.profesor = profesor;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Alumno [" + "Nombre= " + nombre + ", RUT= " + rut + ", profesor= " + profesor + ", Hobbie= " + hobby + "] ";
    }

    @Override
    public void leer() {

    }

    @Override
    public void realizarEjercicios() {

    }
}
