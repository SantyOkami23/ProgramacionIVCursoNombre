package ciaf.prograIV.clasearreglos03;
import java.util.Scanner;
import java.util.Vector;

public class EjemploVector02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un vector de enteros
        Vector<Integer> vector = new Vector<>();

        // Agregar elementos al vector desde la entrada del usuario
        System.out.println("Ingrese números para agregar al vector (ingrese 'fin' para terminar):");
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("fin")) {
                break;
            }
            try {
                int numero = Integer.parseInt(input);
                vector.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número válido o 'fin' para terminar.");
            }
        }

        // Mostrar el vector
        System.out.println("Vector inicial: " + vector);

        // Buscar un elemento
        System.out.print("Ingrese el número que desea buscar en el vector: ");
        int elementoBuscado = scanner.nextInt();
        int indice = vector.indexOf(elementoBuscado);
        if (indice != -1) {
            System.out.println("El elemento " + elementoBuscado + " se encuentra en el índice " + indice);
        } else {
            System.out.println("El elemento " + elementoBuscado + " no se encuentra en el vector");
        }

        // Eliminar un elemento
        System.out.print("Ingrese el número que desea eliminar del vector: ");
        int elementoEliminar = scanner.nextInt();
        boolean eliminado = vector.removeElement(elementoEliminar);
        if (eliminado) {
            System.out.println("El elemento " + elementoEliminar + " ha sido eliminado del vector");
        } else {
            System.out.println("El elemento " + elementoEliminar + " no se encuentra en el vector");
        }

        // Mostrar el vector después de los cambios
        System.out.println("Vector después de eliminar el elemento: " + vector);

        scanner.close();
    }
}

