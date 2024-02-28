package gestionbiblioteca.Entidades;

public class Usuarios {
    
    private int idUsuario;
    private String nombre;
    private String apellido;
    private int dni;
    private String email;
    private String contrasenia;

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, int dni, String email, String contrasenia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.contrasenia = contrasenia;
    }

    public Usuarios(int idUsuario, String nombre, String apellido, int dni, String email, String contrasenia) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.contrasenia = contrasenia;
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

    public String getContraseña() {
        return contrasenia;
    }

    public void setContraseña(String contraseña) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "ID Usuario " + idUsuario + 
               ", nombre " + nombre + 
               ", apellido " + apellido + 
               ", dni " + dni + 
               ", email " + email + 
               ", contraseña=" + contrasenia + '}';
    }
                                   
}
