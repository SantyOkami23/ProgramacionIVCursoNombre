package ciaf.prograIV.claseherencia05.ejemplo1;

// Clase Gato (subclase de Animal)
public class Gato extends Animal {
    // Constructor
    public Gato(String nombre) {
        super(nombre); // Llama al constructor de la superclase Animal
    }

    // Método específico para maullido de gato
    public void maullar() {
        System.out.println("Miau miau!");
    }
}
