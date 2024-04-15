package gestionbiblioteca.Vistas;

import gestionbiblioteca.AccesoADatos.LibrosData;
import gestionbiblioteca.AccesoADatos.PrestamosData;
import gestionbiblioteca.AccesoADatos.UsuariosData;
import gestionbiblioteca.Entidades.Libros;
import gestionbiblioteca.Entidades.Prestamos;
import gestionbiblioteca.Entidades.Usuarios;
import java.util.List;

public class PrestamoCrearNuevoPrestamo extends javax.swing.JInternalFrame {

    private Prestamos prestamos = new Prestamos();
    private PrestamosData prestamosData = new PrestamosData();

    private Libros libros = new Libros();
    private LibrosData librosData = new LibrosData();

    private Usuarios usuarios = new Usuarios();
    private UsuariosData usuariosData = new UsuariosData();
    List<Usuarios> listaUsuarios = usuariosData.ObtenerUsuariosDisponibles();

    public PrestamoCrearNuevoPrestamo() {
        initComponents();
        //comboboxes cargados
        cargarUsuarios();
        cargarLibros();
        
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
        JTFIDUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

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

        JTFIDUsuario.setEditable(false);

        jLabel2.setText("ID Usuario");

        JTFDni.setEditable(false);

        jLabel3.setText("DNI");

        JTFEmail.setEditable(false);

        jLabel5.setText("E-mail");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JDCFechaDelPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JCBLibros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JCBUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(JRBEstadoDelPrestamo))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFIDUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(JTFDni)
                            .addComponent(JTFEmail)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(JBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JCBLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JCBUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(JDCFechaDelPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(41, 41, 41)
                .addComponent(JRBEstadoDelPrestamo)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBSalirActionPerformed
//boton guardar
    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_JBGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBSalir;
    private javax.swing.JComboBox<String> JCBLibros;
    private javax.swing.JComboBox<String> JCBUsuario;
    private com.toedter.calendar.JDateChooser JDCFechaDelPrestamo;
    private javax.swing.JRadioButton JRBEstadoDelPrestamo;
    private javax.swing.JTextField JTFDni;
    private javax.swing.JTextField JTFEmail;
    private javax.swing.JTextField JTFIDUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

    private void cargarUsuarios() {
        List<Usuarios> listaUsuarios = usuariosData.ObtenerUsuariosDisponibles();
        for (Usuarios usuario : listaUsuarios) {
            String nombreApellido = usuario.getNombre() + " " + usuario.getApellido();
            JCBUsuario.addItem(nombreApellido);
        }
    }

    private void cargarLibros() {
        List<Libros> listaLibros = librosData.listarTodosLosLibrosDisponibles();//libros disponibles tendria q ser
        for (Libros libro : listaLibros) {
            String tituloAutor = libro.getTitulo() + " - " + libro.getAutor();
            JCBLibros.addItem(tituloAutor);
        }
    }

}
