package ciaf.prograIV.claseherencia05.ejemplosinherencia;

// Clase Perro
public class Perro {
    String nombre;

    // Constructor
    public Perro(String nombre) {
        this.nombre = nombre;
    }

    // Método para hacer ladrar al perro
    public void ladrar() {
        System.out.println("Guau guau!");
    }
}
