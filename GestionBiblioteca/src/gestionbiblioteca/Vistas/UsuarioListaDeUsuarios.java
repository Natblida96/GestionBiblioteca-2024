package gestionbiblioteca.Vistas;

import gestionbiblioteca.AccesoADatos.UsuariosData;
import gestionbiblioteca.Entidades.Usuarios;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UsuarioListaDeUsuarios extends javax.swing.JInternalFrame {

    private Usuarios usuario = new Usuarios();
    private UsuariosData UsuarioD = new UsuariosData();
    private List<Usuarios> listarActivos = UsuarioD.ObtenerUsuariosDisponibles();
    private List<Usuarios> listarinactivos = UsuarioD.ObtenerUsuariosNODisponibles();

    public UsuarioListaDeUsuarios() {
        initComponents();
        armarCabeceras();
        unirBotones();

    }

    private DefaultTableModel modelo = new DefaultTableModel();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonGroup = new javax.swing.ButtonGroup();
        JRBUsuariosInactivos = new javax.swing.JRadioButton();
        JRBUsuariosActivos = new javax.swing.JRadioButton();
        JBSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTListaDeUsuariosActivosInactivos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Lista de Usuarios");

        ButtonGroup.add(JRBUsuariosInactivos);
        JRBUsuariosInactivos.setText("Usuarios Inactivos");
        JRBUsuariosInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBUsuariosInactivosActionPerformed(evt);
            }
        });

        ButtonGroup.add(JRBUsuariosActivos);
        JRBUsuariosActivos.setText("Usuarios Activos");
        JRBUsuariosActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBUsuariosActivosActionPerformed(evt);
            }
        });

        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        JTListaDeUsuariosActivosInactivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(JTListaDeUsuariosActivosInactivos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBSalir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JRBUsuariosActivos)
                        .addComponent(JRBUsuariosInactivos)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(JRBUsuariosActivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JRBUsuariosInactivos)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBSalir)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBSalirActionPerformed

    private void JRBUsuariosActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBUsuariosActivosActionPerformed
        borrarFilasTabla();
        listarActivos = UsuarioD.ObtenerUsuariosDisponibles(); // Actualizar lista de usuarios activos
        for (Usuarios usuarios : listarActivos) {
            modelo.addRow(new Object[]{usuarios.getIdUsuario(), usuarios.getNombre(), usuarios.getApellido(), usuarios.getDni(), usuarios.getEmail(), usuarios.getEstado()});
        }
    }//GEN-LAST:event_JRBUsuariosActivosActionPerformed

    private void JRBUsuariosInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBUsuariosInactivosActionPerformed
        borrarFilasTabla();
        listarinactivos = UsuarioD.ObtenerUsuariosNODisponibles(); // Actualizar lista de usuarios inactivos
        for (Usuarios usuarios : listarinactivos) {
            modelo.addRow(new Object[]{usuarios.getIdUsuario(), usuarios.getNombre(), usuarios.getApellido(), usuarios.getDni(), usuarios.getEmail(), usuarios.getEstado()});
        }
    }//GEN-LAST:event_JRBUsuariosInactivosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ButtonGroup;
    private javax.swing.JButton JBSalir;
    private javax.swing.JRadioButton JRBUsuariosActivos;
    private javax.swing.JRadioButton JRBUsuariosInactivos;
    private javax.swing.JTable JTListaDeUsuariosActivosInactivos;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void armarCabeceras() {
        modelo.addColumn("ID ");
        modelo.addColumn("Nombre ");
        modelo.addColumn("Apellido ");
        modelo.addColumn("Dni ");
        modelo.addColumn("E-mail ");

        JTListaDeUsuariosActivosInactivos.setModel(modelo);
    }

    private void unirBotones() {
        ButtonGroup grupoDeBotones = new ButtonGroup();
        grupoDeBotones.add(JRBUsuariosActivos);
        grupoDeBotones.add(JRBUsuariosInactivos);

    }

    public void borrarFilasTabla() {
        if (modelo != null) {
            int a = modelo.getRowCount() - 1;
            if (modelo.getRowCount() > 0) {
                for (int i = a; i >= 0; i--) {
                    modelo.removeRow(i);
                }
            }
        }
    }

}
