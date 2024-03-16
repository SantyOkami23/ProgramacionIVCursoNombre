package ciaf.prograIV.claseherencia05.ejemplo3;
// Clase Usuario (superclase)
public class Usuario {
    String nombre;
    String correo;

    // Constructor


    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    // Método para mostrar la información del usuario
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
    }
}

