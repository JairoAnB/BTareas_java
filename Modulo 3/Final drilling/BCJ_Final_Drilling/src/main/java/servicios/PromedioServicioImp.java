package servicios;

import modelo.Alumno;
import modelo.Materia;

import java.util.List;

public class PromedioServicioImp {
    public double calcularPromedio(List<Double> notas) {
        double sumaNotas = 0;

        for (Double nota : notas) {
            sumaNotas += nota;
        }

        if (notas.isEmpty()) {
            return 0.0;
        }

        return sumaNotas / notas.size();
    }
}