package ciaf.prograIV.clasesintaxis01;

public class EjemplosOperadoresMatematicas05 {

    public static void main(String[] args) {
        // Operadores de suma, resta, multiplicación y división
        int a = 10;
        int b = 5;

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;

        System.out.println("Suma: " + suma); // Output: 15
        System.out.println("Resta: " + resta); // Output: 5
        System.out.println("Multiplicación: " + multiplicacion); // Output: 50
        System.out.println("División: " + division); // Output: 2 (la división de enteros devuelve un entero)

        // Operador de módulo (resto de la división)
        int modulo = a % b;
        System.out.println("Módulo: " + modulo); // Output: 0 (10 dividido por 5 tiene resto 0)

        // Operadores de incremento y decremento
        int numero = 5;
        numero++; // Incremento en 1
        System.out.println("Número después de incremento: " + numero); // Output: 6

        numero--; // Decremento en 1
        System.out.println("Número después de decremento: " + numero); // Output: 5

        // Operadores de asignación compuesta
        int c = 8;
        c += 3; // Equivalente a c = c + 3;
        System.out.println("Valor de c después de c += 3: " + c); // Output: 11

        c *= 2; // Equivalente a c = c * 2;
        System.out.println("Valor de c después de c *= 2: " + c); // Output: 22
    }
}

