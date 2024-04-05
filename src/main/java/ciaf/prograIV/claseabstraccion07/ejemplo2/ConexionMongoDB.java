package ciaf.prograIII.claseabstraccion07.ejemplo2;

// Implementación para MongoDB
class ConexionMongoDB implements ConexionBD {
    public void conectar() {
        System.out.println("Conectando a MongoDB...");
    }

    public void desconectar() {
        System.out.println("Desconectando de MongoDB...");
    }

    public void ejecutarConsulta(String consulta) {
        System.out.println("Ejecutando consulta en MongoDB: " + consulta);
    }
}