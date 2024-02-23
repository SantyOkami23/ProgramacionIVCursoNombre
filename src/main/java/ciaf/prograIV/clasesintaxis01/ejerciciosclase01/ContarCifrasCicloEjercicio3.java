package ciaf.prograIV.clasesintaxis01.ejerciciosclase01;

import java.util.Scanner;

public class ContarCifrasCicloEjercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese un número
        System.out.println("Por favor, ingresa un número:");
        int numero = scanner.nextInt();

        // Variable para almacenar la cantidad de cifras
        int contador = 0;

        // Copia del número para no alterar el original
        int copiaNumero = numero;

        // Iteramos dividiendo el número por 10 hasta que sea 0
        while (copiaNumero != 0) {
            // Dividimos el número por 10 para obtener el siguiente dígito
            copiaNumero = copiaNumero / 10;
            // Incrementamos el contador de cifras
            contador++;
        }

        // Imprimimos el resultado en consola
        System.out.println("El número " + numero + " tiene " + contador + " cifras.");

        scanner.close();
    }
}
