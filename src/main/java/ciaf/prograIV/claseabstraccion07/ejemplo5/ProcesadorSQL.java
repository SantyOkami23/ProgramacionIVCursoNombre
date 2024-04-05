package ciaf.prograIII.claseabstraccion07.ejemplo5;

import ciaf.prograIII.claseabstraccion07.ejemplo5.ProcesadorDatos;

// Implementación para el procesamiento de datos de una base de datos SQL
class ProcesadorSQL implements ProcesadorDatos {
    public void leerDatos() {
        // Lógica para leer datos desde una base de datos SQL
        System.out.println("Leyendo datos desde una base de datos SQL...");
    }

    public void procesarDatos() {
        // Lógica para procesar los datos leídos desde una base de datos SQL
        System.out.println("Procesando datos de una base de datos SQL...");
    }

    public void guardarResultados() {
        // Lógica para guardar los resultados del procesamiento en una base de datos SQL
        System.out.println("Guardando resultados del procesamiento en una base de datos SQL...");
    }
}