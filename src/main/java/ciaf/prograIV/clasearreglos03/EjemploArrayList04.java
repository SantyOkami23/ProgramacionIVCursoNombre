package ciaf.prograIV.clasearreglos03;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjemploArrayList04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una lista
        List<Integer> lista = new ArrayList<>();

        // Solicitar al usuario que ingrese los elementos de la lista
        System.out.println("Ingrese los elementos de la lista (ingrese 'fin' para terminar):");
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("fin")) {
                break;
            }
            try {
                int numero = Integer.parseInt(input);
                lista.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número válido o 'fin' para terminar.");
            }
        }

        // Mostrar la lista ingresada por el usuario
        System.out.println("Lista ingresada: " + lista);

        // Buscar un elemento en la lista
        System.out.print("Ingrese el elemento que desea buscar en la lista: ");
        int elementoBuscar = scanner.nextInt();
        if (lista.contains(elementoBuscar)) {
            System.out.println("El elemento " + elementoBuscar + " se encuentra en la lista");
        } else {
            System.out.println("El elemento " + elementoBuscar + " no se encuentra en la lista");
        }

        // Eliminar un elemento de la lista
        System.out.print("Ingrese el elemento que desea eliminar de la lista: ");
        int elementoEliminar = scanner.nextInt();
        if (lista.remove(Integer.valueOf(elementoEliminar))) {
            System.out.println("El elemento " + elementoEliminar + " ha sido eliminado de la lista");
        } else {
            System.out.println("El elemento " + elementoEliminar + " no se encuentra en la lista");
        }

        // Actualizar un elemento de la lista
        System.out.print("Ingrese el índice del elemento que desea actualizar en la lista: ");
        int indiceActualizar = scanner.nextInt();
        if (indiceActualizar >= 0 && indiceActualizar < lista.size()) {
            System.out.print("Ingrese el nuevo valor para el elemento: ");
            int nuevoValor = scanner.nextInt();
            lista.set(indiceActualizar, nuevoValor);
            System.out.println("El elemento en el índice " + indiceActualizar + " ha sido actualizado con " + nuevoValor);
        } else {
            System.out.println("indice fuera de los límites de la lista. No se puede actualizar el elemento.");
        }

        // Mostrar la lista después de los cambios
        System.out.println("Lista después de los cambios: " + lista);

        scanner.close();
    }
}

