package com.empresa.rrhh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase que representa un departamento y su lista de empleados.
 */
public class Departamento {
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    // Agrega un empleado (evita duplicados de referencia)
    public void agregarEmpleado(Empleado e) {
        if (e == null) return;
        if (!empleados.contains(e)) {
            empleados.add(e);
        }
    }

    // Remueve un empleado; lanza excepción si no existe
    public void removerEmpleado(Empleado e) {
        boolean removed = empleados.remove(e);
        if (!removed) {
            throw new IllegalArgumentException("El empleado no existe en este departamento.");
        }
    }

    // Devuelve una lista inmodificable (encapsulamiento)
    public List<Empleado> getEmpleados() {
        return Collections.unmodifiableList(empleados);
    }

    // Método auxiliar para imprimir la lista por consola
    public void listarEmpleados() {
        System.out.println("Empleados en el departamento " + nombre + ":");
        if (empleados.isEmpty()) {
            System.out.println("  (ninguno)");
            return;
        }
        for (Empleado e : empleados) {
            System.out.println(" - " + e.getNombre() + " (" + e.getCargo() + ")");
        }
    }
}
