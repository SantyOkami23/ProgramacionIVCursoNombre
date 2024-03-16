package ciaf.prograIV.clasepolimorfismo05.ejemplo1;

// Clase para representar una factura
class Factura {
    private Producto[] productos;

    public Factura(Producto[] productos) {
        this.productos = productos;
    }

    // Método para calcular el total de la factura
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularPrecioTotal();
        }
        return total;
    }
}
