package ciaf.prograIV.conceptospoo04.herencia;

// Clase base Vehiculo que demuestra el concepto de herencia
public class Vehiculo {
    // Atributos comunes a todos los vehículos
    private String marca;
    private String modelo;
    private int ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }



    // Constructor

    public Vehiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    // Métodos getters y setters


    // Métodos comunes a todos los vehículos
    public void acelerar() {
        System.out.println("Acelerando el vehiculo...");
    }

    public void frenar() {
        System.out.println("Frenando el vehiculo...");
    }
}
