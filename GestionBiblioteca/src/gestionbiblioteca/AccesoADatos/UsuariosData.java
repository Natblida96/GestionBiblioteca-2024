package gestionbiblioteca.AccesoADatos;

import gestionbiblioteca.Entidades.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class UsuariosData {

    private Connection con = null;

    public UsuariosData() {
        con = ConexionData.getConexion();
    }

// Crear (Guardar un nuevo usuario)
    public void guardarUsuario(Usuarios usuario) {
        String SQL = "INSERT INTO usuarios (nombre, apellido, dni, email, contrasenia, estado) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setInt(3, usuario.getDni());
            ps.setString(4, usuario.getEmail());
//          ps.setString(5, usuario.getContrasenia());
            ps.setBoolean(6, usuario.getEstado());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                usuario.setIdUsuario(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Usuario agregado exitosamente");
            }

            rs.close();
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el usuario: " + e.getMessage());
        }

    }

// Leer (Buscar un usuario por ID)
    public Usuarios buscarUsuarioPorID(int idUsuario) {
        Usuarios usuario = null;
        try {
            String SQL = "SELECT * FROM usuarios WHERE idUsuario = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                usuario = new Usuarios();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setDni(rs.getInt("dni"));
                usuario.setEmail(rs.getString("email"));
//              usuario.setContrasenia(rs.getString("contrasenia"));
                usuario.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un usuario con este ID.");
            }

            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el usuario: " + e.getMessage());
        }
        return usuario;

    }

// Actualizar (Modificar un usuario existente)
    public void modificarUsuario(Usuarios usuario) {
        String SQL = "UPDATE usuarios SET nombre=?, apellido=?, dni=?, email=?, contrasenia=?, estado=? WHERE idUsuario=?";
        try {
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setInt(3, usuario.getDni());
            ps.setString(4, usuario.getEmail());
//          ps.setString(5, usuario.getContrasenia());
            ps.setBoolean(6, usuario.getEstado());
            ps.setInt(7, usuario.getIdUsuario());

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Usuario actualizado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un usuario con el ID especificado");
            }

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el usuario: " + e.getMessage());
        }
    }

//Eliminar (Cambiar estado de un usuario a inactivo)    
    public void eliminarUsuario(int idUsuario, boolean estado) {
        try {
            String SQL = "UPDATE usuarios SET estado = ? WHERE idUsuario = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setBoolean(1, estado);
            ps.setInt(2, idUsuario);
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                if (estado) {
                    JOptionPane.showMessageDialog(null, "Usuario activado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario desactivado exitosamente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un usuario con este ID");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cambiar el estado del usuario: " + e.getMessage());
        }
    }

//Buscar usuarios por su DNI en la base de datos. 
    public Usuarios buscarUsuarioPorDNI(int dni) {
        Usuarios usuario = null;
        try {
            String SQL = "SELECT * FROM usuarios WHERE dni = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                usuario = new Usuarios();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setDni(rs.getInt("dni"));
                usuario.setEmail(rs.getString("email"));
//              usuario.setContrasenia(rs.getString("contrasenia"));
                usuario.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un usuario con este DNI.");
            }

            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el usuario por DNI: " + e.getMessage());
        }
        return usuario;
    }

//Buscar usuarios por su ID en la base de datos.
    public Usuarios buscarUsuarioPorId(int idUsuario) {
        Usuarios usuario = null;
        try {
            String SQL = "SELECT * FROM usuarios WHERE idUsuario = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                usuario = new Usuarios();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setDni(rs.getInt("dni"));
                usuario.setEmail(rs.getString("email"));
//              usuario.setContrasenia(rs.getString("contrasenia"));
                usuario.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un usuario con este ID.");
            }

            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el usuario por ID: " + e.getMessage());
        }
        return usuario;
    }
        
// Buscar usuarios por su Nombre en la base de datos.
    public Usuarios buscarUsuarioPorNombre(String nombreUsuario) {
        Usuarios usuario = null;
        String sql = "SELECT * FROM usuarios WHERE nombre = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombreUsuario);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                // Si hay resultados, crear un objeto Usuarios con los datos obtenidos
                usuario = new Usuarios();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setDni(rs.getInt("dni"));
                usuario.setEmail(rs.getString("email"));
//              usuario.setContrasenia(rs.getString("contrasenia"));
                usuario.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar usuario por nombre: " + ex.getMessage());
        }
        return usuario;
    }
}
