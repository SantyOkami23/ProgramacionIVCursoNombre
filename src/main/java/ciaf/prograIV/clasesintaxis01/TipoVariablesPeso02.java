package ciaf.prograIV.clasesintaxis01;

public class TipoVariablesPeso02 {

    public static void main(String[] args) {

        // Tipos primitivos
        byte edad = 25; // 1 byte
        short codigo = 12345; // 2 bytes
        int numero = 1234567890; // 4 bytes
        long numeroGrande = 123456789012345L; // 8 bytes (se usa la letra 'L' para indicar que es un literal long)
        float precio = 59.99f; // 4 bytes (se usa la letra 'f' para indicar que es un literal float)
        double estatura = 1.75; // 8 bytes
        char inicial = 'A'; // 2 bytes (almacena un solo carácter Unicode)
        boolean esCierto = true; // 1 bit (dependiendo de la JVM y la implementación, puede usar más memoria)

        // Imprimir el tipo de dato y su espacio en memoria
        System.out.println("Tipo de dato\t\tEspacio en memoria");
        System.out.println("byte\t\t\t" + Byte.BYTES + " bytes");
        System.out.println("short\t\t\t" + Short.BYTES + " bytes");
        System.out.println("int\t\t\t" + Integer.BYTES + " bytes");
        System.out.println("long\t\t\t" + Long.BYTES + " bytes");
        System.out.println("float\t\t\t" + Float.BYTES + " bytes");
        System.out.println("double\t\t\t" + Double.BYTES + " bytes");
        System.out.println("char\t\t\t" + Character.BYTES + " bytes");
        // No hay un tamaño fijo para boolean, depende de la implementación de la JVM

    }
}
