package ciaf.prograIII.claseabstraccion07.ejemplo5;

public class EjemploAbstraccionTI {
    public static void main(String[] args) {
        ProcesadorDatos procesadorCSV = new ProcesadorCSV();
        ProcesadorDatos procesadorSQL = new ProcesadorSQL();

        procesadorCSV.leerDatos();
        procesadorCSV.procesarDatos();
        procesadorCSV.guardarResultados();

        procesadorSQL.leerDatos();
        procesadorSQL.procesarDatos();
        procesadorSQL.guardarResultados();
    }
}