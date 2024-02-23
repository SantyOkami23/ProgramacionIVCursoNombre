package ciaf.prograIV.clasesintaxis01;


public class EjemploOperadoresLogicos06 {

    public static void main(String[] args) {
        // Definimos dos valores booleanos
        boolean a = true;
        boolean b = false;

        // Operador OR (||)
        boolean resultadoOR = (a || b); // Verdadero si a es verdadero o b es verdadero
        System.out.println("a OR b: " + resultadoOR); // Output: true

        // Operador NOT (!)
        boolean resultadoNOTa = !a; // Verdadero si a es falso
        System.out.println("NOT a: " + resultadoNOTa); // Output: false

        // Operador XOR (^)
        boolean resultadoXOR = (a ^ b); // Verdadero si a es verdadero y b es falso, o viceversa
        System.out.println("a XOR b: " + resultadoXOR); // Output: true

        // Operador AND (&&)
        boolean resultadoAND = (a && b); // Verdadero si a es verdadero y b es verdadero
        System.out.println("a AND b: " + resultadoAND); // Output: false

        // Suma lógica (|)
        boolean sumaLogica = (a | b); // Verdadero si a es verdadero o b es verdadero o ambos son verdaderos
        System.out.println("Suma lógica: " + sumaLogica); // Output: true

        // Producto lógico (&)
        boolean productoLogico = (a & b); // Verdadero si a es verdadero y b es verdadero
        System.out.println("Producto lógico: " + productoLogico); // Output: false
    }
}
