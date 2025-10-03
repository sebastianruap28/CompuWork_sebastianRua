package com.empresa.rrhh.test;

import com.empresa.rrhh.Empleado;
import com.empresa.rrhh.EmpleadoTemporal;
import com.empresa.rrhh.ReporteDesempeno;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReporteDesempenoTest {

    @Test
    public void testDatosReporte() {
        Empleado emp = new EmpleadoTemporal("005", "Mario", "Practicante", 1000, 3);
        ReporteDesempeno rep = new ReporteDesempeno(emp, "Aceptable", 75.0);

        assertEquals("Mario", rep.getEmpleado().getNombre());
        assertEquals("Aceptable", rep.getEvaluacion());
        assertEquals(75.0, rep.getPuntaje(), 0.01);
    }
}

