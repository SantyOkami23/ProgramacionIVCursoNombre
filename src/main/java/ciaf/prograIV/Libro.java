package ciaf.prograIV;

public class Libro {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Libro(String nombre, String autor, int anioPublicacion, String isbn) {
        this.nombre = nombre;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    private String nombre;
    private String autor;
    private int anioPublicacion;
    private String isbn;



}
