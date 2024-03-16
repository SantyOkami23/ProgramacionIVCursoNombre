package ciaf.prograIV.claseherencia05.ejemplo1;

// Clase Perro (subclase de Animal)
public class Perro extends Animal {
    // Constructor
    public Perro(String nombre) {
        super(nombre); // Llama al constructor de la superclase Animal
    }

    // Método específico para ladrido de perro
    public void ladrar() {
        System.out.println("Guau guau!");
    }
}
