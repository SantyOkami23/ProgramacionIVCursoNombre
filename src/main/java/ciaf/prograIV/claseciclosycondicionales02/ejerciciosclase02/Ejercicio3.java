package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02;

import java.util.Scanner;

/*Ejercicio de Conversión de Moneda:
Escribe un programa en Java que permita al usuario convertir una cantidad de dinero
de una moneda a otra. El programa debe pedir al usuario ingresar la cantidad de dinero
en una moneda (por ejemplo, dólares) y la tasa de cambio a la otra moneda (por ejemplo, euros).
Luego, debe realizar la conversión y mostrar el resultado.*/


public class Ejercicio3 {

    public static void main(String[] args){
        System.out.println("------- Conversor de Dolares a Pesos Colombianos -------\f");
        Scanner digitadoUser = new Scanner(System.in);
        System.out.println("Ingrese el valor en Dolares que desee convertir :");
        double dolares = digitadoUser.nextDouble();

        Double tasaPesos = 3963.32 ;

        Double resultConvert = tasaPesos*dolares;
        
        System.out.println("su converción es de "+ resultConvert +" Pesos Colombianos");

    }    
}
