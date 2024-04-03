package gestionbiblioteca.Vistas;

import gestionbiblioteca.AccesoADatos.LibrosData;
import gestionbiblioteca.AccesoADatos.UsuariosData;
import gestionbiblioteca.Entidades.Usuarios;
import javax.swing.JOptionPane;

public class UsuarioModificacionDeUsuarios extends javax.swing.JInternalFrame {

    private LibrosData librosData = new LibrosData();
    private Usuarios usuarios = new Usuarios();
    private UsuariosData usuariosData = new UsuariosData();

    public UsuarioModificacionDeUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTFDni = new javax.swing.JTextField();
        JTFApellido = new javax.swing.JTextField();
        JTFEmail = new javax.swing.JTextField();
        JBModificar = new javax.swing.JButton();
        JBSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTFNombre = new javax.swing.JTextField();
        JRBEstado = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        JBBuscarPorID = new javax.swing.JButton();
        JTFCodigo = new javax.swing.JTextField();
        JBBuscarPorDNI = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Modificacion de Usuarios");

        jLabel3.setText("DNI");

        jLabel4.setText("E-mail");

        JBModificar.setText("Modificar");
        JBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBModificarActionPerformed(evt);
            }
        });

        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        JRBEstado.setText("Estado");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel9.setText("Codigo/ID");

        JBBuscarPorID.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBBuscarPorID.setText("Buscar");
        JBBuscarPorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarPorIDActionPerformed(evt);
            }
        });

        JBBuscarPorDNI.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBBuscarPorDNI.setText("Buscar");
        JBBuscarPorDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarPorDNIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBBuscarPorID))
                    .addComponent(JTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(31, 31, 31)
                            .addComponent(JTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JBBuscarPorDNI))
                        .addComponent(JRBEstado)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBBuscarPorID)
                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3)
                    .addComponent(JTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBBuscarPorDNI))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(JTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBEstado)
                    .addComponent(JTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBModificarActionPerformed
        try {
            usuarios.setDni(Integer.parseInt(JTFDni.getText()));
            usuarios.setApellido(JTFApellido.getText());
            usuarios.setNombre(JTFNombre.getText());
            usuarios.setEmail(JTFEmail.getText());

            if (JRBEstado.isSelected() == true) {
                usuarios.setEstado(true);
            } else {
                usuarios.setEstado(false);
            }
            usuariosData.modificarUsuario(usuarios);
            limpiar();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, " El Dni debe ser un Numero. " + e.getMessage());
            limpiar();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No deje campos Vacios " + e.getMessage());
        }
    }//GEN-LAST:event_JBModificarActionPerformed

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBSalirActionPerformed

    private void JBBuscarPorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarPorIDActionPerformed

        try {
            int id = Integer.parseInt(JTFCodigo.getText());
            Usuarios usuarios = usuariosData.buscarUsuarioPorID(id);

            if (usuarios != null) {
                JTFApellido.setText(usuarios.getApellido());
                JTFNombre.setText(usuarios.getNombre());
                JTFDni.setText(String.valueOf(usuarios.getDni()));
                JTFEmail.setText(usuarios.getEmail());
                JRBEstado.setSelected(usuarios.getEstado());

            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un bombero con este ID.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para el ID: " + e.getMessage());
        }
    }//GEN-LAST:event_JBBuscarPorIDActionPerformed

    private void JBBuscarPorDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarPorDNIActionPerformed

        try {
            if (usuarios != null) {
                String dniText = JTFDni.getText(); 
                int dni = Integer.parseInt(dniText); 
                Usuarios usuarios = usuariosData.buscarUsuarioPorDNI(dni);

                JTFCodigo.setText(String.valueOf(usuarios.getIdUsuario()));
                JTFApellido.setText(usuarios.getApellido());
                JTFNombre.setText(usuarios.getNombre());
                JTFEmail.setText(usuarios.getEmail());
                if (usuarios.getEstado()) {
                    JRBEstado.setSelected(true);
                }
                if (usuarios.getEstado() == false) {
                    JRBEstado.setSelected(false);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese números sin puntos ni comas " + e.getMessage());
        }


    }//GEN-LAST:event_JBBuscarPorDNIActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscarPorDNI;
    private javax.swing.JButton JBBuscarPorID;
    private javax.swing.JButton JBModificar;
    private javax.swing.JButton JBSalir;
    private javax.swing.JRadioButton JRBEstado;
    private javax.swing.JTextField JTFApellido;
    private javax.swing.JTextField JTFCodigo;
    private javax.swing.JTextField JTFDni;
    private javax.swing.JTextField JTFEmail;
    private javax.swing.JTextField JTFNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    public void limpiar() {
        JTFApellido.setText("");
        JTFDni.setText("");
        JTFNombre.setText("");
        JTFEmail.setText("");
        JRBEstado.setSelected(false);
    }
}
