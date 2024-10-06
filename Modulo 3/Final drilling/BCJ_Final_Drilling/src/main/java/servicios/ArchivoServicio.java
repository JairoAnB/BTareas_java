package servicios;

import modelo.Alumno;
import modelo.Materia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ArchivoServicio {

    private List<Alumno> alumnosACargar;
    private PromedioServicioImp promedioServicioImp = new PromedioServicioImp();

    public void exportarDatos(Map<String, Alumno> alumnos){
        String ruta = System.getProperty("user.home") + "/Desktop";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta + "/promedios.txt"))) {
            for (Alumno alumno : alumnos.values()) {
                writer.write("Alumno: " + alumno.getRut() + " - " + alumno.getNombre() + "\n");
                for (Materia materia : alumno.getMaterias()) {
                    double promedio = promedioServicioImp.calcularPromedio(materia.getNotas());
                    writer.write("Materia: " + materia.getNombre() + " - Promedio: " + promedio + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Error al exportar datos: " + e.getMessage());
        }
    }
}
