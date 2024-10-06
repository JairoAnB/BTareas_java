package pruebas;

import modelo.Materia;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import servicios.PromedioServicioImp;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PromedioServicioTest {

    private final PromedioServicioImp promedioServicioImp = new PromedioServicioImp();

    @Test
    @DisplayName("Metodo para calcular promedio")
    public void calcularPromedioTest(){
        Materia materia = new Materia();
        materia.setNotas(Arrays.asList(4.0,5.0,5.2,7.0));

        double promedio = promedioServicioImp.calcularPromedio(materia.getNotas());

        double esperado = 5.3;
        assertEquals(esperado, promedio,0.001,"El promedio no es el esperado");
    }

    @Test
    @DisplayName("Metodo para calcular promedio con lista vacia")
    public void calcularPromedioVacioTest(){
        Materia materia = new Materia();
        materia.setNotas(Arrays.asList());

        double promedio = promedioServicioImp.calcularPromedio(materia.getNotas());

        assertEquals(0.0, promedio,"El promedio no es el esperado");
    }
}
