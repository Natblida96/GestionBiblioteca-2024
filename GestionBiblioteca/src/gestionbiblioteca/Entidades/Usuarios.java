package gestionbiblioteca.Entidades;

public class Usuarios {

    private int idUsuario;
    private String nombre;
    private String apellido;
    private int dni;
    private String email;
//    private String contrasenia;
    private Boolean estado;

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, int dni, String email, String contrasenia, Boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
//        this.contrasenia = contrasenia;
        this.estado = estado;
    }

    public Usuarios(int idUsuario, String nombre, String apellido, int dni, String email, String contrasenia, Boolean estado) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
//      this.contrasenia = contrasenia;
        this.estado = estado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public String getContrasenia() {
//        return contrasenia;
//    }
//
//    public void setContrasenia(String contrasenia) {
//        this.contrasenia = contrasenia;
//    }
    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ID Usuario " + idUsuario
                + ", Nombre " + nombre
                + ", Apellido " + apellido
                + ", DNI " + dni
                + ", Email " + email
                + ", Estado " + estado;
        //       + ", Contraseña " + contrasenia

    }
}
