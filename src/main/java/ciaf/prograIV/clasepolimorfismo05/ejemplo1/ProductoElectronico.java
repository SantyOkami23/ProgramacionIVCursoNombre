package ciaf.prograIV.clasepolimorfismo05.ejemplo1;


// Subclase para representar productos electrónicos
class ProductoElectronico extends Producto {
    private double impuesto;

    public ProductoElectronico(String nombre, double precio, double impuesto) {
        super(nombre, precio);
        this.impuesto = impuesto;
    }

    // Método para calcular el precio total del producto incluyendo impuestos
    @Override
    public double calcularPrecioTotal() {
        return precio * (1 + impuesto);
    }
}