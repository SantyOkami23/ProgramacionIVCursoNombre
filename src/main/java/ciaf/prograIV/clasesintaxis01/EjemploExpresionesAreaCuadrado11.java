package ciaf.prograIV.clasesintaxis01;
import java.util.Scanner;



public class EjemploExpresionesAreaCuadrado11 {
    private double ancho;
    private double altura;

    // Constructor
    public EjemploExpresionesAreaCuadrado11(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }

    // Método para calcular el área del rectángulo
    public double calcularArea() {
        return ancho * altura;
    }

    // Método para mostrar información del rectángulo
    public void mostrarInformacion() {
        System.out.println("Rectángulo:");
        System.out.println("Ancho: " + ancho);
        System.out.println("Altura: " + altura);
        System.out.println("area: " + calcularArea());
    }

    // Método main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos por consola para el rectángulo
        System.out.println("Ingrese el ancho del rectángulo:");
        double ancho = scanner.nextDouble();
        System.out.println("Ingrese la altura del rectángulo:");
        double altura = scanner.nextDouble();
        EjemploExpresionesAreaCuadrado11 rectangulo = new EjemploExpresionesAreaCuadrado11(ancho, altura);

        scanner.close();

        // Mostrar información del rectángulo
        rectangulo.mostrarInformacion();
    }
}
