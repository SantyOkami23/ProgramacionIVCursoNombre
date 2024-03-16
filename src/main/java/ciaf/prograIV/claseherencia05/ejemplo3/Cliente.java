package ciaf.prograIV.claseherencia05.ejemplo3;

// Clase Cliente (subclase de Usuario)
public class Cliente extends Usuario {
    int idCliente;
    double totalCompras;

    // Constructor


    public Cliente(String nombre, String correo, int idCliente, double totalCompras) {
        super(nombre, correo);
        this.idCliente = idCliente;
        this.totalCompras = totalCompras;
    }

    // Método para mostrar la información del cliente
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método de la superclase
        System.out.println("ID de Cliente: " + idCliente);
        System.out.println("Total de Compras: $" + totalCompras);
    }
}
