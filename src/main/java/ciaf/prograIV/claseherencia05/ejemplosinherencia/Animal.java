package ciaf.prograIV.claseherencia05.ejemplosinherencia;

// Clase Animal
public class Animal {
    String nombre;

    // Constructor
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método para mostrar el sonido del animal
    public void hacerSonido() {
        System.out.println("El " + nombre + " hace un sonido.");
    }
}
