package ciaf.prograIII.claseabstraccion07.ejemplo1;

public class EjemploAbstraccion {
    public static void main(String[] args) {
        Figura cuadrado = new Cuadrado(5);
        Figura circulo = new Circulo(3);

        System.out.println("area del cuadrado: " + cuadrado.calcularArea()); // Output: Area del cuadrado: 25.0
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro()); // Output: Perímetro del cuadrado: 20.0

        System.out.println("area del circulo: " + circulo.calcularArea()); // Output: Area del círculo: 28.274333882308138
        System.out.println("Perimetro del circulo: " + circulo.calcularPerimetro()); // Output: Perímetro del círculo: 18.84955592153876
    }
}
