package ciaf.prograIV.claseherencia05.ejemplosinherencia;

// Clase principal que contiene el método main
public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases
        Animal miAnimal = new Animal("Animal");
        Perro miPerro = new Perro("Buddy");
        Gato miGato = new Gato("Garfield");

        // Llamar métodos de las clases
        miAnimal.hacerSonido();
        System.out.println();

        miPerro.ladrar();
        System.out.println();

        miGato.maullar();
    }
}
