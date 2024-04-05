package ciaf.prograIII.claseabstraccion07.ejemplo3;
/*Abstracción de servicios web:
Imagina que estás desarrollando una aplicación que consume varios
servicios web de diferentes proveedores. Puedes usar la abstracción
para definir una interfaz común para acceder a estos servicios y luego
implementar esta interfaz para cada proveedor de servicios.*/
interface ServicioWeb {
    void conectar();
    void desconectar();
    String realizarPeticion(String endpoint);
}