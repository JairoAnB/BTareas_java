package Classes;

public class Alumno <T> {
    private String nombre;
    private  T fechaNacimiento;
    private T tareasPendientes;

    public Alumno() {
    }

    public Alumno(String nombre, T fechaNacimiento, T tareasPendientes) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.tareasPendientes = tareasPendientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public T getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(T fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public T getTareasPendientes() {
        return tareasPendientes;
    }

    public void setTareasPendientes(T tareasPendientes) {
        this.tareasPendientes = tareasPendientes;
    }

    @Override
    public String toString() {
        return "Alumno - " + nombre;
    }
}
