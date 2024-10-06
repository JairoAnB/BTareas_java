package servicios;

import modelo.Alumno;
import modelo.Materia;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlumnoServicio {
    private Map<String, Alumno> listaAlumnos = new HashMap<>();

    public void crearAlumno(Alumno alumno) {
        listaAlumnos.put(alumno.getRut(), alumno);
    }

    public void agregarMateria(String rutAlumno, Materia materia) {
        Alumno alumno = listaAlumnos.get(rutAlumno);
        if (alumno == null) {
            throw new IllegalArgumentException("El alumno con RUT " + rutAlumno + " no existe.");
        }
        alumno.getMaterias().add(materia);
    }

    public List<Materia> materiasPorAlumnos(String rutAlumno) {
        Alumno alumno = listaAlumnos.get(rutAlumno);
        return (alumno != null) ? alumno.getMaterias() : null;
    }

    public Map<String, Alumno> listarAlumnos() {
        return listaAlumnos;
    }
}
