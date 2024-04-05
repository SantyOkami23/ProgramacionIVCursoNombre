package ciaf.prograIII.claseabstraccion07.ejemplo1;

class Cuadrado implements Figura {
    double lado;

    Cuadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}