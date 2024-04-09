package gestionbiblioteca.Vistas;

import gestionbiblioteca.AccesoADatos.PrestamosData;
import gestionbiblioteca.AccesoADatos.UsuariosData;
import gestionbiblioteca.Entidades.Prestamos;
import gestionbiblioteca.Entidades.Usuarios;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;

public class PrestamoCrearNuevoPrestamo extends javax.swing.JInternalFrame {

    private PrestamosData prestamosData = new PrestamosData();
    private Prestamos prestamos = new Prestamos();

    private Usuarios usuarios = new Usuarios();
    private UsuariosData usuariosData = new UsuariosData();

    public PrestamoCrearNuevoPrestamo() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTFIDLibro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JTFIDPrestamo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JBGuardar = new javax.swing.JButton();
        JBSalir = new javax.swing.JButton();
        JRBEstadoDelPrestamo = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        JTFIDUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JTFNombreUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JTFApellidoUsuario = new javax.swing.JTextField();
        JDCFechaDelPrestamo = new com.toedter.calendar.JDateChooser();

        jLabel1.setText("Fecha del Prestamo");

        jLabel2.setText(" ID del Prestamo");

        jLabel4.setText(" ID del Libro");

        JBGuardar.setText("Guardar");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        JRBEstadoDelPrestamo.setText("Estado del Prestamo");

        jLabel6.setText(" ID del Usuario ");

        jLabel7.setText("Nombre/s del Usuario ");

        jLabel8.setText("Apellido/s del Usuario ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFIDLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFApellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFIDPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBSalir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JRBEstadoDelPrestamo)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JDCFechaDelPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTFIDLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(JDCFechaDelPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFIDPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JRBEstadoDelPrestamo))
                .addGap(18, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JTFIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(JTFNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(JTFApellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBGuardar)
                    .addComponent(JBSalir))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBSalirActionPerformed

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        try {
            prestamos.setIdLibroPresta(Integer.parseInt(JTFIDLibro.getText()));
            prestamos.setIdUnicoDelPrestamo(Integer.parseInt(JTFIDPrestamo.getText()));
            prestamos.setIdUsuarioPresta(Integer.parseInt(JTFIDUsuario.getText()));
            usuarios.setApellido(JTFIDPrestamo.getText());
            usuarios.setNombre(JTFIDLibro.getText());

            // Obtener la fecha del JDateChooser y convertirla a LocalDate
            Date fechaPrestamo = JDCFechaDelPrestamo.getDate();
            LocalDate fechaPrestamoLocalDate = fechaPrestamo.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            prestamos.setFechaDelPrestamo(fechaPrestamoLocalDate);

            if (JRBEstadoDelPrestamo.isSelected()) {
                prestamos.setEstadoDelPrestamo(true);
            } else {
                prestamos.setEstadoDelPrestamo(false);
            }
            usuariosData.guardarUsuario(usuarios);
            limpiar();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, " El Dni debe ser un Numero. " + e.getMessage());
            limpiar();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No deje campos Vacios " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_JBGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBSalir;
    private com.toedter.calendar.JDateChooser JDCFechaDelPrestamo;
    private javax.swing.JRadioButton JRBEstadoDelPrestamo;
    private javax.swing.JTextField JTFApellidoUsuario;
    private javax.swing.JTextField JTFIDLibro;
    private javax.swing.JTextField JTFIDPrestamo;
    private javax.swing.JTextField JTFIDUsuario;
    private javax.swing.JTextField JTFNombreUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

    public void limpiar() {
        JTFNombreUsuario.setText("");
        JTFApellidoUsuario.setText("");
        JTFIDLibro.setText("");
        JTFIDPrestamo.setText("");
        JTFIDUsuario.setText("");
        JRBEstadoDelPrestamo.setSelected(false);

    }

}
