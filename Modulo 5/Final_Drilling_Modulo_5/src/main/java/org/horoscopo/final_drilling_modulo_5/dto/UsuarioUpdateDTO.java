package org.horoscopo.final_drilling_modulo_5.dto;

public class UsuarioUpdateDTO {

    private Long id;
    private String nombre;
    private String correo;
    private String password;
    private String username;

    public UsuarioUpdateDTO() {
    }

    public UsuarioUpdateDTO(Long id, String nombre, String correo, String password, String username) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UsuarioUpdateDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
