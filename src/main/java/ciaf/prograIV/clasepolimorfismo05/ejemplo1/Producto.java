package ciaf.prograIV.clasepolimorfismo05.ejemplo1;

// Clase base para representar un producto
class Producto {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método para calcular el precio total del producto
    public double calcularPrecioTotal() {
        return precio;
    }
}
