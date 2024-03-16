package ciaf.prograIV.clasepolimorfismo05.ejemplo2;

abstract class DispositivoAlmacenamiento {
    private String nombre;

    public DispositivoAlmacenamiento(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto que será implementado por las subclases
    abstract void transferirDatos();

    // Método común a todos los dispositivos de almacenamiento
    void conectar() {
        System.out.println(nombre + " conectado.");
    }
}