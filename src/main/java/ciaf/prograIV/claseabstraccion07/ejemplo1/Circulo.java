package ciaf.prograIII.claseabstraccion07.ejemplo1;

class Circulo implements Figura {
    double radio;
    final double PI = 3.14159265359;

    Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
}
