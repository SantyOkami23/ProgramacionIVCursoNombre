package ciaf.prograIV.claseencapsulamiento06.protegido;

// Clase base protegida que define una conexión segura
public class ConexionSegura {
    protected String servidor;
    protected String usuario;
    protected String contrasenna;

    protected ConexionSegura(String servidor, String usuario, String contrasenna) {
        this.servidor = servidor;
        this.usuario = usuario;
        this.contrasenna = contrasenna;
    }

    protected void conectar() {
        System.out.println("Conectando de forma segura al servidor: " + servidor);
    }
}
