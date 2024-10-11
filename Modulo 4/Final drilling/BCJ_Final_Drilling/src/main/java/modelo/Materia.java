package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Materia {

    private MateriaEnum nombre;
    private List<Double> notas;

    public Materia() {
        this.notas = new ArrayList<>();
    }

    public Materia(MateriaEnum nombre, List<Double> notas) {
        this.nombre = nombre;
        this.notas = new ArrayList<>(notas);
    }

    public Materia(MateriaEnum nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    public MateriaEnum getNombre() {
        return nombre;
    }

    public void setNombre(MateriaEnum nombre) {
        this.nombre = nombre;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Materia materia = (Materia) obj;
        return nombre == materia.nombre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
