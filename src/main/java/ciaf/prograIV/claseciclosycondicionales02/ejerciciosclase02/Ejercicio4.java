package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02;

import java.util.Scanner;

/*Ejercicio de Validación de Contraseña:
Crea un programa en Java que pida al usuario ingresar una contraseña. El programa debe verificar si
la contraseña cumple con ciertos criterios de seguridad, como tener al menos 8 caracteres de longitud y contener
al menos una letra mayúscula, una letra minúscula y un número.*/


public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("-------- Ingrese una contraseña  --------");
        System.out.println("(Esta debe tener almenos 8 caractares con minimo 1 letra Mayuscula y 1 letra minusculas y almenos un número)");
        Scanner contra = new Scanner(System.in);
        String contraseña = contra.nextLine();

        Integer mayus = 0 ;
        Integer minus = 0 ;
        Integer number = 0 ;

        if (contraseña.length() >= 8){
            for (int index = 0; index < contraseña.length(); index++) {
                
                char caracter = contraseña.charAt(index);

                if (Character.isUpperCase(caracter)){
                    mayus ++ ;
                }else if (Character.isLowerCase(caracter)){
                    minus ++ ;
                }else if (Character.isDigit(caracter)) {
                    number ++ ;
                }
            }
            if (mayus >= 1 && minus >= 1 && number >= 1){
            System.out.println("Exelente !! Ah ingresado correctamente una contraseña con todos los parametros de seguridad !");
            }else{
                System.out.println("La contraseña debe tener minimo 1 letra Mayuscula y 1 letra minusculas y almenos un número - vuelva a intentarlo");
            }
        }else {
            System.out.println("La contraseña debe tener minimo 8 caracteres - vuelva a intentarlo");
        }
    }
}
