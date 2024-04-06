package ciaf.prograIII.claseabstraccion07.ejemplo2;

public class EjemploAbstraccionTI {
    public static void main(String[] args) {
        ConexionBD mysql = new ConexionMySQL();
        ConexionBD postgresql = new ConexionPostgreSQL();
        ConexionBD mongodb = new ConexionMongoDB();

        mysql.conectar();
        mysql.ejecutarConsulta("SELECT * FROM usuarios");
        mysql.desconectar();

        postgresql.conectar();
        postgresql.ejecutarConsulta("SELECT * FROM usuarios");
        postgresql.desconectar();

        mongodb.conectar();
        mongodb.ejecutarConsulta("db.usuarios.find()");
        mongodb.desconectar();
    }
}