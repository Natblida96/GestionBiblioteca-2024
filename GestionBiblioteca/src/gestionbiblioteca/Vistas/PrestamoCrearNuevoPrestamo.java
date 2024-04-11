package gestionbiblioteca.Vistas;

import gestionbiblioteca.AccesoADatos.LibrosData;
import gestionbiblioteca.AccesoADatos.PrestamosData;
import gestionbiblioteca.AccesoADatos.UsuariosData;
import gestionbiblioteca.Entidades.Libros;
import gestionbiblioteca.Entidades.Prestamos;
import gestionbiblioteca.Entidades.Usuarios;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class PrestamoCrearNuevoPrestamo extends javax.swing.JInternalFrame {

    private Prestamos prestamos = new Prestamos();
    private PrestamosData prestamosData = new PrestamosData();

    private Libros libros = new Libros();
    private LibrosData librosData = new LibrosData();

    private Usuarios usuarios = new Usuarios();
    private UsuariosData usuariosData = new UsuariosData();

    public PrestamoCrearNuevoPrestamo() {
        initComponents();
        cargarLibrosDisponibles();
        cargarUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JBGuardar = new javax.swing.JButton();
        JBSalir = new javax.swing.JButton();
        JRBEstadoDelPrestamo = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        JDCFechaDelPrestamo = new com.toedter.calendar.JDateChooser();
        JCBLibros = new javax.swing.JComboBox<>();
        JCBUsuario = new javax.swing.JComboBox<>();

        jLabel1.setText("Fecha del Prestamo");

        jLabel4.setText("Seleccionar Libro");

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

        jLabel7.setText("Seleccionar Usuario ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(JRBEstadoDelPrestamo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCBUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCBLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JDCFechaDelPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(66, 66, 66)
                                .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JCBLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JCBUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(JDCFechaDelPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(JRBEstadoDelPrestamo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBSalirActionPerformed

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        try {
            // Obtener el título del libro seleccionado en el JComboBox
            String tituloLibro = (String) JCBLibros.getSelectedItem();

            // Buscar el libro en la lista de libros disponibles por su título
            Libros libroSeleccionado = null;
            for (Libros libro : librosData.listarTodosLosLibros()) {
                if (libro.getTitulo().equals(tituloLibro)) {
                    libroSeleccionado = libro;
                    break;
                }
            }

            
            if (libroSeleccionado != null) {
                // Configurar el préstamo con el libro seleccionado
                prestamos.setIdLibroPresta(libroSeleccionado.getIdLibro());

                // Obtener el usuario seleccionado del JComboBox
                String nombreCompletoUsuario = (String) JCBUsuario.getSelectedItem();
                String[] partesNombre = nombreCompletoUsuario.split(" ");
                String nombreUsuario = partesNombre[0];
                String apellidoUsuario = partesNombre[1];

                // Configurar los datos del usuario
                usuarios.setNombre(nombreUsuario);
                usuarios.setApellido(apellidoUsuario);

                // Obtener la fecha del JDateChooser y convertirla a LocalDate
                Date fechaPrestamo = JDCFechaDelPrestamo.getDate();
                LocalDate fechaPrestamoLocalDate = fechaPrestamo.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                prestamos.setFechaDelPrestamo(fechaPrestamoLocalDate);

                // Configurar el estado del préstamo
                prestamos.setEstadoDelPrestamo(JRBEstadoDelPrestamo.isSelected());

                // Guardar el préstamo y el usuario
                usuariosData.guardarUsuarioModificadoJCBox(usuarios);// ACA LO GUARDA!!
                prestamosData.guardarPrestamo(prestamos);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un libro válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, " El DNI debe ser un número. " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            limpiar();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No deje campos vacíos. " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_JBGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBSalir;
    private javax.swing.JComboBox<String> JCBLibros;
    private javax.swing.JComboBox<String> JCBUsuario;
    private com.toedter.calendar.JDateChooser JDCFechaDelPrestamo;
    private javax.swing.JRadioButton JRBEstadoDelPrestamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

    public void limpiar() {
//        JTFNombreUsuario.setText("");
//        JTFApellidoUsuario.setText("");    
//        JTFNombreLibro.setText("");
        JRBEstadoDelPrestamo.setSelected(false);
        JDCFechaDelPrestamo.setDate(null);

    }

    private void cargarLibrosDisponibles() {
        // Obtener la lista de libros disponibles
        List<Libros> librosDisponibles = librosData.listarTodosLosLibros();

        // Limpiar el JComboBox
        JCBLibros.removeAllItems();

        // Agregar los títulos de los libros al JComboBox
        for (Libros libro : librosDisponibles) {
            JCBLibros.addItem(libro.getTitulo());
        }
    }

    private void cargarUsuarios() {
        List<Usuarios> listaUsuarios = usuariosData.ObtenerUsuariosDisponibles();
        for (Usuarios usuario : listaUsuarios) {
            JCBUsuario.addItem(usuario.getNombre() + " " + usuario.getApellido());
        }
    }

//
//    private void cargarUsuarios() {
//        List<Usuarios> listaUsuarios = usuariosData.ObtenerUsuariosDisponibles();
//        for (Usuarios usuario : listaUsuarios) {
//            JCBUsuario.addItem(usuario.getNombre() + " " + usuario.getApellido() +" " + usuario.getDni() + " " + usuario.getEmail());
//        }
//
//    }
}
