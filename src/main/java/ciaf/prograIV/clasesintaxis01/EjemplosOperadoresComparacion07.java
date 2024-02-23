package ciaf.prograIV.clasesintaxis01;

public class EjemplosOperadoresComparacion07 {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 10;

        // Operadores de comparación: mayor que, menor que, igual que, diferente de
        System.out.println("a > b: " + (a > b)); // Output: true (10 es mayor que 5)
        System.out.println("a < b: " + (a < b)); // Output: false (10 no es menor que 5)
        System.out.println("a == b: " + (a == b)); // Output: false (10 no es igual a 5)
        System.out.println("a != b: " + (a != b)); // Output: true (10 es diferente de 5)

        // Operadores de comparación: mayor o igual que, menor o igual que
        System.out.println("a >= c: " + (a >= c)); // Output: true (10 es mayor o igual que 10)
        System.out.println("a <= b: " + (a <= b)); // Output: false (10 no es menor o igual que 5)
    }
}
