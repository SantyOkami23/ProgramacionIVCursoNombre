package ciaf.prograIV.clasesintaxis01;

public class EjemploOperadorCondicional08 {

    public static void main(String[] args) {
        // Definimos dos números
        int a = 10;
        int b = 5;

        // Utilizamos el operador condicional para verificar si a es igual a b o si a es menor que b
        String resultado = (a == b) ? "a es igual a b" : (a < b) ? "a es menor que b" : "a es mayor que b";

        // Imprimimos el resultado
        System.out.println(resultado);
    }
}
