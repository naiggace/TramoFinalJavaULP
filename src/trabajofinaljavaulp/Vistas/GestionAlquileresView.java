package trabajofinaljavaulp.Vistas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import trabajofinaljavaulp.datos.AlquilerDatos;
import trabajofinaljavaulp.entidades.Alquiler;

/**
 *
 * @author naigg
 */
public class GestionAlquileresView extends javax.swing.JInternalFrame implements InternalFrameListener {

    /**
     * Creates new form GestionAlquileresView
     */
    private TableRowSorter<TableModel> sorterTodos;
    private TableRowSorter<TableModel> sorterActivos;
    private TableRowSorter<TableModel> sorterNoActivos;

    public GestionAlquileresView() {
        initComponents();
        llenarTablas();
        activarFiltros();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtTodos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jbNuevoAlquiler = new javax.swing.JButton();
        jbDetalles = new javax.swing.JButton();
        jbEstado = new javax.swing.JButton();
        jbEliminarAlquiler = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jtfBuscarTodos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtActivos = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jbDetallesActivo = new javax.swing.JButton();
        jbDesactivar = new javax.swing.JButton();
        jbEliminarActivo = new javax.swing.JButton();
        jbNuevoAlquiler1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtfBuscarActivos = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtNoActivos = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jbActivar = new javax.swing.JButton();
        jbDetallesNoActivo = new javax.swing.JButton();
        jbEliminarNoActivo = new javax.swing.JButton();
        jbNuevoAlquiler2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfBuscarNoActivos = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setMinimumSize(new java.awt.Dimension(870, 36));

        jtTodos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nro. Contrato", "Inquilino", "Propietario", "Tipo", "Domicilio", "Fecha Inicio", "Fecha Fin", "Monto", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTodos.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(jtTodos);

        jbNuevoAlquiler.setText("Nuevo");
        jbNuevoAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoAlquilerActionPerformed(evt);
            }
        });

        jbDetalles.setText("Detalles");
        jbDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDetallesActionPerformed(evt);
            }
        });

        jbEstado.setText("Activar/Desactivar");
        jbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEstadoActionPerformed(evt);
            }
        });

        jbEliminarAlquiler.setText("Eliminar");
        jbEliminarAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarAlquilerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbNuevoAlquiler, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbEliminarAlquiler, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbDetalles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNuevoAlquiler)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEliminarAlquiler)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbDetalles)
                .addContainerGap(306, Short.MAX_VALUE))
        );

        jLabel4.setText("Buscar:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfBuscarTodos)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfBuscarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Todos", jPanel1);

        jtActivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nro. Contrato", "Inquilino", "Propietario", "Tipo", "Domicilio", "Fecha Inicio", "Fecha Fin", "Monto", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtActivos.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(jtActivos);

        jPanel6.setPreferredSize(new java.awt.Dimension(138, 93));

        jbDetallesActivo.setText("Detalles");
        jbDetallesActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDetallesActivoActionPerformed(evt);
            }
        });

        jbDesactivar.setText("Desactivar");
        jbDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDesactivarActionPerformed(evt);
            }
        });

        jbEliminarActivo.setText("Eliminar");
        jbEliminarActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActivoActionPerformed(evt);
            }
        });

        jbNuevoAlquiler1.setText("Nuevo");
        jbNuevoAlquiler1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoAlquiler1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbEliminarActivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbDesactivar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(jbDetallesActivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbNuevoAlquiler1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNuevoAlquiler1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEliminarActivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbDesactivar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbDetallesActivo)
                .addContainerGap(306, Short.MAX_VALUE))
        );

        jLabel3.setText("Buscar:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfBuscarActivos)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfBuscarActivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Activos", jPanel2);

        jtNoActivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nro. Contrato", "Inquilino", "Propietario", "Tipo", "Domicilio", "Fecha Inicio", "Fecha Fin", "Monto", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtNoActivos.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(jtNoActivos);

        jPanel8.setPreferredSize(new java.awt.Dimension(138, 93));

        jbActivar.setText("Activar");
        jbActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActivarActionPerformed(evt);
            }
        });

        jbDetallesNoActivo.setText("Detalles");
        jbDetallesNoActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDetallesNoActivoActionPerformed(evt);
            }
        });

        jbEliminarNoActivo.setText("Eliminar");
        jbEliminarNoActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarNoActivoActionPerformed(evt);
            }
        });

        jbNuevoAlquiler2.setText("Nuevo");
        jbNuevoAlquiler2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoAlquiler2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbEliminarNoActivo, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(jbActivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbDetallesNoActivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbNuevoAlquiler2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNuevoAlquiler2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEliminarNoActivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbActivar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbDetallesNoActivo)
                .addContainerGap(306, Short.MAX_VALUE))
        );

        jLabel2.setText("Buscar:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfBuscarNoActivos)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfBuscarNoActivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("No activos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarDetallesAlquiler(int alquilerId) {

        DetallesAlquilerView detallesAlquilerView = new DetallesAlquilerView(alquilerId);
        InmobiliariaView.escritorio.add(detallesAlquilerView);
        detallesAlquilerView.moveToFront();
        detallesAlquilerView.setVisible(true);
        detallesAlquilerView.addInternalFrameListener(this);

    }

    private void vistaAlquilerNuevo() {
        NuevoAlquilerView vista = new NuevoAlquilerView();
        InmobiliariaView.escritorio.add(vista);
        vista.moveToFront();
        vista.setVisible(true);
        vista.addInternalFrameListener(this);
    }
    private void jbActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActivarActionPerformed
        try {
            int filaSelect = jtNoActivos.getSelectedRow();
            int id = (Integer) jtNoActivos.getValueAt(filaSelect, 0);
            boolean estado = (boolean) jtNoActivos.getValueAt(filaSelect, 8);
            if (estado) {
                AlquilerDatos.baja(id);
            } else {
                AlquilerDatos.alta(id);
            }
            llenarTablas();
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Seleccione un alquiler para cambiar su estado", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbActivarActionPerformed

    private void jbDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDetallesActionPerformed
        try {
            mostrarDetallesAlquiler((Integer) jtTodos.getValueAt(jtTodos.getSelectedRow(), 0));
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Seleccione un alquiler para ver detalles", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbDetallesActionPerformed

    private void jbDetallesActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDetallesActivoActionPerformed
        try {
            mostrarDetallesAlquiler((Integer) jtActivos.getValueAt(jtActivos.getSelectedRow(), 0));
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Seleccione un alquiler para ver detalles", "Error", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jbDetallesActivoActionPerformed
    }
    private void jbDetallesNoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDetallesNoActivoActionPerformed
        try {
            mostrarDetallesAlquiler((Integer) jtNoActivos.getValueAt(jtNoActivos.getSelectedRow(), 0));
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Seleccione un alquiler para ver detalles", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbDetallesNoActivoActionPerformed

    private void jbEliminarAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarAlquilerActionPerformed
        int filaSeleccionada = jtTodos.getSelectedRow();
        if (filaSeleccionada != -1) {
            int idAlquiler = (int) jtTodos.getValueAt(filaSeleccionada, 0);
            try {
                AlquilerDatos.eliminar(idAlquiler);
                // Luego de eliminar el alquiler, puedes actualizar la tabla si es necesario.
                DefaultTableModel modeloTodos = (DefaultTableModel) jtTodos.getModel();
                modeloTodos.removeRow(filaSeleccionada);
                jtTodos.revalidate();
                jtTodos.repaint();
            } catch (Exception e) {
                // Mostrar un mensaje de advertencia si ocurre un error durante la eliminación del alquiler
                JOptionPane.showMessageDialog(this, "Error al eliminar el alquiler: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Mostrar un mensaje de advertencia si no se ha seleccionado ningún alquiler
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un alquiler para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbEliminarAlquilerActionPerformed

    private void jbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstadoActionPerformed
        try {
            int filaSelect = jtTodos.getSelectedRow();
            int id = (Integer) jtTodos.getValueAt(filaSelect, 0);
            boolean estado = (boolean) jtTodos.getValueAt(filaSelect, 8);
            if (estado) {
                AlquilerDatos.baja(id);
            } else {
                AlquilerDatos.alta(id);
            }
            llenarTablas();
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Seleccione un alquiler para cambiar su estado", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbEstadoActionPerformed

    private void jbDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDesactivarActionPerformed
        try {
            int filaSelect = jtActivos.getSelectedRow();
            int id = (Integer) jtActivos.getValueAt(filaSelect, 0);
            boolean estado = (boolean) jtActivos.getValueAt(filaSelect, 8);
            if (estado) {
                AlquilerDatos.baja(id);
            } else {
                AlquilerDatos.alta(id);
            }
            llenarTablas();
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Seleccione un alquiler para cambiar su estado", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbDesactivarActionPerformed

    private void jbEliminarActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActivoActionPerformed
        int filaSeleccionada = jtActivos.getSelectedRow();
        if (filaSeleccionada != -1) {
            int idAlquiler = (int) jtActivos.getValueAt(filaSeleccionada, 0);
            try {
                AlquilerDatos.eliminar(idAlquiler);
                // Luego de eliminar el alquiler, puedes actualizar la tabla si es necesario.
                DefaultTableModel modeloTodos = (DefaultTableModel) jtActivos.getModel();
                modeloTodos.removeRow(filaSeleccionada);
                jtActivos.revalidate();
                jtActivos.repaint();
            } catch (Exception e) {
                // Mostrar un mensaje de advertencia si ocurre un error durante la eliminación del alquiler
                JOptionPane.showMessageDialog(this, "Error al eliminar el alquiler: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Mostrar un mensaje de advertencia si no se ha seleccionado ningún alquiler
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un alquiler para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jbEliminarActivoActionPerformed

    private void jbEliminarNoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarNoActivoActionPerformed
        int filaSeleccionada = jtNoActivos.getSelectedRow();
        if (filaSeleccionada != -1) {
            int idAlquiler = (int) jtNoActivos.getValueAt(filaSeleccionada, 0);
            try {
                AlquilerDatos.eliminar(idAlquiler);
                // Luego de eliminar el alquiler, puedes actualizar la tabla si es necesario.
                DefaultTableModel modeloTodos = (DefaultTableModel) jtNoActivos.getModel();
                modeloTodos.removeRow(filaSeleccionada);
                jtNoActivos.revalidate();
                jtNoActivos.repaint();
            } catch (Exception e) {
                // Mostrar un mensaje de advertencia si ocurre un error durante la eliminación del alquiler
                JOptionPane.showMessageDialog(this, "Error al eliminar el alquiler: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Mostrar un mensaje de advertencia si no se ha seleccionado ningún alquiler
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un alquiler para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }  
    }//GEN-LAST:event_jbEliminarNoActivoActionPerformed

    private void jbNuevoAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoAlquilerActionPerformed
        vistaAlquilerNuevo();
    }//GEN-LAST:event_jbNuevoAlquilerActionPerformed

    private void jbNuevoAlquiler1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoAlquiler1ActionPerformed
        vistaAlquilerNuevo();
    }//GEN-LAST:event_jbNuevoAlquiler1ActionPerformed

    private void jbNuevoAlquiler2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoAlquiler2ActionPerformed
        vistaAlquilerNuevo();
    }//GEN-LAST:event_jbNuevoAlquiler2ActionPerformed

    private void llenarTablas() {
        // Obtenemos los modelos.
        DefaultTableModel modeloTodos = (DefaultTableModel) jtTodos.getModel();
        DefaultTableModel modeloActivos = (DefaultTableModel) jtActivos.getModel();
        DefaultTableModel modeloNoActivos = (DefaultTableModel) jtNoActivos.getModel();

        // Listamos los objetos
        ArrayList<Alquiler> alquileres = AlquilerDatos.listar(true);
        alquileres.addAll(AlquilerDatos.listar(false)); //Añadir los inactivos a la lista general
        ArrayList<Alquiler> alquileresActivos = AlquilerDatos.listar(true);
        ArrayList<Alquiler> alquileresNoActivos = AlquilerDatos.listar(false);

        // LimpiO las tablas, esto va a ser util si alguna vez necesitamos refrescar las tablas
        modeloTodos.setRowCount(0);
        modeloActivos.setRowCount(0);
        modeloNoActivos.setRowCount(0);

        // Ingresamos los objetos a las tablas.
        // Llenamos la tabla de TODOS los alquileres activos y no activos
        for (Alquiler alquiler : alquileres) {
            Object[] fila = {
                alquiler.getId(),
                alquiler.getInquilino().toString(),
                alquiler.getInmueble().getPropietario().toString(),
                alquiler.getInmueble().getTipo(),
                alquiler.getInmueble().getDireccion(),
                alquiler.getFechaInicio(),
                alquiler.getFechaFin(),
                alquiler.getMonto(),
                alquiler.isEstado()
            };
            modeloTodos.addRow(fila);
        }

        // Llenamos la tabla de alquileres activos
        for (Alquiler alquiler : alquileresActivos) {
            Object[] fila = {
                alquiler.getId(),
                alquiler.getInquilino().toString(),
                alquiler.getInmueble().getPropietario().toString(),
                alquiler.getInmueble().getTipo(),
                alquiler.getInmueble().getDireccion(),
                alquiler.getFechaInicio(),
                alquiler.getFechaFin(),
                alquiler.getMonto(),
                alquiler.isEstado()
            };
            modeloActivos.addRow(fila);
        }

        // Llenamos la tabla de alquileres no activos
        for (Alquiler alquiler : alquileresNoActivos) {
            Object[] fila = {
                alquiler.getId(),
                alquiler.getInquilino().toString(),
                alquiler.getInmueble().getPropietario().toString(),
                alquiler.getInmueble().getTipo(),
                alquiler.getInmueble().getDireccion(),
                alquiler.getFechaInicio(),
                alquiler.getFechaFin(),
                alquiler.getMonto(),
                alquiler.isEstado()
            };
            modeloNoActivos.addRow(fila);
        }
    }

    private void activarFiltros() {
        //Creamos sorters basados en los modelos
        this.sorterTodos = new TableRowSorter<>(jtTodos.getModel());
        this.sorterActivos = new TableRowSorter<>(jtActivos.getModel());
        this.sorterNoActivos = new TableRowSorter<>(jtNoActivos.getModel());

        //Aplicamos los sorters a las tablas
        jtTodos.setRowSorter(sorterTodos);
        jtActivos.setRowSorter(sorterActivos);
        jtNoActivos.setRowSorter(sorterNoActivos);

        //Hacemos un arreglo de arreglos que contienen los textfields buscar y los sorters.
        Object[] sortersyfiltros = new Object[]{
            new Object[]{jtfBuscarTodos, sorterTodos},
            new Object[]{jtfBuscarActivos, sorterActivos},
            new Object[]{jtfBuscarNoActivos, sorterNoActivos}
        };

        for (Object o : sortersyfiltros) {
            // Cada objeto es un array que contiene un textfield y un sorter,
            // Extraemos los objetos del array
            JTextField jtf = (JTextField) Array.get(o, 0);
            TableRowSorter trs = (TableRowSorter) Array.get(o, 1);

            jtf.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    String busqueda = jtf.getText();

                    if (busqueda.trim().isEmpty()) {
                        trs.setRowFilter(null);
                    } else {
                        trs.setRowFilter(RowFilter.regexFilter("(?i)" + busqueda)); // el (?i) lo hace case insensitive.
                    }
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    String busqueda = jtf.getText();

                    if (busqueda.trim().isEmpty()) {
                        trs.setRowFilter(null);
                    } else {
                        trs.setRowFilter(RowFilter.regexFilter("(?i)" + busqueda)); // el (?i) lo hace case insensitive.
                    }
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    throw new UnsupportedOperationException("¡Algo salió mal!");
                }
            });
        }
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
        System.out.println("Actualizando tablas...");
        llenarTablas();
    }

    // <editor-fold defaultstate="collapsed" desc="internal frame unused events"> 
    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {
    }
    // </editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbActivar;
    private javax.swing.JButton jbDesactivar;
    private javax.swing.JButton jbDetalles;
    private javax.swing.JButton jbDetallesActivo;
    private javax.swing.JButton jbDetallesNoActivo;
    private javax.swing.JButton jbEliminarActivo;
    private javax.swing.JButton jbEliminarAlquiler;
    private javax.swing.JButton jbEliminarNoActivo;
    private javax.swing.JButton jbEstado;
    private javax.swing.JButton jbNuevoAlquiler;
    private javax.swing.JButton jbNuevoAlquiler1;
    private javax.swing.JButton jbNuevoAlquiler2;
    private javax.swing.JTable jtActivos;
    private javax.swing.JTable jtNoActivos;
    private javax.swing.JTable jtTodos;
    private javax.swing.JTextField jtfBuscarActivos;
    private javax.swing.JTextField jtfBuscarNoActivos;
    private javax.swing.JTextField jtfBuscarTodos;
    // End of variables declaration//GEN-END:variables
}
