package ciaf.prograIV.conceptospoo04.abstraccion;

// Clase Poligono que extiende la clase abstracta Forma
public class Poligono extends Forma {
    // Atributos comunes a todas las formas
    private int numLados;

    // Constructor
    public Poligono(int numLados) {
        this.numLados = numLados;
    }

    @Override
    double calcularArea() {
        return 0;
    }

    // Implementación del método abstracto calcularPerimetro
    @Override
    double calcularPerimetro() {
        return 0; // Cada forma concreta debe implementar su propio método calcularPerimetro
    }

    // Getters y setters
    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }
}
