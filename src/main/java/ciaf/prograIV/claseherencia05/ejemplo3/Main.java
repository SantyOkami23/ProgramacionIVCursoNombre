package ciaf.prograIV.claseherencia05.ejemplo3;

// Clase principal que contiene el método main
public class Main {
    public static void main(String[] args) {
        // Crear instancias de las subclases
        Empleado empleado1 = new Empleado("Juan Pérez", "juan@example.com", 1001, 2500.0);
        Cliente cliente1 = new Cliente("María García", "maria@example.com", 2001, 1500.0);

        // Mostrar información de los empleados y clientes
        System.out.println("Información del Empleado:");
        empleado1.mostrarInfo();
        System.out.println();

        System.out.println("Información del Cliente:");
        cliente1.mostrarInfo();
    }
}

