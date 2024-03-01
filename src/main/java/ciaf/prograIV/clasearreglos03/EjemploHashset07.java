package ciaf.prograIV.clasearreglos03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
// No acepta valores repetidos, es un conjunto desacoplado
public class EjemploHashset07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un HashSet para almacenar valores únicos (String)
        Set<String> conjunto = new HashSet<>();

        // Solicitar al usuario que ingrese los elementos del conjunto
        System.out.println("Ingrese los elementos del conjunto (ingrese 'fin' para terminar):");
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("fin")) {
                break;
            }
            conjunto.add(input);
        }

        // Mostrar el conjunto ingresado por el usuario
        System.out.println("Conjunto ingresado: " + conjunto);

        // Buscar un elemento en el conjunto
        System.out.print("Ingrese el elemento que desea buscar en el conjunto: ");
        String elementoBuscar = scanner.nextLine();
        if (conjunto.contains(elementoBuscar)) {
            System.out.println("El elemento '" + elementoBuscar + "' se encuentra en el conjunto");
        } else {
            System.out.println("El elemento '" + elementoBuscar + "' no se encuentra en el conjunto");
        }

        // Eliminar un elemento del conjunto
        System.out.print("Ingrese el elemento que desea eliminar del conjunto: ");
        String elementoEliminar = scanner.nextLine();
        if (conjunto.remove(elementoEliminar)) {
            System.out.println("Se ha eliminado el elemento '" + elementoEliminar + "' del conjunto");
        } else {
            System.out.println("El elemento '" + elementoEliminar + "' no se encuentra en el conjunto");
        }

        // Mostrar el conjunto después de los cambios
        System.out.println("Conjunto después de los cambios: " + conjunto);

        scanner.close();
    }
}