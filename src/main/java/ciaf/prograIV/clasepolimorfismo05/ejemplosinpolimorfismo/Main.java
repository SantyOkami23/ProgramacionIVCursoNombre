package ciaf.prograIV.clasepolimorfismo05.ejemplosinpolimorfismo;

public class Main {
    public static void main(String[] args) {
        // Se crean instancias de las subclases
        DiscoDuro miDiscoDuro = new DiscoDuro();
        MemoriaUSB miMemoriaUSB = new MemoriaUSB();

        // Se llama a métodos específicos de cada subclase
        miDiscoDuro.conectar();
        miDiscoDuro.transferirDatosDiscoDuro();

        miMemoriaUSB.conectar();
        miMemoriaUSB.transferirDatosMemoriaUSB();
    }
}