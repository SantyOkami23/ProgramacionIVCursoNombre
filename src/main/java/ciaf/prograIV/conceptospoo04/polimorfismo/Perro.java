package ciaf.prograIV.conceptospoo04.polimorfismo;

class Perro implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro hace: Guau guau");
    }
}