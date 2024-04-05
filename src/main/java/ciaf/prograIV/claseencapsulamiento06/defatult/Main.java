
package ciaf.prograIV.claseencapsulamiento06.defatult;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase ArchivoConfiguracion
        ArchivoConfiguracion archivo = new ArchivoConfiguracion("config.txt", "Propiedad1=Valor1\nPropiedad2=Valor2");
        // Llamar al método predeterminado
        archivo.mostrarContenido();
    }
}

