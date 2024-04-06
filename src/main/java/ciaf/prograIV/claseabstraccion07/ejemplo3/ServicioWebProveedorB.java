package ciaf.prograIII.claseabstraccion07.ejemplo3;

// Implementación para el proveedor B
class ServicioWebProveedorB implements ServicioWeb {
    public void conectar() {
        System.out.println("Conectando al Servicio Web Proveedor B...");
    }

    public void desconectar() {
        System.out.println("Desconectando del Servicio Web Proveedor B...");
    }

    public String realizarPeticion(String endpoint) {
        // Lógica para realizar la petición al proveedor B
        return "Respuesta del Servicio Web Proveedor B para " + endpoint;
    }
}