package com.empresa.rrhh;

/**
 * Clase principal para probar la aplicación.
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Crear empleados
            Empleado emp1 = new EmpleadoPermanente("001", "Juan Pérez", "Analista", 2500.00, 3);
            Empleado emp2 = new EmpleadoTemporal("002", "Ana Gómez", "Asistente", 1800.00, 6);

            // Crear departamento y agregar empleados
            Departamento recursos = new Departamento("Recursos Humanos");
            recursos.agregarEmpleado(emp1);
            recursos.agregarEmpleado(emp2);

            // Listar empleados
            recursos.listarEmpleados();

            // Generar reportes
            ReporteDesempeno rep1 = new ReporteDesempeno(emp1, "Excelente", 95.5);
            rep1.imprimirReporte();

            ReporteDesempeno rep2 = new ReporteDesempeno(emp2, "Bueno", 85.0);
            rep2.imprimirReporte();

            // Probar remover (funciona si pasas la misma referencia emp1)
            recursos.removerEmpleado(emp1);
            recursos.listarEmpleados();

            // Intentar remover otra vez para ver la excepción
            System.out.println("\nIntentando remover a Juan otra vez (debe lanzar excepción)...");
            recursos.removerEmpleado(emp1);

        } catch (IllegalArgumentException ex) {
            System.err.println("Error de operación: " + ex.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
