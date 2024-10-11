package controlador;

public class Controler {

    public void validacionNombre(String nombre) {
            if (nombre.isEmpty()) {
                System.out.println("El nombre no puede estar vacio");
            }
    }
    public void valicacionApellido(String apellido) {
        if (apellido.isEmpty()) {
            System.out.println("El apellido no puede estar vacio");
        }
    }
    public void validacionCorreo(String correo){
        if(!correo.contains("@")){
            System.out.println("El correo no contiene un @ intenta nuevamente.");
        }
    }
    public void validacionContrasena(String contrasena){
        if(contrasena.length() < 8){
            System.out.println("La contraseña tiene que tener mas de 8 caracteres");
        }
    }
}

