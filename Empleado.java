package com.empresa.rrhh;

/**
 * Clase abstracta base para empleados.
 */
public abstract class Empleado {
    private String id;
    private String nombre;
    private String cargo;
    private double salario;

    public Empleado(String id, String nombre, String cargo, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCargo() { return cargo; }
    public double getSalario() { return salario; }

    // Setters
    public void setCargo(String cargo) { this.cargo = cargo; }
    public void setSalario(double salario) { this.salario = salario; }

    // Método que deben implementar las subclases
    public abstract double calcularBonificacion();

    @Override
    public String toString() {
        return nombre + " (" + cargo + ") - ID: " + id;
    }
}
