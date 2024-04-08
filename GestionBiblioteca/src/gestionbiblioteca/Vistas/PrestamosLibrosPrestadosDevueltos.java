package gestionbiblioteca.Vistas;

import gestionbiblioteca.AccesoADatos.PrestamosData;
import gestionbiblioteca.Entidades.Prestamos;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;

public class PrestamosLibrosPrestadosDevueltos extends javax.swing.JInternalFrame {

    private Prestamos prestamos = new Prestamos();
    private PrestamosData prestamosD = new PrestamosData();
    private List<Prestamos> listarActivos = prestamosD.ObtenerPrestamosDisponibles();
    private List<Prestamos> listarinactivos = prestamosD.ObtenerPrestamosNODisponibles();

    private DefaultTableModel modelo = new DefaultTableModel();

    public PrestamosLibrosPrestadosDevueltos() {
        initComponents();
        armarCabeceras();
        unirBotones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTLibrosPrestadosDevueltos = new javax.swing.JTable();
        JRBLibrosDevueltos = new javax.swing.JRadioButton();
        JRBLibrosPrestados = new javax.swing.JRadioButton();
        JBSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Libros Prestados - Devueltos");

        JTLibrosPrestadosDevueltos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTLibrosPrestadosDevueltos);

        ButtonGroup.add(JRBLibrosDevueltos);
        JRBLibrosDevueltos.setText("Libros Devueltos");
        JRBLibrosDevueltos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBLibrosDevueltosActionPerformed(evt);
            }
        });

        ButtonGroup.add(JRBLibrosPrestados);
        JRBLibrosPrestados.setText("Libros Prestados");
        JRBLibrosPrestados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBLibrosPrestadosActionPerformed(evt);
            }
        });

        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JRBLibrosPrestados)
                            .addComponent(JRBLibrosDevueltos))
                        .addContainerGap(485, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JBSalir)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 33, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(JRBLibrosPrestados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JRBLibrosDevueltos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(JBSalir)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBSalirActionPerformed

    private void JRBLibrosPrestadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBLibrosPrestadosActionPerformed
        borrarFilasTabla();
        listarActivos = prestamosD.ObtenerPrestamosDisponibles(); // Actualizar lista de Prestamos Disponibles
        for (Prestamos prestamos : listarActivos) {
            modelo.addRow(new Object[]{prestamos.getIdLibroPresta(), prestamos.getIdUsuarioPresta(), prestamos.getIdUnicoDelPrestamo(), prestamos.getFechaDelPrestamo(), prestamos.getFechaDeDevolucion(), prestamos.getEstadoDelPrestamo()});
        }
    }//GEN-LAST:event_JRBLibrosPrestadosActionPerformed

    private void JRBLibrosDevueltosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBLibrosDevueltosActionPerformed
        borrarFilasTabla();
        listarinactivos = prestamosD.ObtenerPrestamosNODisponibles(); // Actualizar lista de Prestamos NO Disponibles
        for (Prestamos prestamos : listarinactivos) {
            modelo.addRow(new Object[]{prestamos.getIdLibroPresta(), prestamos.getIdUsuarioPresta(), prestamos.getIdUnicoDelPrestamo(), prestamos.getFechaDelPrestamo(), prestamos.getFechaDeDevolucion(), prestamos.getEstadoDelPrestamo()});
        }
    }//GEN-LAST:event_JRBLibrosDevueltosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ButtonGroup;
    private javax.swing.JButton JBSalir;
    private javax.swing.JRadioButton JRBLibrosDevueltos;
    private javax.swing.JRadioButton JRBLibrosPrestados;
    private javax.swing.JTable JTLibrosPrestadosDevueltos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void armarCabeceras() {
        modelo.addColumn("ID Unico Del Prestamo. ");
        modelo.addColumn("ID Del Libro Prestado. ");
        modelo.addColumn("ID Del Usuario. ");
        modelo.addColumn("Fecha Del Prestamo. ");
        modelo.addColumn("Fecha De Devolucion. ");
        modelo.addColumn("Estado. ");

        JTLibrosPrestadosDevueltos.setModel(modelo);
    }

    private void unirBotones() {
        ButtonGroup grupoDeBotones = new ButtonGroup();
        grupoDeBotones.add(JRBLibrosDevueltos);
        grupoDeBotones.add(JRBLibrosPrestados);

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
