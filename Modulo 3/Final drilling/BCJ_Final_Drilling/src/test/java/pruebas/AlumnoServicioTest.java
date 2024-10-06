package pruebas;

import modelo.Alumno;
import modelo.Materia;
import modelo.MateriaEnum;
import servicios.AlumnoServicio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class AlumnoServicioTest {

    private AlumnoServicio alumnoServicio;
    private Materia matematicas;
    private Materia lenguaje;
    private Alumno mapu;

    @BeforeEach
    public void setup() {
        alumnoServicio = new AlumnoServicio();
        matematicas = new Materia(MateriaEnum.Matematicas);
        lenguaje = new Materia(MateriaEnum.Lenguaje);
        mapu = new Alumno("12345678-9", "Maipu", "Lopez", "Calle Falsa 1234");
    }

    @Test
    @DisplayName("Test para crear Alumno")
    public void crearAlumnoTest() {
        alumnoServicio.crearAlumno(mapu);
        assertEquals(1, alumnoServicio.listarAlumnos().size());
        assertEquals(mapu, alumnoServicio.listarAlumnos().get("12345678-9"));
    }

    @Test
    @DisplayName("Test para crear alumno cuando ya existe")
    public void crearAlumnoYaExistenteTest() {
        alumnoServicio.crearAlumno(mapu);

        alumnoServicio.crearAlumno(mapu);

        assertEquals(1, alumnoServicio.listarAlumnos().size());
    }

    @Test
    @DisplayName("Test para agregar una materia")
    public void agregarMateriaTest() {
        alumnoServicio.crearAlumno(mapu);
        alumnoServicio.agregarMateria("12345678-9", matematicas);

        List<Materia> materias = alumnoServicio.materiasPorAlumnos("12345678-9");
        assertEquals(1, materias.size());
        assertEquals(matematicas, materias.get(0));

        alumnoServicio.agregarMateria("12345678-9", lenguaje);
        materias = alumnoServicio.materiasPorAlumnos("12345678-9");
        assertEquals(2, materias.size());
    }

    @Test
    @DisplayName("Test para agregar una Materia a alumno que no existe")
    public void agregarMateriaAlumnoNoExistenteTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            alumnoServicio.agregarMateria("no-existe", matematicas);
        });
    }

    @Test
    @DisplayName("Test para listar alumnos")
    public void listarAlumnosTest() {
        alumnoServicio.crearAlumno(mapu);

        Map<String, Alumno> alumnos = alumnoServicio.listarAlumnos();
        assertEquals(1, alumnos.size());
        assertEquals(mapu, alumnos.get("12345678-9"));
    }
}

