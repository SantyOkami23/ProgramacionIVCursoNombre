package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02;

import java.util.Scanner;

/*Ejercicio de Cálculo de Intereses Compuestos:
Desarrolla un programa en Java que permita calcular el monto final de una inversión después de un cierto número de años,
utilizando la fórmula de interés compuesto. El programa debe pedir al usuario ingresar la cantidad inicial invertida, la tasa
de interés anual y el número de años. Luego, muestra el monto final.*/

// Formula :  A = P . (1+r)a la n
// A = monto final - P = inversion inicial - r = tasa de interés en términos decimales (por ejemplo, 5% se expresaría como 0.05) - n = numerode años


public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("-------- Calculadora del Monto Final de una Inversión --------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad inicial invertida:");
        double inversionInicial = scanner.nextDouble();

        System.out.println("Ingrese la tasa de interes anual en porcentaje (sin el signo %):");
        double tasaInteres = scanner.nextDouble();

        System.out.println("Ingrese el número de años de la inversión:");
        double nAños = scanner.nextDouble();

        scanner.close(); 

        double inversionFinal = inversionInicial * Math.pow(( 1 + (tasaInteres/100)), nAños );

        System.out.println("Su inversion final da un total de :" + inversionFinal);




    }
    
}
