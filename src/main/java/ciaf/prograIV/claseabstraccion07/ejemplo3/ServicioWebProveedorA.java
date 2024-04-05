package ciaf.prograIII.claseabstraccion07.ejemplo3;

// Implementación para el proveedor A
class ServicioWebProveedorA implements ServicioWeb {
    public void conectar() {
        System.out.println("Conectando al Servicio Web Proveedor A...");
    }

    public void desconectar() {
        System.out.println("Desconectando del Servicio Web Proveedor A...");
    }

    public String realizarPeticion(String endpoint) {
        // Lógica para realizar la petición al proveedor A
        return "Respuesta del Servicio Web Proveedor A para " + endpoint;
    }
}