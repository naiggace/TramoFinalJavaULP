
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
import trabajofinaljavaulp.datos.InmuebleDatos;
import trabajofinaljavaulp.datos.InquilinoDatos;
import trabajofinaljavaulp.datos.PropietarioDatos;
import trabajofinaljavaulp.entidades.Inmueble;
import trabajofinaljavaulp.entidades.Inquilino;
import trabajofinaljavaulp.entidades.Propietario;

/**
 *
 * @author nikan
 */
public class GestionView extends javax.swing.JInternalFrame implements InternalFrameListener {

    private TableRowSorter<TableModel> sorterInmuebles;
    private TableRowSorter<TableModel> sorterPropietarios;
    private TableRowSorter<TableModel> sorterInquilinos;
    
    /**
     * Creates new form InmuebleView_t
     */
    public GestionView() {
        initComponents();
        llenarTablas();
        activarFiltros();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jbNuevoInmueble = new javax.swing.JButton();
        jbEliminarInmueble = new javax.swing.JButton();
        jbEditarInmuebles = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInmuebles = new javax.swing.JTable();
        jlBuscar = new javax.swing.JLabel();
        jtfBuscarInmueble = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jbNuevoPropietario = new javax.swing.JButton();
        jbEditarPropietario = new javax.swing.JButton();
        jbEliminarPropietario = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtPropietarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtfBuscarPropietario = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jbNuevoInquilino = new javax.swing.JButton();
        jbEditarInquilino = new javax.swing.JButton();
        jbEliminarInquilino = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtInquilinos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtfBuscarInquilino = new javax.swing.JTextField();
        jlGestion = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setMinimumSize(new java.awt.Dimension(600, 400));

        jbNuevoInmueble.setText("Nuevo");
        jbNuevoInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoInmuebleActionPerformed(evt);
            }
        });

        jbEliminarInmueble.setText("Eliminar");
        jbEliminarInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarInmuebleActionPerformed(evt);
            }
        });

        jbEditarInmuebles.setText("Editar");
        jbEditarInmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarInmueblesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbNuevoInmueble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbEditarInmuebles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbEliminarInmueble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNuevoInmueble)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEditarInmuebles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEliminarInmueble)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        jtInmuebles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Dirección", "Superficie", "Precio", "Propietario", "id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtInmuebles.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtInmuebles);
        if (jtInmuebles.getColumnModel().getColumnCount() > 0) {
            jtInmuebles.getColumnModel().getColumn(5).setMinWidth(0);
            jtInmuebles.getColumnModel().getColumn(5).setPreferredWidth(0);
            jtInmuebles.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        jlBuscar.setText("Buscar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfBuscarInmueble))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlBuscar)
                            .addComponent(jtfBuscarInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Inmuebles", jPanel1);

        jbNuevoPropietario.setText("Nuevo");
        jbNuevoPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoPropietarioActionPerformed(evt);
            }
        });

        jbEditarPropietario.setText("Editar");
        jbEditarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarPropietarioActionPerformed(evt);
            }
        });

        jbEliminarPropietario.setText("Eliminar");
        jbEliminarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarPropietarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbNuevoPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbEditarPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbEliminarPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNuevoPropietario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEditarPropietario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEliminarPropietario)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        jtPropietarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Apellido", "Nombre", "Email", "Teléfono", "id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPropietarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jtPropietarios);
        if (jtPropietarios.getColumnModel().getColumnCount() > 0) {
            jtPropietarios.getColumnModel().getColumn(5).setMinWidth(0);
            jtPropietarios.getColumnModel().getColumn(5).setPreferredWidth(0);
            jtPropietarios.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        jLabel1.setText("Buscar:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfBuscarPropietario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtfBuscarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Propietarios", jPanel3);

        jbNuevoInquilino.setText("Nuevo");
        jbNuevoInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoInquilinoActionPerformed(evt);
            }
        });

        jbEditarInquilino.setText("Editar");
        jbEditarInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarInquilinoActionPerformed(evt);
            }
        });

        jbEliminarInquilino.setText("Eliminar");
        jbEliminarInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarInquilinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbNuevoInquilino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbEditarInquilino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbEliminarInquilino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNuevoInquilino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEditarInquilino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEliminarInquilino)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        jtInquilinos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Apellido", "Nombre", "Direccion", "Email", "Telefono", "id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtInquilinos.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jtInquilinos);
        if (jtInquilinos.getColumnModel().getColumnCount() > 0) {
            jtInquilinos.getColumnModel().getColumn(6).setMinWidth(0);
            jtInquilinos.getColumnModel().getColumn(6).setPreferredWidth(0);
            jtInquilinos.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        jLabel2.setText("Buscar:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfBuscarInquilino)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfBuscarInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Inquilinos", jPanel4);

        jlGestion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlGestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlGestion.setText("Gestión");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
                    .addComponent(jlGestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlGestion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoInmuebleActionPerformed
        InmuebleView iV = new InmuebleView();
        InmobiliariaView.escritorio.add(iV);
        iV.moveToFront();
        iV.setVisible(true);
        iV.addInternalFrameListener(this);
    }//GEN-LAST:event_jbNuevoInmuebleActionPerformed

    private void jbNuevoPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoPropietarioActionPerformed
        PropietarioView pV = new PropietarioView();
        InmobiliariaView.escritorio.add(pV);
        pV.moveToFront();
        pV.setVisible(true);
        pV.addInternalFrameListener(this);
    }//GEN-LAST:event_jbNuevoPropietarioActionPerformed

    private void jbNuevoInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoInquilinoActionPerformed
        InquilinoView iV = new InquilinoView();
        InmobiliariaView.escritorio.add(iV);
        iV.moveToFront();
        iV.setVisible(true);
        iV.addInternalFrameListener(this);
    }//GEN-LAST:event_jbNuevoInquilinoActionPerformed

    private void jbEditarInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarInquilinoActionPerformed
        try {
            InquilinoView iV = new InquilinoView((Integer) jtInquilinos.getValueAt(jtInquilinos.getSelectedRow(), 6));
            InmobiliariaView.escritorio.add(iV);
            iV.moveToFront();
            iV.setVisible(true);
            iV.addInternalFrameListener(this);
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this,"No ha seleccionado inquilino","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jbEditarInquilinoActionPerformed

    private void jbEditarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarPropietarioActionPerformed
        try {
            PropietarioView pV = new PropietarioView((Integer) jtPropietarios.getValueAt(jtPropietarios.getSelectedRow(), 5));
            InmobiliariaView.escritorio.add(pV);
            pV.moveToFront();
            pV.setVisible(true);
            pV.addInternalFrameListener(this);
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this,"No ha seleccionado propietario","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jbEditarPropietarioActionPerformed

    private void jbEditarInmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarInmueblesActionPerformed
        try {
            InmuebleView iV = new InmuebleView((Integer) jtInmuebles.getValueAt(jtInmuebles.getSelectedRow(), 5));
            InmobiliariaView.escritorio.add(iV);
            iV.moveToFront();
            iV.setVisible(true);
            iV.addInternalFrameListener(this);
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this,"No ha seleccionado inmueble","Error",JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbEditarInmueblesActionPerformed

    private void jbEliminarInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarInmuebleActionPerformed
        try {
            int item=(Integer) jtInmuebles.getValueAt(jtInmuebles.getSelectedRow(), 5);
            InmuebleDatos.baja(item);
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado inmueble","Error", JOptionPane.ERROR_MESSAGE);
        }
        llenarTablas();
    }//GEN-LAST:event_jbEliminarInmuebleActionPerformed

    private void jbEliminarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarPropietarioActionPerformed
          try {
            int item=(Integer) jtPropietarios.getValueAt(jtPropietarios.getSelectedRow(), 5);
            PropietarioDatos.baja(item);
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado propietario","Error", JOptionPane.ERROR_MESSAGE);
        }
        llenarTablas();
    }//GEN-LAST:event_jbEliminarPropietarioActionPerformed

    private void jbEliminarInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarInquilinoActionPerformed
          try {
            int item=(Integer) jtInquilinos.getValueAt(jtInquilinos.getSelectedRow(), 6);
            InquilinoDatos.baja(item);
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado inquilino","Error", JOptionPane.ERROR_MESSAGE);
        }
        llenarTablas();
    }//GEN-LAST:event_jbEliminarInquilinoActionPerformed

    private void llenarTablas() {
        // Obtenemos los modelos.
        DefaultTableModel modeloInmuebles = (DefaultTableModel) jtInmuebles.getModel();
        DefaultTableModel modeloPropietarios = (DefaultTableModel) jtPropietarios.getModel();
        DefaultTableModel modeloInquilinos = (DefaultTableModel) jtInquilinos.getModel();
        
        // Listamos los objetos
        ArrayList<Inmueble> inmuebles = InmuebleDatos.listar(true);
        ArrayList<Propietario> propietarios = PropietarioDatos.listar(true);
        ArrayList<Inquilino> inquilinos = InquilinoDatos.listar(true);
        
        //Vaciamos las tablas, esto va a ser util si alguna vez necesitamos refrescar las tablas
        modeloInmuebles.setRowCount(0);
        modeloPropietarios.setRowCount(0);
        modeloInquilinos.setRowCount(0);
        
        // Ingresamos los objetos a las tablas.
        for (Inmueble i : inmuebles) {
            modeloInmuebles.addRow(new Object[]{i.getTipo(), i.getDireccion(), i.getSuperficie(), i.getPrecio(), i.getPropietario(), i.getId()});
        }
        for (Propietario p : propietarios) {
            modeloPropietarios.addRow(new Object[]{p.getDni(), p.getApellido(), p.getNombre(), p.getEmail(), p.getTelefono(), p.getId()});
        }
        for (Inquilino i : inquilinos) {
            modeloInquilinos.addRow(new Object[]{i.getDni(), i.getApellido(), i.getNombre(), i.getDireccion(), i.getEmail(), i.getTelefono(), i.getId()});
        }
    }
    
    private void activarFiltros() {
        //Creamos sorters basados en los modelos
        this.sorterInmuebles = new TableRowSorter<>(jtInmuebles.getModel());
        this.sorterPropietarios = new TableRowSorter<>(jtPropietarios.getModel());
        this.sorterInquilinos = new TableRowSorter<>(jtInquilinos.getModel());
        
        //Aplicamos los sorters a las tablas
        jtInmuebles.setRowSorter(sorterInmuebles);
        jtPropietarios.setRowSorter(sorterPropietarios);
        jtInquilinos.setRowSorter(sorterInquilinos);
        
        //Hacemos un arreglo de arreglos que contienen los textfields buscar y los sorters.
        Object[] sortersyfiltros = new Object[] {
            new Object[] { jtfBuscarInmueble, sorterInmuebles },
            new Object[] { jtfBuscarInquilino, sorterInquilinos },
            new Object[] { jtfBuscarPropietario, sorterPropietarios }
        };
        
        for (Object o : sortersyfiltros)  { 
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbEditarInmuebles;
    private javax.swing.JButton jbEditarInquilino;
    private javax.swing.JButton jbEditarPropietario;
    private javax.swing.JButton jbEliminarInmueble;
    private javax.swing.JButton jbEliminarInquilino;
    private javax.swing.JButton jbEliminarPropietario;
    private javax.swing.JButton jbNuevoInmueble;
    private javax.swing.JButton jbNuevoInquilino;
    private javax.swing.JButton jbNuevoPropietario;
    private javax.swing.JLabel jlBuscar;
    private javax.swing.JLabel jlGestion;
    private javax.swing.JTable jtInmuebles;
    private javax.swing.JTable jtInquilinos;
    private javax.swing.JTable jtPropietarios;
    private javax.swing.JTextField jtfBuscarInmueble;
    private javax.swing.JTextField jtfBuscarInquilino;
    private javax.swing.JTextField jtfBuscarPropietario;
    // End of variables declaration//GEN-END:variables

   @Override
    public void internalFrameClosed(InternalFrameEvent e) {
        System.out.println("Actualizando tablas...");
        llenarTablas();
    }

    // <editor-fold defaultstate="collapsed" desc="internal frame unused events"> 
    @Override
    public void internalFrameOpened(InternalFrameEvent e) {}

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {}

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {}

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {}

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {}

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {}
    // </editor-fold>  
}
