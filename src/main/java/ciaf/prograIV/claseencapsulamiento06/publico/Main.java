package ciaf.prograIV.claseencapsulamiento06.publico;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Servidor
        Servidor servidor = new Servidor("Servidor Web", 8080);
        // Acceder a los miembros públicos
        System.out.println("Nombre del servidor: " + servidor.nombre);
        System.out.println("Puerto del servidor: " + servidor.puerto);
        // Llamar al método público
        servidor.iniciar();
    }
}