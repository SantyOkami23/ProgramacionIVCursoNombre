package ciaf.prograIII.claseabstraccion07.ejemplo5;

import ciaf.prograIII.claseabstraccion07.ejemplo5.ProcesadorDatos;

// Implementación para el procesamiento de archivos CSV
class ProcesadorCSV implements ProcesadorDatos {
    public void leerDatos() {
        // Lógica para leer datos desde un archivo CSV
        System.out.println("Leyendo datos desde un archivo CSV...");
    }

    public void procesarDatos() {
        // Lógica para procesar los datos leídos desde un archivo CSV
        System.out.println("Procesando datos de un archivo CSV...");
    }

    public void guardarResultados() {
        // Lógica para guardar los resultados del procesamiento en un archivo CSV
        System.out.println("Guardando resultados del procesamiento en un archivo CSV...");
    }
}
