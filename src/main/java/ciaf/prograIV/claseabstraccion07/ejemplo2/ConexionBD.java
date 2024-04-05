package ciaf.prograIII.claseabstraccion07.ejemplo2;
/*Abstracción de conexiones de base de datos:
Supongamos que necesitas interactuar con diferentes tipos de bases de
 datos (por ejemplo, MySQL, PostgreSQL, MongoDB) de una manera uniforme y abstracta.
 Puedes usar la abstracción para definir una interfaz común y luego implementar esta interfaz
 para cada tipo de base de datos.*/
 public interface ConexionBD {
    void conectar();
    void desconectar();
    void ejecutarConsulta(String consulta);
}