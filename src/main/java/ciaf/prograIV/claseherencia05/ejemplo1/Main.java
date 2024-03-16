package ciaf.prograIV.claseherencia05.ejemplo1;

// Clase principal que contiene el método main
public class Main {
    public static void main(String[] args) {
        // Crear instancias de las subclases
        Perro miPerro = new Perro("Buddy");
        Gato miGato = new Gato("Garfield");

        // Llamar métodos de la superclase y subclases
        miPerro.hacerSonido(); // Método de la superclase
        miPerro.ladrar(); // Método de la subclase
        System.out.println();

        miGato.hacerSonido(); // Método de la superclase
        miGato.maullar(); // Método de la subclase
    }
}
