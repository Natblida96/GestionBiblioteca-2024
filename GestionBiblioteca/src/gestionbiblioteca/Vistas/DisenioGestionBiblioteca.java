package gestionbiblioteca.Vistas;

import gestionbiblioteca.AccesoADatos.LibrosData;
import gestionbiblioteca.AccesoADatos.MultasData;
import gestionbiblioteca.AccesoADatos.PrestamosData;
import gestionbiblioteca.AccesoADatos.UsuariosData;

public class DisenioGestionBiblioteca extends javax.swing.JFrame {

    private final LibrosData lb;
    private final MultasData md;
    private final PrestamosData pd;
    private final UsuariosData ud;

    public DisenioGestionBiblioteca() {
        initComponents();
        setTitle("Sistema de Gestión de la Biblioteca del Tango y la Pluma - Argentina.");

        lb = new LibrosData();
        md = new MultasData();
        pd = new PrestamosData();
        ud = new UsuariosData();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDPEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMIListaDeUsuarios = new javax.swing.JMenuItem();
        JMICargaYBajaUsuarios = new javax.swing.JMenuItem();
        JMIModificacionDeUsuarios = new javax.swing.JMenuItem();
        JMLibros = new javax.swing.JMenu();
        JMIListaDeLibros = new javax.swing.JMenuItem();
        JMIModificarLibros = new javax.swing.JMenuItem();
        JMICargaBajaDeLibros = new javax.swing.JMenuItem();
        JMMultas = new javax.swing.JMenu();
        JMPrestamos = new javax.swing.JMenu();
        JMSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout JDPEscritorioLayout = new javax.swing.GroupLayout(JDPEscritorio);
        JDPEscritorio.setLayout(JDPEscritorioLayout);
        JDPEscritorioLayout.setHorizontalGroup(
            JDPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 869, Short.MAX_VALUE)
        );
        JDPEscritorioLayout.setVerticalGroup(
            JDPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
        );

        jMenu1.setText("Usuarios");

        JMIListaDeUsuarios.setText("Lista de Usuarios");
        JMIListaDeUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIListaDeUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(JMIListaDeUsuarios);

        JMICargaYBajaUsuarios.setText("Carga y Baja de Usuarios (Eliminacion)");
        JMICargaYBajaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICargaYBajaUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(JMICargaYBajaUsuarios);

        JMIModificacionDeUsuarios.setText("Modificacion de Usuarios");
        JMIModificacionDeUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIModificacionDeUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(JMIModificacionDeUsuarios);

        jMenuBar1.add(jMenu1);

        JMLibros.setText("Libros");

        JMIListaDeLibros.setText("Lista de Libros Cargados");
        JMIListaDeLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIListaDeLibrosActionPerformed(evt);
            }
        });
        JMLibros.add(JMIListaDeLibros);

        JMIModificarLibros.setText("Modificar Libros Cargados");
        JMIModificarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIModificarLibrosActionPerformed(evt);
            }
        });
        JMLibros.add(JMIModificarLibros);

        JMICargaBajaDeLibros.setText("Carga/Eliminacion de Libros");
        JMICargaBajaDeLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICargaBajaDeLibrosActionPerformed(evt);
            }
        });
        JMLibros.add(JMICargaBajaDeLibros);

        jMenuBar1.add(JMLibros);

        JMMultas.setText("Multas");
        jMenuBar1.add(JMMultas);

        JMPrestamos.setText("Prestamos");
        jMenuBar1.add(JMPrestamos);

        JMSalir.setText("Salir");
        jMenuBar1.add(JMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//
//
//
//
//
//
//
//------------USUARIOS----------
    private void JMIListaDeUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIListaDeUsuariosActionPerformed

        JDPEscritorio.removeAll();
        JDPEscritorio.repaint();
        //cambiarfondo();
        UsuarioListaDeUsuarios ulu = new UsuarioListaDeUsuarios();
        ulu.setVisible(true);
        JDPEscritorio.add(ulu);
        JDPEscritorio.moveToFront(ulu);

    }//GEN-LAST:event_JMIListaDeUsuariosActionPerformed

    private void JMICargaYBajaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICargaYBajaUsuariosActionPerformed
        JDPEscritorio.removeAll();
        JDPEscritorio.repaint();
        UsuariosCargaYBajaDeUsuariosEliminacion cbe = new UsuariosCargaYBajaDeUsuariosEliminacion();
        cbe.setVisible(true);
        JDPEscritorio.add(cbe);
        JDPEscritorio.moveToFront(cbe);

    }//GEN-LAST:event_JMICargaYBajaUsuariosActionPerformed

    private void JMIModificacionDeUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIModificacionDeUsuariosActionPerformed
        JDPEscritorio.removeAll();
        JDPEscritorio.repaint();
        UsuarioModificacionDeUsuarios umu = new UsuarioModificacionDeUsuarios();
        umu.setVisible(true);
        JDPEscritorio.add(umu);
        JDPEscritorio.moveToFront(umu);

    }//GEN-LAST:event_JMIModificacionDeUsuariosActionPerformed
//
//
//
//
//
//
//
//---------------LIBROS--------------
    private void JMIListaDeLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIListaDeLibrosActionPerformed
        
        
        
        
        
        
    }//GEN-LAST:event_JMIListaDeLibrosActionPerformed

    private void JMICargaBajaDeLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICargaBajaDeLibrosActionPerformed
        
        
        
        
        
    }//GEN-LAST:event_JMICargaBajaDeLibrosActionPerformed

    private void JMIModificarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIModificarLibrosActionPerformed
       
        
        
        
        
        
    }//GEN-LAST:event_JMIModificarLibrosActionPerformed
//
//
//
//
//
//
//
//---------------PRESTAMOS--------------
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DisenioGestionBiblioteca.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisenioGestionBiblioteca.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisenioGestionBiblioteca.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisenioGestionBiblioteca.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisenioGestionBiblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDPEscritorio;
    private javax.swing.JMenuItem JMICargaBajaDeLibros;
    private javax.swing.JMenuItem JMICargaYBajaUsuarios;
    private javax.swing.JMenuItem JMIListaDeLibros;
    private javax.swing.JMenuItem JMIListaDeUsuarios;
    private javax.swing.JMenuItem JMIModificacionDeUsuarios;
    private javax.swing.JMenuItem JMIModificarLibros;
    private javax.swing.JMenu JMLibros;
    private javax.swing.JMenu JMMultas;
    private javax.swing.JMenu JMPrestamos;
    private javax.swing.JMenu JMSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
