package com.empresa.rrhh.test;

import com.empresa.rrhh.Empleado;
import com.empresa.rrhh.EmpleadoPermanente;
import com.empresa.rrhh.EmpleadoTemporal;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmpleadoTest {

    @Test
    public void testBonificacionPermanente() {
        Empleado emp = new EmpleadoPermanente("001", "Juan", "Analista", 2000, 2);
        double esperado = 2000 * 0.10 * 2; // 400.0
        assertEquals(esperado, emp.calcularBonificacion(), 0.01);
    }

    @Test
    public void testBonificacionTemporal() {
        Empleado emp = new EmpleadoTemporal("002", "Ana", "Asistente", 1800, 6);
        double esperado = 1800 * 0.05; // 90.0
        assertEquals(esperado, emp.calcularBonificacion(), 0.01);
    }
}

