package ciaf.prograIV.clasearreglos03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



    public class EjemploHashMap06 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Crear un HashMap para almacenar pares de clave-valor (Integer-String)
            Map<Integer, String> mapa = new HashMap<>();

            // Solicitar al usuario que ingrese los elementos del mapa
            System.out.println("Ingrese los elementos del mapa (ingrese '-1' para terminar):");
            int clave;
            while (true) {
                System.out.print("Clave (número entero): ");
                if (!scanner.hasNextInt()) {
                    System.out.println("La clave debe ser un número entero.");
                    scanner.nextLine(); // Consumir la entrada inválida
                    continue;
                }
                clave = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea pendiente después de nextInt()
                if (clave == -1) {
                    break;
                }
                System.out.print("Valor (cadena): ");
                String valor = scanner.nextLine();
                mapa.put(clave, valor);
            }

            // Mostrar el mapa ingresado por el usuario
            System.out.println("Mapa ingresado: " + mapa);

            // Buscar un elemento en el mapa
            System.out.print("Ingrese la clave que desea buscar en el mapa: ");
            int claveBuscar = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea pendiente después de nextInt()
            if (mapa.containsKey(claveBuscar)) {
                System.out.println("El valor para la clave '" + claveBuscar + "' es: " + mapa.get(claveBuscar));
            } else {
                System.out.println("La clave '" + claveBuscar + "' no se encuentra en el mapa");
            }

            // Eliminar un elemento del mapa
            System.out.print("Ingrese la clave que desea eliminar del mapa: ");
            int claveEliminar = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea pendiente después de nextInt()
            if (mapa.containsKey(claveEliminar)) {
                String valorEliminado = mapa.remove(claveEliminar);
                System.out.println("Se ha eliminado la clave '" + claveEliminar + "' con valor: " + valorEliminado);
            } else {
                System.out.println("La clave '" + claveEliminar + "' no se encuentra en el mapa");
            }

            // Actualizar un elemento del mapa
            System.out.print("Ingrese la clave del elemento que desea actualizar en el mapa: ");
            int claveActualizar = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea pendiente después de nextInt()
            if (mapa.containsKey(claveActualizar)) {
                System.out.print("Ingrese el nuevo valor para la clave '" + claveActualizar + "': ");
                String nuevoValor = scanner.nextLine();
                mapa.put(claveActualizar, nuevoValor);
                System.out.println("Se ha actualizado la clave '" + claveActualizar + "' con el nuevo valor: " + nuevoValor);
            } else {
                System.out.println("La clave '" + claveActualizar + "' no se encuentra en el mapa. No se puede actualizar.");
            }

            // Mostrar el mapa después de los cambios
            System.out.println("Mapa después de los cambios: " + mapa);

            scanner.close();
        }
    }
