package ciaf.prograIV.clasearreglos03;

import java.util.Vector;

public class EjemploVector01 {
    public static void main(String[] args) {
        // Crear un vector de enteros
        Vector<Integer> vector = new Vector<>();

        // Agregar elementos al vector
        vector.add(10);
        vector.add(20);
        vector.add(30);

        // Mostrar el vector
        System.out.println("Vector inicial: " + vector);

        // Buscar un elemento
        
        int indice = vector.indexOf(20);
        System.out.println("indice = " + indice);

        if (indice != -1) {
            System.out.println("El elemento 20 se encuentra en el índice " + indice);
        } else {
            System.out.println("El elemento 20 no se encuentra en el vector");
        }

        // Eliminar un elemento
        vector.removeElement(20);
        System.out.println("Vector después de eliminar el elemento 20: " + vector);

        // Actualizar un elemento
        int nuevoValor = 50;
        vector.set(1, nuevoValor);
        System.out.println("Vector después de actualizar el elemento en el índice 1 con " + nuevoValor + ": " + vector);
    }
}
