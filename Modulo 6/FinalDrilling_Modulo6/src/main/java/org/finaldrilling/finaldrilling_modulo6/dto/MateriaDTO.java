package org.finaldrilling.finaldrilling_modulo6.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class MateriaDTO {

    private Long id;
    private String nombre;
    @JsonBackReference
    private AlumnoDTO alumno;

    public MateriaDTO() {
    }

    public MateriaDTO(Long id, String nombre, AlumnoDTO alumno) {
        this.id = id;
        this.nombre = nombre;
        this.alumno = alumno;
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

    public AlumnoDTO getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoDTO alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "MateriaDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", alumno=" + alumno +
                '}';
    }
}
