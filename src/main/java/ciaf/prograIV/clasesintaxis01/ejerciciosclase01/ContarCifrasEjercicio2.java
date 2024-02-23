package ciaf.prograIV.clasesintaxis01.ejerciciosclase01;
import java.util.Scanner;

public class ContarCifrasEjercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese un número
        System.out.println("Por favor, ingresa un número:");
        int numero = scanner.nextInt();

        // Convertimos el número a una cadena para contar sus cifras
        String numeroComoCadena = Integer.toString(numero);

        // Contamos la cantidad de cifras
        int cantidadCifras = numeroComoCadena.length();

        // Imprimimos el resultado en consola
        System.out.println("El número " + numero + " tiene " + cantidadCifras + " cifras.");

        scanner.close();
    }
}
