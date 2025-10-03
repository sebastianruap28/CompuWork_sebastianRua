package com.empresa.rrhh.test;

import com.empresa.rrhh.Departamento;
import com.empresa.rrhh.Empleado;
import com.empresa.rrhh.EmpleadoPermanente;
import org.junit.Test;
import static org.junit.Assert.*;

public class DepartamentoTest {

    @Test
    public void testAgregarEmpleado() {
        Departamento dpto = new Departamento("TI");
        Empleado emp = new EmpleadoPermanente("003", "Carlos", "Ingeniero", 2500, 1);
        dpto.agregarEmpleado(emp);

        assertTrue(dpto.getEmpleados().contains(emp));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoverEmpleadoInexistente() {
        Departamento dpto = new Departamento("TI");
        Empleado emp = new EmpleadoPermanente("004", "Laura", "Diseñadora", 2200, 2);

        // Nunca lo agregamos → debe lanzar excepción
        dpto.removerEmpleado(emp);
    }
}

