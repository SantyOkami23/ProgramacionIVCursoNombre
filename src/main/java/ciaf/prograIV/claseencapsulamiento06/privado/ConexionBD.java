package ciaf.prograIV.claseencapsulamiento06.privado;

// Clase con miembros privados para una conexión a base de datos
public class ConexionBD {
    private String url;
    private String usuario;
    private String contrasenna;

    public ConexionBD(String url, String usuario, String contrasenna) {
        this.url = url;
        this.usuario = usuario;
        this.contrasenna = contrasenna;
    }

    private void conectar() {
        System.out.println("Conectando a la base de datos: " + url);
    }

    public void ejecutarConsulta(String consulta) {
        conectar();
        // Lógica para ejecutar la consulta
        System.out.println("Ejecutando consulta: " + consulta);
    }
}
