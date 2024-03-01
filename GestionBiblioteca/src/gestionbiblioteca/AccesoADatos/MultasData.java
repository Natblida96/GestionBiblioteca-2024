package gestionbiblioteca.AccesoADatos;

import gestionbiblioteca.Entidades.Multas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class MultasData {

    private Connection con = null;

    public MultasData() {
        con = (Connection) ConexionData.getConexion();

    }

    // Método para guardar una nueva multa en la base de datos
    public void guardarMulta(Multas multa) {
        String SQL = "INSERT INTO multas (idUsuarioMultado, montoQueDebe, fechaDeMulta, estadoDelPago, dniUsuario) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, multa.getIdUsuarioMultado());
            ps.setInt(2, multa.getMontoQueDebe());
            ps.setDate(3, java.sql.Date.valueOf(multa.getFechaDeMulta()));
            ps.setBoolean(4, multa.getEstadoDelPago());
            ps.setString(5, multa.getDniUsuario());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                multa.setIdUnicoDeLaMulta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Multa agregada exitosamente");
            }

            rs.close();
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la multa: " + e.getMessage());
        }
    }

    // Método para modificar una multa en la base de datos
    public void modificarMulta(Multas multa) {
        String SQL = "UPDATE multas SET idUsuarioMultado = ?, montoQueDebe = ?, fechaDeMulta = ?, estadoDelPago = ?, dniUsuario = ? WHERE idUnicoDeLaMulta = ?";
        try {
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, multa.getIdUsuarioMultado());
            ps.setInt(2, multa.getMontoQueDebe());
            ps.setDate(3, java.sql.Date.valueOf(multa.getFechaDeMulta()));
            ps.setBoolean(4, multa.getEstadoDelPago());
            ps.setString(5, multa.getDniUsuario());
            ps.setInt(6, multa.getIdUnicoDeLaMulta());

            int filasActualizadas = ps.executeUpdate();
            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Multa actualizada exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la multa con el ID especificado");
            }

            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la multa: " + e.getMessage());
        }
    }

    // Método para eliminar una multa de la base de datos
    public void eliminarMulta(int idUnicoDeLaMulta) {
        String SQL = "DELETE FROM multas WHERE idUnicoDeLaMulta = ?";
        try {
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idUnicoDeLaMulta);

            int filasEliminadas = ps.executeUpdate();
            if (filasEliminadas > 0) {
                JOptionPane.showMessageDialog(null, "Multa eliminada exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la multa con el ID especificado");
            }

            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la multa: " + e.getMessage());
        }
    }

    // Método para buscar multas por el DNI del usuario
    public List<Multas> buscarMultasPorDNI(String dniUsuario) {
        List<Multas> multasEncontradas = new ArrayList<>();
        String SQL = "SELECT * FROM multas WHERE dniUsuario = ?";
        try {
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, dniUsuario);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Multas multa = new Multas();
                multa.setIdUnicoDeLaMulta(rs.getInt("idUnicoDeLaMulta"));
                multa.setIdUsuarioMultado(rs.getInt("idUsuarioMultado"));
                multa.setMontoQueDebe(rs.getInt("montoQueDebe"));
                multa.setFechaDeMulta(rs.getDate("fechaDeMulta").toLocalDate());
                multa.setEstadoDelPago(rs.getBoolean("estadoDelPago"));
                multa.setDniUsuario(rs.getString("dniUsuario"));
                multasEncontradas.add(multa);
            }

            rs.close();
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar multas por DNI: " + e.getMessage());
        }
        return multasEncontradas;
    }

    // Método para buscar una multa por el ID del usuario multado
    public List<Multas> buscarMultasPorIDUsuario(int idUsuarioMultado) {
        List<Multas> multasEncontradas = new ArrayList<>();
        String SQL = "SELECT * FROM multas WHERE idUsuarioMultado = ?";
        try {
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idUsuarioMultado);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Multas multa = new Multas();
                multa.setIdUnicoDeLaMulta(rs.getInt("idUnicoDeLaMulta"));
                multa.setIdUsuarioMultado(rs.getInt("idUsuarioMultado"));
                multa.setMontoQueDebe(rs.getInt("montoQueDebe"));
                multa.setFechaDeMulta(rs.getDate("fechaDeMulta").toLocalDate());
                multa.setEstadoDelPago(rs.getBoolean("estadoDelPago"));
                multa.setDniUsuario(rs.getString("dniUsuario"));
                multasEncontradas.add(multa);
            }

            rs.close();
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar multas por ID de usuario: " + e.getMessage());
        }
        return multasEncontradas;
    }

    // Método para obtener todas las multas de la base de datos
    public List<Multas> obtenerTodasLasMultas() {
        List<Multas> multas = new ArrayList<>();
        String SQL = "SELECT * FROM multas";
        try {
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Multas multa = new Multas();
                multa.setIdUnicoDeLaMulta(rs.getInt("idUnicoDeLaMulta"));
                multa.setIdUsuarioMultado(rs.getInt("idUsuarioMultado"));
                multa.setMontoQueDebe(rs.getInt("montoQueDebe"));
                multa.setFechaDeMulta(rs.getDate("fechaDeMulta").toLocalDate());
                multa.setEstadoDelPago(rs.getBoolean("estadoDelPago"));
                multa.setDniUsuario(rs.getString("dniUsuario"));
                multas.add(multa);
            }

            rs.close();
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener las multas: " + e.getMessage());
        }
        return multas;
    }

}
