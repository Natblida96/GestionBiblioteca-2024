package gestionbiblioteca.Entidades;

import java.time.LocalDate;

public class Prestamos {
    
   private int idUnicoDelPrestamo;
   private int idLibroPresta;
   private int idUsuarioPresta;
   private LocalDate fechaDelPrestamo;
   private LocalDate fechaDeDevolucion;
   private Boolean estadoDelPrestamo;

    public Prestamos() {
    }

    public Prestamos(int idLibroPresta, int idUsuarioPresta, LocalDate fechaDelPrestamo, LocalDate fechaDeDevolucion, Boolean estadoDelPrestamo) {
        this.idLibroPresta = idLibroPresta;
        this.idUsuarioPresta = idUsuarioPresta;
        this.fechaDelPrestamo = fechaDelPrestamo;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.estadoDelPrestamo = estadoDelPrestamo;
    }

    public Prestamos(int idUnicoDelPrestamo, int idLibroPresta, int idUsuarioPresta, LocalDate fechaDelPrestamo, LocalDate fechaDeDevolucion, Boolean estadoDelPrestamo) {
        this.idUnicoDelPrestamo = idUnicoDelPrestamo;
        this.idLibroPresta = idLibroPresta;
        this.idUsuarioPresta = idUsuarioPresta;
        this.fechaDelPrestamo = fechaDelPrestamo;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.estadoDelPrestamo = estadoDelPrestamo;
    }

    public int getIdUnicoDelPrestamo() {
        return idUnicoDelPrestamo;
    }

    public void setIdUnicoDelPrestamo(int idUnicoDelPrestamo) {
        this.idUnicoDelPrestamo = idUnicoDelPrestamo;
    }

    public int getIdLibroPresta() {
        return idLibroPresta;
    }

    public void setIdLibroPresta(int idLibroPresta) {
        this.idLibroPresta = idLibroPresta;
    }

    public int getIdUsuarioPresta() {
        return idUsuarioPresta;
    }

    public void setIdUsuarioPresta(int idUsuarioPresta) {
        this.idUsuarioPresta = idUsuarioPresta;
    }

    public LocalDate getFechaDelPrestamo() {
        return fechaDelPrestamo;
    }

    public void setFechaDelPrestamo(LocalDate fechaDelPrestamo) {
        this.fechaDelPrestamo = fechaDelPrestamo;
    }

    public LocalDate getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(LocalDate fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public Boolean getEstadoDelPrestamo() {
        return estadoDelPrestamo;
    }

    public void setEstadoDelPrestamo(Boolean estadoDelPrestamo) {
        this.estadoDelPrestamo = estadoDelPrestamo;
    }

    @Override
    public String toString() {
        return "ID Unico Del Prestamo " + idUnicoDelPrestamo + 
               ", ID Libro Presta " + idLibroPresta + 
               ", ID Usuario Presta " + idUsuarioPresta + 
               ", Fecha Del Prestamo " + fechaDelPrestamo + 
               ", Fecha De Devolucion " + fechaDeDevolucion + 
               ", Estado Del Prestamo " + estadoDelPrestamo;
    }
    
    
}
