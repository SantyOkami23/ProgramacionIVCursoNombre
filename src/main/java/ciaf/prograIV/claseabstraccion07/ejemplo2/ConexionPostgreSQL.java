package ciaf.prograIII.claseabstraccion07.ejemplo2;

// Implementación para PostgreSQL
class ConexionPostgreSQL implements ConexionBD {
    public void conectar() {
        System.out.println("Conectando a PostgreSQL...");
    }

    public void desconectar() {
        System.out.println("Desconectando de PostgreSQL...");
    }

    public void ejecutarConsulta(String consulta) {
        System.out.println("Ejecutando consulta en PostgreSQL: " + consulta);
    }
}