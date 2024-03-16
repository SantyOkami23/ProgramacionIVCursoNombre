package ciaf.prograIV.clasepolimorfismo05.ejemplo2;

class DiscoDuro extends DispositivoAlmacenamiento {
    public DiscoDuro(String nombre) {
        super(nombre);
    }

    // Implementación del método abstracto
    void transferirDatos() {
        System.out.println("Transferencia de datos a través del disco duro.");
    }
}