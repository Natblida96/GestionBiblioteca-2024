package gestionbiblioteca.Entidades;

public class Libros {

    private int idLibro;
    private String titulo;
    private String autor;
    private String genero;
    private int anioPublicacion;
    private String isbn;
    private Boolean estado;

    public Libros() {
    }

    public Libros(String titulo, String autor, String genero, int anioPublicacion, String isbn, Boolean estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
        this.isbn = isbn;
        this.estado = estado;
    }

    public Libros(int idLibro, String titulo, String autor, String genero, int anioPublicacion, String isbn, Boolean estado) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
        this.isbn = isbn;
        this.estado = estado;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
  
    @Override
    public String toString() {
        return "ID" + idLibro
                + ", Titulo " + titulo
                + ", Autor " + autor
                + ", Genero " + genero
                + ", Año De Publicacion " + anioPublicacion
                + ", ISBN " + isbn
                + ", Estado " + estado;
    }

}
