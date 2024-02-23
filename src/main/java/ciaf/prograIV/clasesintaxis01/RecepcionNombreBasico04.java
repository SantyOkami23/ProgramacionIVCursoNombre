package ciaf.prograIV.clasesintaxis01;


import java.util.Scanner;

public class RecepcionNombreBasico04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenido al Detector de Nombres Geniales y Creativos!");

        System.out.println("Por favor, ingrese su nombre de manera espectacular:");
        String nombreEspectacular = sc.nextLine();
        System.out.println("¡" + nombreEspectacular + "! Qué nombre tan magnífico, ¡seguro que usted es una persona increíble!");

        System.out.println("Ahora, por favor, ingrese su nombre de manera más convencional:");
        var nombreConvencional = sc.nextLine();
        System.out.println("¡" + nombreConvencional + "! Ah, un nombre clásico, ¡pero no por ello menos especial! Estamos encantados de conocerte.");
    }
}
