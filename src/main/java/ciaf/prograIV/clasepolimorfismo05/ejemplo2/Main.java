package ciaf.prograIV.clasepolimorfismo05.ejemplo2;


public class Main {
    public static void main(String[] args) {
        // Se crean instancias de las subclases
        DispositivoAlmacenamiento miDiscoDuro = new DiscoDuro("Mi Disco Duro");
        DispositivoAlmacenamiento miMemoriaUSB = new MemoriaUSB("Mi Memoria USB");

        // Se llama a métodos comunes y al método transferirDatos() de cada objeto
        miDiscoDuro.conectar();
        miDiscoDuro.transferirDatos();

        miMemoriaUSB.conectar();
        miMemoriaUSB.transferirDatos();
    }
}