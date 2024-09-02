package Classes;

public class Profesor <T> {

    private String nombre;
    private T fechaNacimiento;

    public Profesor() {
    }

    public Profesor(String nombre, T fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
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

    @Override
    public String toString() {
        return "Profesor - " + nombre;
    }
}
