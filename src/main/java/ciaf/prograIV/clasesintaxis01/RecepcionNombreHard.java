package ciaf.prograIV.clasesintaxis01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RecepcionNombreHard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("¡Bienvenido al Detector de Nombres Geniales y Creativos!");

        System.out.println("Por favor, ingrese su nombre de manera espectacular:");

        try {
            String nombreEspectacular = br.readLine();
            System.out.println("¡" + nombreEspectacular + "! Qué nombre tan magnífico, ¡seguro que usted es una persona increíble!");
        } catch (IOException e) {
            System.err.println("Error al leer el nombre. Parece que ha ocurrido un error cósmico en el universo de los nombres.");
            e.printStackTrace();
        }

        System.out.println("Ahora, por favor, ingrese su nombre de manera más convencional:");
        String nombreConvencional = sc.nextLine();
        System.out.println("¡" + nombreConvencional + "! Ah, un nombre clásico, ¡pero no por ello menos especial! Estamos encantados de conocerte.");
    }
}

