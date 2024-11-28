package org.horoscopo.final_drilling_modulo_5.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Table(name = "usuarios")
@Entity //sirve para indicar que es una entidad JPA y que se mapeara una tabla de base de datos
@Data //Genero automaticamente metodos como getter and setter.
@NoArgsConstructor //Genero un constructor sin argumentos
@AllArgsConstructor // Genero un constructor con argumentos.
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Strategy junto a id es para indicar que el valor de la clave primaria sera generado automaticamente por la db
    private Long id;

    private String nombre;
    private String username;

    @Column(unique = true)
    private String email;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    private String password;
    private String animal;

    //constructor momentanio

    public Usuario(Long id, String nombre, String username, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
