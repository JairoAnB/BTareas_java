package org.horoscopo.final_drilling_modulo_5.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class UsuarioDtoCreate {
    private Long id;
    private String nombre;
    private String username;
    private String password;
    private String email;
    private String animalHoroscopo;
    private LocalDate fechaNacimiento;

    public UsuarioDtoCreate() {
    }

    public UsuarioDtoCreate(Long id, String nombre, String username, String password, String email, String animalHoroscopo, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.username = username;
        this.password = password;
        this.email = email;
        this.animalHoroscopo = animalHoroscopo;
        this.fechaNacimiento = fechaNacimiento;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAnimalHoroscopo() {
        return animalHoroscopo;
    }

    public void setAnimalHoroscopo(String animalHoroscopo) {
        this.animalHoroscopo = animalHoroscopo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "UsuarioDtoCreate{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", animalHoroscopo='" + animalHoroscopo + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
