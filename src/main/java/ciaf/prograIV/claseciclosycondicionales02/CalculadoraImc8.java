package ciaf.prograIV.claseciclosycondicionales02;

import java.util.Scanner;

public class CalculadoraImc8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Su IMC es " + imc + ". Está bajo peso.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Su IMC es " + imc + ". Está en un peso saludable.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Su IMC es " + imc + ". Tiene sobrepeso.");
        } else {
            System.out.println("Su IMC es " + imc + ". Tiene obesidad.");
        }
    }
}
