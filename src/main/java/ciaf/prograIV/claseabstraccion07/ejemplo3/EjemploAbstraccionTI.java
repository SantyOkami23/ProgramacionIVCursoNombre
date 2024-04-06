package ciaf.prograIII.claseabstraccion07.ejemplo3;

public class EjemploAbstraccionTI {
    public static void main(String[] args) {
        ServicioWeb servicioA = new ServicioWebProveedorA();
        ServicioWeb servicioB = new ServicioWebProveedorB();

        servicioA.conectar();
        System.out.println(servicioA.realizarPeticion("/recurso"));
        servicioA.desconectar();

        servicioB.conectar();
        System.out.println(servicioB.realizarPeticion("/recurso1"));
        servicioB.desconectar();
    }
}