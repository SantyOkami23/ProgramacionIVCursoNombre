package ciaf.prograIV.claseencapsulamiento06.ejemploespecifico;

// Clase base con diferentes tipos de atributos y métodos
public class ClaseBase {
    // Atributos
    public String atributoPublico = "Atributo público";
    private String atributoPrivado = "Atributo privado";
    protected String atributoProtegido = "Atributo protegido";
    String atributoPredeterminado = "Atributo predeterminado";

    // Métodos
    public void metodoPublico() {
        System.out.println("Método público");
    }

    private void metodoPrivado() {
        System.out.println("Método privado");
    }

    protected void metodoProtegido() {
        System.out.println("Método protegido");
    }

    void metodoPredeterminado() {
        System.out.println("Método predeterminado");
    }
}
