package ciaf.prograIV.clasesintaxis01;

import java.util.Scanner;

public class EjemploEstructurasControl09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo:");
        int numero = scanner.nextInt();

        // Estructura de control if-else para verificar si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número ingresado es positivo.");
        } else if (numero < 0) {
            System.out.println("El número ingresado es negativo.");
        } else {
            System.out.println("El número ingresado es cero.");
        }

        // Estructura de control switch para determinar si el número es par o impar
        switch (numero % 2) {
            case 0:
                System.out.println("El número ingresado es par.");
                break;
            case 1:
            case -1:
                System.out.println("El número ingresado es impar.");
                break;
        }

        // Estructura de control while para contar hasta el número ingresado
        System.out.println("Contando hasta el número ingresado:");
        int contador = 1;
        while (contador <= numero) {
            System.out.print(contador + " ");
            contador++;
        }
        System.out.println();

        // Estructura de control for para calcular la suma de los números hasta el número ingresado
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma += i;
        }
        System.out.println("La suma de los números del 1 al " + numero + " es: " + suma);

        scanner.close();
    }
}
