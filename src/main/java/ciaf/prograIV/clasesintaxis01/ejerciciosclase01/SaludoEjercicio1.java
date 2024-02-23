package ciaf.prograIV.clasesintaxis01.ejerciciosclase01;
import java.util.Scanner;

public class SaludoEjercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese su nombre
        System.out.println("Por favor, ingresa tu nombre:");
        String nombre = scanner.nextLine();

        // Imprimimos un saludo en consola con el nombre proporcionado
        System.out.println("¡Hola, " + nombre + "! Bienvenido.");

        scanner.close();
    }
}
