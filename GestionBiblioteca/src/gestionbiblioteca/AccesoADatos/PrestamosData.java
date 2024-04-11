package gestionbiblioteca.AccesoADatos;

import gestionbiblioteca.MainConexion.ConexionData;
import gestionbiblioteca.Entidades.Prestamos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PrestamosData {

    private Connection con = null;

    public PrestamosData() {
        con = ConexionData.getConexion();
    }

// Crear (Guardar un nuevo Prestamo)
    public void guardarPrestamo(Prestamos prestamo) {
        String sql = "INSERT INTO prestamos (idLibroPresta, idUsuarioPresta, fechaDelPrestamo, fechaDeDevolucion, estadoDelPrestamo) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, prestamo.getIdLibroPresta());
            ps.setInt(2, prestamo.getIdUsuarioPresta());
            ps.setDate(3, java.sql.Date.valueOf(prestamo.getFechaDelPrestamo()));

            //para que pueda o no ser null!!
            if (prestamo.getFechaDeDevolucion() != null) {
                ps.setDate(4, java.sql.Date.valueOf(prestamo.getFechaDeDevolucion()));
            } else {
                ps.setNull(4, java.sql.Types.DATE);
            }
            //

            ps.setBoolean(5, prestamo.getEstadoDelPrestamo());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al agregar prestamo: " + ex.getMessage());
        }

    }

// lista de TODOS los Prestamos.
    public List<Prestamos> obtenerPrestamos() {
        List<Prestamos> prestamos = new ArrayList<>();
        String sql = "SELECT * FROM prestamos";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idUnicoDelPrestamo = rs.getInt("idUnicoDelPrestamo");
                int idLibroPresta = rs.getInt("idLibroPresta");
                int idUsuarioPresta = rs.getInt("idUsuarioPresta");
                LocalDate fechaDelPrestamo = rs.getDate("fechaDelPrestamo").toLocalDate();
                LocalDate fechaDeDevolucion = rs.getDate("fechaDeDevolucion").toLocalDate();
                boolean estadoDelPrestamo = rs.getBoolean("estadoDelPrestamo");
                Prestamos prestamo = new Prestamos(idUnicoDelPrestamo, idLibroPresta, idUsuarioPresta, fechaDelPrestamo, fechaDeDevolucion, estadoDelPrestamo);
                prestamos.add(prestamo);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener prestamos: " + ex.getMessage());
        }
        return prestamos;
    }

// Actualizar (Modificar un Prestamo existente).
    public void modificarPrestamo(Prestamos prestamo) {
        String sql = "UPDATE prestamos SET idLibroPresta = ?, idUsuarioPresta = ?, fechaDelPrestamo = ?, fechaDeDevolucion = ?, estadoDelPrestamo = ? WHERE idUnicoDelPrestamo = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, prestamo.getIdLibroPresta());
            ps.setInt(2, prestamo.getIdUsuarioPresta());
            ps.setDate(3, java.sql.Date.valueOf(prestamo.getFechaDelPrestamo()));
            ps.setDate(4, java.sql.Date.valueOf(prestamo.getFechaDeDevolucion()));
            ps.setBoolean(5, prestamo.getEstadoDelPrestamo());
            ps.setInt(6, prestamo.getIdUnicoDelPrestamo());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al actualizar prestamo: " + ex.getMessage());
        }
    }

// Eliminar (Virtualmente)   
    public void eliminarPrestamo(int idUnicoDelPrestamo, boolean estado) {
        String sql = "UPDATE prestamos SET estadoDelPrestamo = ? WHERE idUnicoDelPrestamo = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, estado);
            ps.setInt(2, idUnicoDelPrestamo);
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                if (estado) {
                    JOptionPane.showMessageDialog(null, "Préstamo activado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Préstamo desactivado exitosamente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un préstamo con este ID");
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al cambiar el estado del préstamo: " + ex.getMessage());
        }
    }

//Listar Usuarios Disponibles
    public List<Prestamos> ObtenerPrestamosDisponibles() {
        ArrayList<Prestamos> prestamo = new ArrayList<>();

        String SQL = "SELECT * FROM prestamos WHERE estadoDelPrestamo = 1";

        try {
            
            PreparedStatement ps = con.prepareStatement(SQL);// esta es la línea 120 de PrestamosData

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Prestamos prestamos = new Prestamos();

                prestamos.setIdLibroPresta(rs.getInt("idLibroPresta"));
                prestamos.setIdUsuarioPresta(rs.getInt("idUsuarioPresta"));
                prestamos.setIdUnicoDelPrestamo(rs.getInt("idUnicoDelPrestamo"));
                prestamos.setFechaDelPrestamo(rs.getObject("fechaDelPrestamo", LocalDate.class)); //fechaDelPrestamo es de tipo LocalDate
                prestamos.setFechaDeDevolucion(rs.getObject("fechaDeDevolucion", LocalDate.class));
                prestamos.setEstadoDelPrestamo(rs.getBoolean("estadoDelPrestamo"));
                prestamo.add(prestamos);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Prestamos" + ex.getMessage());
        }
        return prestamo; 
    }

//Listar Prestamos NO Disponibles
    public List<Prestamos> ObtenerPrestamosNODisponibles() {
        ArrayList<Prestamos> prestamo = new ArrayList<>();

        String SQL = "SELECT * FROM prestamos WHERE estadoDelPrestamo = 0";

        try {
            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Prestamos prestamos = new Prestamos();

                prestamos.setIdLibroPresta(rs.getInt("idLibroPresta"));
                prestamos.setIdUsuarioPresta(rs.getInt("idUsuarioPresta"));
                prestamos.setIdUnicoDelPrestamo(rs.getInt("idUnicoDelPrestamo"));
                prestamos.setFechaDelPrestamo(rs.getObject("fechaDelPrestamo", LocalDate.class)); //fechaDelPrestamo es de tipo LocalDate
                prestamos.setFechaDeDevolucion(rs.getObject("fechaDeDevolucion", LocalDate.class));
                prestamos.setEstadoDelPrestamo(rs.getBoolean("estadoDelPrestamo"));

                prestamo.add(prestamos);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Prestamos" + ex.getMessage());
        }
        return prestamo;
    }

    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
}
