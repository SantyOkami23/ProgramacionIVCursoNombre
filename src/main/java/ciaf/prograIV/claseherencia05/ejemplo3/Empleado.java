package ciaf.prograIV.claseherencia05.ejemplo3;

// Clase Empleado (subclase de Usuario)
public class Empleado extends Usuario {
    int idEmpleado;
    double salario;

    // Constructor
    public Empleado(String nombre, String correo, int idEmpleado, double salario) {
        super(nombre, correo); // Llama al constructor de la superclase Usuario
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }

    // Método para mostrar la información del empleado
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método de la superclase
        System.out.println("ID de Empleado: " + idEmpleado);
        System.out.println("Salario: $" + salario);
    }
}
