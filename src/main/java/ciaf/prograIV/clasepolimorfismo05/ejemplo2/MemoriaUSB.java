package ciaf.prograIV.clasepolimorfismo05.ejemplo2;

class MemoriaUSB extends DispositivoAlmacenamiento {
    public MemoriaUSB(String nombre) {
        super(nombre);
    }

    // Implementación del método abstracto
    void transferirDatos() {
        System.out.println("Transferencia de datos a través de la memoria USB.");
    }
}
