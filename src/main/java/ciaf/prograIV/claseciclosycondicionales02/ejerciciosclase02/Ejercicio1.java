package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02;
import java.util.Scanner;

/*Ejercicio de Verificación de Año Bisiesto:
Crea un programa en Java que solicite al usuario ingresar un
año y determine si es un año bisiesto o no. Un año bisiesto es aquel
divisible por 4, excepto aquellos divisibles por 100 pero no por 400.
Por ejemplo, 2000 y 2400 son años bisiestos, mientras que 1800, 1900
 y 2100 no lo son.*/

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner añoParaEvaluar = new Scanner(System.in);
        System.out.printf("Ingrese un año para saber si es bisiesto o no : ");
        int año = añoParaEvaluar.nextInt(); ;
        
        if (año % 4 == 0 && año % 100 == 0 && año % 400 == 0) {
            System.out.println("El año " + año + " es un año bisiesto");
        }else{
            System.out.println("El año " + año + " no es un año bisiesto");
        }
    }
}
