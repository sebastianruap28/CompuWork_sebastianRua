package com.empresa.rrhh;

/**
 * Empleado permanente con antigüedad que afecta la bonificación.
 */
public class EmpleadoPermanente extends Empleado {
    private int aniosAntiguedad;

    public EmpleadoPermanente(String id, String nombre, String cargo, double salario, int aniosAntiguedad) {
        super(id, nombre, cargo, salario);
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    @Override
    public double calcularBonificacion() {
        // Ejemplo simple: 10% del salario por cada año de antigüedad
        return getSalario() * 0.10 * aniosAntiguedad;
    }
}
