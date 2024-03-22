package ciaf.prograIV.claseencapsulamiento06.privado;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase ConexionBD
        ConexionBD conexion = new ConexionBD("jdbc:mysql://localhost:3306/db", "usuario", "contraseña");
        // Llamar al método público
        conexion.ejecutarConsulta("SELECT * FROM tabla");
    }
}