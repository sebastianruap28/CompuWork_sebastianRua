package com.empresa.rrhh;

/**
 * Empleado temporal con duración de contrato.
 */
public class EmpleadoTemporal extends Empleado {
    private int mesesContrato;

    public EmpleadoTemporal(String id, String nombre, String cargo, double salario, int mesesContrato) {
        super(id, nombre, cargo, salario);
        this.mesesContrato = mesesContrato;
    }

    public int getMesesContrato() {
        return mesesContrato;
    }

    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

    @Override
    public double calcularBonificacion() {
        // Ejemplo: bonificación fija menor para temporales
        return getSalario() * 0.05;
    }
}
