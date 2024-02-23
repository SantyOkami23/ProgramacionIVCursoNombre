package ciaf.prograIV.claseciclosycondicionales02;

public class EjemploTiendaProductos10 {
    // Definición de productos con sus respectivas restricciones de edad
    private static String producto1 = "Laptop";
    private static Integer restriccionEdad1 = null; // No hay restricciones de edad para la laptop

    private static String producto2 = "Smartphone";
    private static Integer restriccionEdad2 = null; // No hay restricciones de edad para el smartphone

    private static String producto3 = "Videojuego";
    private static Integer restriccionEdad3 = 18; // Restricción de edad para el videojuego: 18 años o más

    private static String producto4 = "Cámara";
    private static Integer restriccionEdad4 = null; // No hay restricciones de edad para la cámara

    private static String producto5 = "Auriculares";
    private static Integer restriccionEdad5 = null; // No hay restricciones de edad para los auriculares

    // Función para verificar si un cliente puede comprar un producto según su edad
    private static boolean puedeComprar(Integer edadCliente, Integer restriccionEdad) {
        if (restriccionEdad == null) {
            return true; // No hay restricciones para este producto
        } else if (edadCliente == null) {
            return false; // No se conoce la edad del cliente
        } else {
            return edadCliente >= restriccionEdad;
        }
    }

    public static void main(String[] args) {
        // Edad del cliente (puede ser null si no se conoce)
        Integer edadCliente = 25;

        // Verificación de cada producto
        if (puedeComprar(edadCliente, restriccionEdad1)) {
            System.out.println("El cliente puede comprar " + producto1);
        } else {
            System.out.println("El cliente no puede comprar " + producto1 + " debido a restricciones de edad");
        }

        if (puedeComprar(edadCliente, restriccionEdad2)) {
            System.out.println("El cliente puede comprar " + producto2);
        } else {
            System.out.println("El cliente no puede comprar " + producto2 + " debido a restricciones de edad");
        }

        if (puedeComprar(edadCliente, restriccionEdad3)) {
            System.out.println("El cliente puede comprar " + producto3);
        } else {
            System.out.println("El cliente no puede comprar " + producto3 + " debido a restricciones de edad");
        }

        if (puedeComprar(edadCliente, restriccionEdad4)) {
            System.out.println("El cliente puede comprar " + producto4);
        } else {
            System.out.println("El cliente no puede comprar " + producto4 + " debido a restricciones de edad");
        }

        if (puedeComprar(edadCliente, restriccionEdad5)) {
            System.out.println("El cliente puede comprar " + producto5);
        } else {
            System.out.println("El cliente no puede comprar " + producto5 + " debido a restricciones de edad");
        }
    }
}
