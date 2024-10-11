package Controller;

public class Persona {
    String nombreUsuario;
    String password;
    String nombre;
    String fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombreUsuario, String password, String nombre, String fechaNacimiento) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombreUsuario='" + nombreUsuario + '\'' + ", password='" + password + '\'' + ", nombre='" + nombre + '\'' + ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}
