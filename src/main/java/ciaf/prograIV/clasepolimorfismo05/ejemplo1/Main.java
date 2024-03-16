package ciaf.prograIV.clasepolimorfismo05.ejemplo1;


public class Main {
    public static void main(String[] args) {
        // Crear productos
        ProductoElectronico celular = new ProductoElectronico("Celular", 1000, 0.18);
        ProductoRopa camisa = new ProductoRopa("Camisa", 25, 3);

        // Crear una factura con los productos
        Producto[] productos = {celular, camisa};
        Factura factura = new Factura(productos);

        // Calcular y mostrar el total de la factura
        double totalFactura = factura.calcularTotal();
        System.out.println("Total de la factura: $" + totalFactura);
    }
}
