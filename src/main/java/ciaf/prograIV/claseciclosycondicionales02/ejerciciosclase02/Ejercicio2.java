package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02;

import java.util.Random;
import java.util.Scanner;

/*Ejercicio de Juego de Piedra, Papel o Tijeras:
Desarrolla un programa en Java que permita al usuario jugar al clásico juego
de Piedra, Papel o Tijeras contra la computadora. El programa debe solicitar al
usuario que elija una de las opciones (Piedra, Papel o Tijeras) y luego generar
aleatoriamente la elección de la computadora. Luego, el programa debe determinar
quién gana según las reglas del juego.*/

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner opc = new Scanner(System.in);
        System.out.println("----- Juego de Piedra Papel o Tijeras -----");
        System.out.println("\fElija el número de la opcion que desea:\f");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        int player = opc.nextInt();

        Random randomNumber = new Random();
        int cpu = randomNumber.nextInt(3) ;
        
        int piedra = 1 ;
        int papel = 2 ;
        int tijera = 3 ;

        if (player == piedra && cpu == papel){
            System.out.println("\fEl cpu eligió: papel");
            System.out.println("\fEl cpu Ganó !");
        }else if (player == papel && cpu == tijera){
            System.out.println("\fEl cpu eligió: tijera");
            System.out.println("\fEl cpu Ganó !");
        }else if (player == tijera && cpu == piedra){
            System.out.println("\fEl cpu eligió: piedra");
            System.out.println("\fEl cpu Ganó !");
        }else if (player == cpu){
            if (cpu == 1) {
                System.out.println("\fEl cpu eligió: piedra");   
            }else if (cpu == 2) {
                System.out.println("\fEl cpu eligió: papel");
            }else if (cpu == 3) {
                System.out.println("\fEl cpu eligió: tijera");
            }
            System.out.println("\fHan empatado !!");
        }else{
            if (cpu == 1) {
                System.out.println("\fEl cpu eligió: piedra");   
            }else if (cpu == 2) {
                System.out.println("\fEl cpu eligió: papel");
            }else if (cpu == 3) {
                System.out.println("\fEl cpu eligió: tijera");
            }
            System.out.println("\fTu Haz Ganado !!!");
        }

    }

}
