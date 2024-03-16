package ciaf.prograIV.conceptospoo04.encapsulacion;

// Ejemplo de encapsulamiento en POO
class Empleado01 {
    private String nombre;

    private String apellido;
    private double salario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }







    // Constructor
    public Empleado01(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    // Métodos públicos para acceder a los datos privados
    public double obtenerSalario() {
        return salario;
    }

    public void aumentarSalario(double aumento) {
        salario += aumento;
    }
}
