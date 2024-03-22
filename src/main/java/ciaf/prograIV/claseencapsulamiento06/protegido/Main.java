package ciaf.prograIV.claseencapsulamiento06.protegido;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase FTPSeguro
        FTPSeguro ftp = new FTPSeguro("ftp.miempresa.com", "usuario", "contraseña");
        // Llamar al método público
        ftp.subirArchivo("archivo.txt");
    }
}
