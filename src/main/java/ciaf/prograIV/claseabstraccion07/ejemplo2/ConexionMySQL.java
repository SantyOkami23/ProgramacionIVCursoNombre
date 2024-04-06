package ciaf.prograIII.claseabstraccion07.ejemplo2;

// Implementación para MySQL
class ConexionMySQL implements ConexionBD {
    public void conectar() {
        System.out.println("Conectando a MySQL...");
    }

    public void desconectar() {
        System.out.println("Desconectando de MySQL...");
    }

    public void ejecutarConsulta(String consulta) {
        System.out.println("Ejecutando consulta en MySQL: " + consulta);
    }
}
