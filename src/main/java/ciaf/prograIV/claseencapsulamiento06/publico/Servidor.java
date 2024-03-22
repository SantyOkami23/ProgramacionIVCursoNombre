package ciaf.prograIV.claseencapsulamiento06.publico;

// Clase pública que representa un servidor
public class Servidor {
    public String nombre;
    public int puerto;

    public Servidor(String nombre, int puerto) {
        this.nombre = nombre;
        this.puerto = puerto;
    }

    public void iniciar() {
        System.out.println("El servidor " + nombre + " está iniciando en el puerto " + puerto);
    }
}
