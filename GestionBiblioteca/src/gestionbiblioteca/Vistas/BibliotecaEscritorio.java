package gestionbiblioteca.Vistas;

public class BibliotecaEscritorio extends javax.swing.JFrame {

    public BibliotecaEscritorio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDPEscritorio = new javax.swing.JDesktopPane();
        Fondito = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMICargaYBajaUsuarios = new javax.swing.JMenuItem();
        JMIModificacionDeUsuarios = new javax.swing.JMenuItem();
        JMIListaDeUsuarios = new javax.swing.JMenuItem();
        JMLibros = new javax.swing.JMenu();
        JMIListaDeLibros = new javax.swing.JMenuItem();
        JMIModificarLibros = new javax.swing.JMenuItem();
        JMICargaBajaDeLibros = new javax.swing.JMenuItem();
        JMMultas = new javax.swing.JMenu();
        JMIUsuariosQueAdeudan = new javax.swing.JMenuItem();
        JMPrestamos = new javax.swing.JMenu();
        JMILibrosPrestadosDevueltos = new javax.swing.JMenuItem();
        JMSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionbiblioteca/Imagenes/tango y pluma.jpg"))); // NOI18N

        JDPEscritorio.setLayer(Fondito, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout JDPEscritorioLayout = new javax.swing.GroupLayout(JDPEscritorio);
        JDPEscritorio.setLayout(JDPEscritorioLayout);
        JDPEscritorioLayout.setHorizontalGroup(
            JDPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondito, javax.swing.GroupLayout.PREFERRED_SIZE, 845, Short.MAX_VALUE)
        );
        JDPEscritorioLayout.setVerticalGroup(
            JDPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondito, javax.swing.GroupLayout.PREFERRED_SIZE, 745, Short.MAX_VALUE)
        );

        jMenuBar1.setMaximumSize(new java.awt.Dimension(295, 32768));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(295, 23));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(295, 23));

        jMenu1.setText("Usuarios");

        JMICargaYBajaUsuarios.setText("Carga de Usuarios");
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

        JMIListaDeUsuarios.setText("Lista de Usuarios");
        JMIListaDeUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIListaDeUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(JMIListaDeUsuarios);

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

        JMICargaBajaDeLibros.setText("Carga de Libros");
        JMICargaBajaDeLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICargaBajaDeLibrosActionPerformed(evt);
            }
        });
        JMLibros.add(JMICargaBajaDeLibros);

        jMenuBar1.add(JMLibros);

        JMMultas.setText("Multas");

        JMIUsuariosQueAdeudan.setText("Usuarios Que Adeudan");
        JMIUsuariosQueAdeudan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIUsuariosQueAdeudanActionPerformed(evt);
            }
        });
        JMMultas.add(JMIUsuariosQueAdeudan);

        jMenuBar1.add(JMMultas);

        JMPrestamos.setText("Prestamos");

        JMILibrosPrestadosDevueltos.setText("Libros Prestados / Devueltos");
        JMILibrosPrestadosDevueltos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMILibrosPrestadosDevueltosActionPerformed(evt);
            }
        });
        JMPrestamos.add(JMILibrosPrestadosDevueltos);

        jMenuBar1.add(JMPrestamos);

        JMSalir.setText("Salir");
        JMSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMSalirMouseClicked(evt);
            }
        });
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

    private void JMICargaYBajaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICargaYBajaUsuariosActionPerformed
        UsuariosCargaDeUsuarios cbe = new UsuariosCargaDeUsuarios();
        JDPEscritorio.add(cbe);
        cbe.setVisible(true);
    }//GEN-LAST:event_JMICargaYBajaUsuariosActionPerformed

    private void JMIModificacionDeUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIModificacionDeUsuariosActionPerformed
        UsuarioModificacionDeUsuarios umu = new UsuarioModificacionDeUsuarios();
        JDPEscritorio.add(umu);
        umu.setVisible(true);
    }//GEN-LAST:event_JMIModificacionDeUsuariosActionPerformed

    private void JMIListaDeUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIListaDeUsuariosActionPerformed
        UsuarioListaDeUsuarios ulu = new UsuarioListaDeUsuarios();
        JDPEscritorio.add(ulu);
        ulu.setVisible(true);
    }//GEN-LAST:event_JMIListaDeUsuariosActionPerformed

    private void JMIListaDeLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIListaDeLibrosActionPerformed
       LibrosListaDeLibrosCargados ldlc = new LibrosListaDeLibrosCargados();
        JDPEscritorio.add(ldlc);
        ldlc.setVisible(true);
    }//GEN-LAST:event_JMIListaDeLibrosActionPerformed

    private void JMIModificarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIModificarLibrosActionPerformed
        LibrosModificarLibrosCargados mlc = new LibrosModificarLibrosCargados();
        JDPEscritorio.add(mlc);
        mlc.setVisible(true);
    }//GEN-LAST:event_JMIModificarLibrosActionPerformed

    private void JMICargaBajaDeLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICargaBajaDeLibrosActionPerformed
        LibrosCargaDeLibros cdl = new LibrosCargaDeLibros();
        JDPEscritorio.add(cdl);
        cdl.setVisible(true);
    }//GEN-LAST:event_JMICargaBajaDeLibrosActionPerformed

    private void JMIUsuariosQueAdeudanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIUsuariosQueAdeudanActionPerformed
        MultasUsuariosQueAdeudan mucd = new MultasUsuariosQueAdeudan();
        JDPEscritorio.add(mucd);
        mucd.setVisible(true);
    }//GEN-LAST:event_JMIUsuariosQueAdeudanActionPerformed

    private void JMILibrosPrestadosDevueltosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMILibrosPrestadosDevueltosActionPerformed
        PrestamosLibrosPrestadosDevueltos plpd = new PrestamosLibrosPrestadosDevueltos();
        JDPEscritorio.add(plpd);
        plpd.setVisible(true);
    }//GEN-LAST:event_JMILibrosPrestadosDevueltosActionPerformed
//pa salir
    private void JMSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_JMSalirMouseClicked

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
            java.util.logging.Logger.getLogger(BibliotecaEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BibliotecaEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BibliotecaEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BibliotecaEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BibliotecaEscritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondito;
    private javax.swing.JDesktopPane JDPEscritorio;
    private javax.swing.JMenuItem JMICargaBajaDeLibros;
    private javax.swing.JMenuItem JMICargaYBajaUsuarios;
    private javax.swing.JMenuItem JMILibrosPrestadosDevueltos;
    private javax.swing.JMenuItem JMIListaDeLibros;
    private javax.swing.JMenuItem JMIListaDeUsuarios;
    private javax.swing.JMenuItem JMIModificacionDeUsuarios;
    private javax.swing.JMenuItem JMIModificarLibros;
    private javax.swing.JMenuItem JMIUsuariosQueAdeudan;
    private javax.swing.JMenu JMLibros;
    private javax.swing.JMenu JMMultas;
    private javax.swing.JMenu JMPrestamos;
    private javax.swing.JMenu JMSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
