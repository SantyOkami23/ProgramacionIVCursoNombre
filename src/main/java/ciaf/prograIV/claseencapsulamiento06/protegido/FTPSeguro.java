package ciaf.prograIV.claseencapsulamiento06.protegido;

// Subclase que hereda de la clase base protegida
public class FTPSeguro extends ConexionSegura {
    public FTPSeguro(String servidor, String usuario, String contrasenna) {
        super(servidor, usuario, contrasenna);
    }

    public void subirArchivo(String archivo) {
        conectar();
        // Lógica para subir el archivo de forma segura
        System.out.println("Subiendo archivo " + archivo);
    }
}