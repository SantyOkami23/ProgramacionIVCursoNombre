package ciaf.prograIV.conceptospoo04.polimorfismo;


// Clase principal para probar el polimorfismo
public class PolimorfismoEjemplo {
    public static void main(String[] args) {
        // Crear objetos de diferentes tipos y llamar al método hacerSonido
        Animal perro = new Perro();
        Animal gato = new Gato();
        Animal vaca = new Vaca();

        perro.hacerSonido();
        gato.hacerSonido();
        vaca.hacerSonido();
    }
}

