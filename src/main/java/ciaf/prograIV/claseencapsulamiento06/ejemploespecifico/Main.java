package ciaf.prograIV.claseencapsulamiento06.ejemploespecifico;

// Clase desde donde se llaman los atributos y métodos de la clase base
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase base
        ClaseBase objeto = new ClaseBase();

        // Acceder a los atributos y métodos de la clase base
        System.out.println("Atributo público: " + objeto.atributoPublico);
        // El atributo privado no puede ser accedido desde esta clase
        System.out.println("Atributo protegido: " + objeto.atributoProtegido);
        System.out.println("Atributo predeterminado: " + objeto.atributoPredeterminado);

        objeto.metodoPublico();
        // El método privado no puede ser accedido desde esta clase
        objeto.metodoProtegido();
        objeto.metodoPredeterminado();

    }
}
