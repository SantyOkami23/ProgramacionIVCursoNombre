package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02;
import java.util.Scanner;
public class Ejercicio001 {
    public static void  main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un año:");
        int ano = sc.nextInt();


        if (ano % 400 == 0){
            System.out.println("El año SI es bisiesto");
        }else if (ano % 4 == 0 & ano % 100 !=0 ){
            System.out.println("El año SI es bisiesto");

        }else {
            System.out.println("El año NO es bisisto");
        }

    }

}
