package ciaf.prograIV.claseencapsulamiento06.defatult;

// Clase con miembros predeterminados para manejar un archivo de configuración
class ArchivoConfiguracion {
    String nombre;
    String contenido;

    ArchivoConfiguracion(String nombre, String contenido) {
        this.nombre = nombre;
        this.contenido = contenido;
    }

    void mostrarContenido() {
        System.out.println("Contenido del archivo " + nombre + ":");
        System.out.println(contenido);
    }
}