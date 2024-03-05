package gestionbiblioteca.AccesoADatos;

import gestionbiblioteca.Entidades.Libros;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class LibrosData {

    private Connection con = null;

    public LibrosData() {
        con = ConexionData.getConexion();
    }

//Un método para insertar un nuevo registro de libro en la base de datos.
    public void guardarLibro(Libros libro) {
        String SQL = "INSERT INTO libros (titulo, autor, isbn, genero, anioPublicacion) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, libro.getTitulo());
            ps.setString(2, libro.getAutor());
            ps.setString(3, libro.getIsbn());
            ps.setString(4, libro.getGenero());
            ps.setInt(5, libro.getAnioPublicacion());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                libro.setIdLibro(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Libro agregado exitosamente");
            }

            rs.close();
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libros: " + e.getMessage());
        }
    }

//Un método para modificar la información de un libro existente en la base de datos.
    public void modificarLibro(Libros libro) {
        String SQL = "UPDATE libros SET titulo=?, autor=?, isbn=?, genero=?, anioPublicacion=? WHERE idLibro=?";
        try {
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, libro.getTitulo());
            ps.setString(2, libro.getAutor());
            ps.setString(3, libro.getIsbn());
            ps.setString(4, libro.getGenero());
            ps.setInt(5, libro.getAnioPublicacion());
            ps.setInt(6, libro.getIdLibro());

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Libro actualizado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un libro con el ID especificado");
            }

            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el libro: " + e.getMessage());
        }
    }

//Un método para eliminar virtualmente un libro a travez de su ISBN 
    public void eliminarLibro(String isbn) {
        try {
            String SQL = "UPDATE libros SET estado = 1 WHERE isbn = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, isbn);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino el libro.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un libro con este ISBN.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libros: " + e.getMessage());
        }
    }

//Un método para buscar un libro su ISBN
    public Libros buscarLibroPorISBN(String isbn) {
        Libros libro = null;
        try {
            String SQL = "SELECT * FROM libros WHERE isbn = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, isbn);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                libro = new Libros();
                libro.setIsbn(isbn);
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(rs.getString("autor"));
                libro.setGenero(rs.getString("genero"));
                libro.setAnioPublicacion(rs.getInt("anioPublicacion"));
                libro.setEstado(rs.getBoolean("estado"));
                // Puedes continuar recuperando otros atributos del libro según sea necesario
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un libro con este ISBN.");
            }

            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libros: " + e.getMessage());
        }
        return libro;
    }

//Un método para buscar un libro por su nombre  
    public List<Libros> buscarLibrosPorNombre(String nombreLibro) {
        List<Libros> librosEncontrados = new ArrayList<>();
        try {
            String SQL = "SELECT * FROM libros WHERE titulo LIKE ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, "%" + nombreLibro + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Libros libro = new Libros();
                libro.setIsbn(rs.getString("isbn"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(rs.getString("autor"));
                libro.setGenero(rs.getString("genero"));
                libro.setAnioPublicacion(rs.getInt("anioPublicacion"));
                libro.setEstado(rs.getBoolean("estado"));
                // Puedes continuar recuperando otros atributos del libro según sea necesario
                librosEncontrados.add(libro);
            }

            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libros: " + e.getMessage());
        }
        return librosEncontrados;
    }

//Un método para buscar por Autor de libro  
    public List<Libros> buscarLibrosPorAutor(String autor) {
        List<Libros> librosEncontrados = new ArrayList<>();
        try {
            String SQL = "SELECT * FROM libros WHERE autor LIKE ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, "%" + autor + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Libros libro = new Libros();
                libro.setIsbn(rs.getString("isbn"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(rs.getString("autor"));
                libro.setGenero(rs.getString("genero"));
                libro.setAnioPublicacion(rs.getInt("anioPublicacion"));
                libro.setEstado(rs.getBoolean("estado"));
                // Puedes continuar recuperando otros atributos del libro según sea necesario
                librosEncontrados.add(libro);
            }

            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libros: " + e.getMessage());
        }
        return librosEncontrados;
    }

//Un método mostrar información sobre los libros disponibles    
    public List<Libros> listarLibros() {
        List<Libros> libros = new ArrayList<>();
        try {
            String SQL = "SELECT * FROM libros";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Libros libro = new Libros();
                libro.setIdLibro(rs.getInt("idLibro"));
                libro.setIsbn(rs.getString("isbn"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(rs.getString("autor"));
                libro.setGenero(rs.getString("genero"));
                libro.setAnioPublicacion(rs.getInt("anioPublicacion"));
                libro.setEstado(rs.getBoolean("estado"));

                libros.add(libro);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libros: " + ex.getMessage());
        }
        return libros;
    }

    
}
