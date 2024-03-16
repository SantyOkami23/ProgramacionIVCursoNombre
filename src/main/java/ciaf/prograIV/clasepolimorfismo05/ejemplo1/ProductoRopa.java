package ciaf.prograIV.clasepolimorfismo05.ejemplo1;

class ProductoRopa extends Producto {
    private int cantidad;

    public ProductoRopa(String nombre, double precio, int cantidad) {
        super(nombre, precio);
        this.cantidad = cantidad;
    }

    // Método para calcular el precio total del producto basado en la cantidad
    @Override
    public double calcularPrecioTotal() {
        return precio * cantidad;
    }
}