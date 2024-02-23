package ciaf.prograIV.claseciclosycondicionales02;
import java.util.Scanner;

public class Menu4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- Menú -----");
            System.out.println("1. Ver perfil");
            System.out.println("2. Editar perfil");
            System.out.println("3. Ver lista de amigos");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Mostrando perfil...");
                    // Aquí iría la lógica para mostrar el perfil del usuario
                    break;
                case 2:
                    System.out.println("Editando perfil...");
                    // Aquí iría la lógica para permitir al usuario editar su perfil
                    break;
                case 3:
                    System.out.println("Mostrando lista de amigos...");
                    // Aquí iría la lógica para mostrar la lista de amigos del usuario
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 4);
    }
}
