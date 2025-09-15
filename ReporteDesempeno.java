package com.empresa.rrhh;

/**
 * Representa un reporte de desempeño para un empleado.
 */
public class ReporteDesempeno {
    private Empleado empleado;
    private String evaluacion;
    private double puntaje;

    public ReporteDesempeno(Empleado empleado, String evaluacion, double puntaje) {
        this.empleado = empleado;
        this.evaluacion = evaluacion;
        this.puntaje = puntaje;
    }

    public Empleado getEmpleado() { return empleado; }
    public String getEvaluacion() { return evaluacion; }
    public double getPuntaje() { return puntaje; }

    // Imprime el reporte por consola
    public void imprimirReporte() {
        System.out.println("=== Reporte de Desempeño ===");
        System.out.println("Empleado: " + empleado.getNombre());
        System.out.println("Cargo: " + empleado.getCargo());
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Puntaje: " + puntaje);
        System.out.printf("Bonificación estimada: $%.2f%n", empleado.calcularBonificacion());
    }
}
