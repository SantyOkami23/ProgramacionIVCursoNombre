package ciaf.prograIV.claseciclosycondicionales02;
import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int intentos = 0;
        int intentoUsuario;

        System.out.println("Bienvenido al juego Adivina el Número!");
        do {
            System.out.print("Intente adivinar el número (entre 1 y 100): ");
            intentoUsuario = scanner.nextInt();
            intentos++;

            if (intentoUsuario < numeroAleatorio) {
                System.out.println("El número a adivinar es mayor.");
            } else if (intentoUsuario > numeroAleatorio) {
                System.out.println("El número a adivinar es menor.");
            }
        } while (intentoUsuario != numeroAleatorio);

        System.out.println("¡Felicidades! Has adivinado el número " + numeroAleatorio + " en " + intentos + " intentos.");
    }
}
