package org.finaldrilling.finaldrilling_modulo6.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.Set;

public class AlumnoDTO {

    private Long id;
    private String rut;
    private String nombre;
    private String direccion;

    @JsonManagedReference
    private Set<MateriaDTO> materiaList;

    public AlumnoDTO() {
    }

    public AlumnoDTO(Long id, String rut, String nombre, String direccion, Set<MateriaDTO> materiaList) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.materiaList = materiaList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Set<MateriaDTO> getMateriaList() {
        return materiaList;
    }

    public void setMateriaList(Set<MateriaDTO> materiaList) {
        this.materiaList = materiaList;
    }

    @Override
    public String toString() {
        return "AlumnoDTO{" +
                "id=" + id +
                ", rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", materiaList=" + materiaList +
                '}';
    }
}
