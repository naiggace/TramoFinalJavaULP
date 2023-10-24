package trabajofinaljavaulp.Vistas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import trabajofinaljavaulp.datos.AlquilerDatos;
import trabajofinaljavaulp.entidades.Alquiler;

/**
 *
 * @author naigg
 */
public class GestionAlquileresView extends javax.swing.JInternalFrame {

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtfBuscarTodos = new javax.swing.JTextField();
        jbEstado = new javax.swing.JButton();
        jbEliminarAlquiler = new javax.swing.JButton();
        jbNuevoAlquiler = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtTodos = new javax.swing.JTable();
        jbDetalles = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtfBuscarActivos = new javax.swing.JTextField();
        jbDesactivar = new javax.swing.JButton();
        jbEliminarActivo = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtActivos = new javax.swing.JTable();
        jbDetallesActivo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfBuscarNoActivos = new javax.swing.JTextField();
        jbActivar = new javax.swing.JButton();
        jbEliminarNoActivo = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtNoActivos = new javax.swing.JTable();
        jbDetallesNoActivo = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        jLabel4.setText("Buscar:");

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

        jbNuevoAlquiler.setText("Nuevo");

        jtTodos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "IdAlquiler", "IdInquilino", "IdInmueble", "Fecha Inicio", "Fecha Fin", "Estado", "Monto"
            }
        ));
        jScrollPane6.setViewportView(jtTodos);

        jbDetalles.setText("Detalles");
        jbDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDetallesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbNuevoAlquiler)
                            .addComponent(jbEliminarAlquiler)
                            .addComponent(jbEstado)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jbDetalles)))
                .addGap(104, 104, 104))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jtfBuscarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(119, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbNuevoAlquiler)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEliminarAlquiler)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbDetalles)
                        .addGap(188, 188, 188))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(331, 331, 331)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jtfBuscarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(41, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Todos", jPanel1);

        jLabel3.setText("Buscar:");

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

        jtActivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "IdAlquiler", "IdInquilino", "IdInmueble", "Fecha Inicio", "Fecha Fin", "Estado", "Monto"
            }
        ));
        jScrollPane4.setViewportView(jtActivos);

        jbDetallesActivo.setText("Detalles");
        jbDetallesActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDetallesActivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbEliminarActivo)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbDesactivar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbDetallesActivo)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jtfBuscarActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbEliminarActivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbDesactivar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbDetallesActivo)))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(331, 331, 331)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jtfBuscarActivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(41, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Activos", jPanel2);

        jLabel2.setText("Buscar:");

        jbActivar.setText("Activar");
        jbActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActivarActionPerformed(evt);
            }
        });

        jbEliminarNoActivo.setText("Eliminar");
        jbEliminarNoActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarNoActivoActionPerformed(evt);
            }
        });

        jtNoActivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "IdAlquiler", "IdInquilino", "IdInmueble", "Fecha Inicio", "Fecha Fin", "Estado", "Monto"
            }
        ));
        jScrollPane5.setViewportView(jtNoActivos);

        jbDetallesNoActivo.setText("Detalles");
        jbDetallesNoActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDetallesNoActivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbEliminarNoActivo)
                    .addComponent(jbActivar)
                    .addComponent(jbDetallesNoActivo))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jtfBuscarNoActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jbEliminarNoActivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbActivar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbDetallesNoActivo)))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(331, 331, 331)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jtfBuscarNoActivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("No activos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarDetallesAlquiler(int alquilerId) {

        DetallesAlquilerView detallesAlquilerView = new DetallesAlquilerView(alquilerId);
        InmobiliariaView.escritorio.add(detallesAlquilerView);
        detallesAlquilerView.moveToFront();
        detallesAlquilerView.setVisible(true);

    }
    private void jbActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActivarActionPerformed
        int filaSelect = jtNoActivos.getSelectedRow();
        int id = (Integer) jtNoActivos.getValueAt(filaSelect, 0);
        boolean estado = (boolean) jtNoActivos.getValueAt(filaSelect, 5);
        if (estado) {
            AlquilerDatos.baja(id);
        } else {
            AlquilerDatos.alta(id);
        }
        llenarTablas();

    }//GEN-LAST:event_jbActivarActionPerformed

    private void jbDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDetallesActionPerformed
       
    }//GEN-LAST:event_jbDetallesActionPerformed

    private void jbDetallesActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDetallesActivoActionPerformed

    }//GEN-LAST:event_jbDetallesActivoActionPerformed

    private void jbDetallesNoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDetallesNoActivoActionPerformed

    }//GEN-LAST:event_jbDetallesNoActivoActionPerformed

    private void jbEliminarAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarAlquilerActionPerformed
        int filaSeleccionada = jtTodos.getSelectedRow();
        if (filaSeleccionada != -1) {
            int idAlquiler = (int) jtTodos.getValueAt(filaSeleccionada, 0);
            AlquilerDatos.eliminar(idAlquiler);
            // Luego de eliminar el alquiler, puedes actualizar la tabla si es necesario.
            DefaultTableModel modeloTodos = (DefaultTableModel) jtTodos.getModel();
            modeloTodos.removeRow(filaSeleccionada);
            jtTodos.revalidate();
            jtTodos.repaint();
        }
    }//GEN-LAST:event_jbEliminarAlquilerActionPerformed

    private void jbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstadoActionPerformed
        int filaSelect = jtTodos.getSelectedRow();
        int id = (Integer) jtTodos.getValueAt(filaSelect, 0);
        boolean estado = (boolean) jtTodos.getValueAt(filaSelect, 5);
        if (estado) {
            AlquilerDatos.baja(id);
        } else {
            AlquilerDatos.alta(id);
        }
        llenarTablas();

    }//GEN-LAST:event_jbEstadoActionPerformed

    private void jbDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDesactivarActionPerformed
        int filaSelect = jtActivos.getSelectedRow();
        int id = (Integer) jtActivos.getValueAt(filaSelect, 0);
        boolean estado = (boolean) jtActivos.getValueAt(filaSelect, 5);
        if (estado) {
            AlquilerDatos.baja(id);
        } else {
            AlquilerDatos.alta(id);
        }
        llenarTablas();

    }//GEN-LAST:event_jbDesactivarActionPerformed

    private void jbEliminarActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActivoActionPerformed
        int filaSeleccionada = jtTodos.getSelectedRow();
        if (filaSeleccionada != -1) {
            int idAlquiler = (int) jtTodos.getValueAt(filaSeleccionada, 0);
            AlquilerDatos.eliminar(idAlquiler);
            // Luego de eliminar el alquiler, puedes actualizar la tabla si es necesario.
            DefaultTableModel modeloTodos = (DefaultTableModel) jtTodos.getModel();
            modeloTodos.removeRow(filaSeleccionada);
            jtTodos.revalidate();
            jtTodos.repaint();
        }
    }//GEN-LAST:event_jbEliminarActivoActionPerformed

    private void jbEliminarNoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarNoActivoActionPerformed
        int filaSeleccionada = jtTodos.getSelectedRow();
        if (filaSeleccionada != -1) {
            int idAlquiler = (int) jtTodos.getValueAt(filaSeleccionada, 0);
            AlquilerDatos.eliminar(idAlquiler);
            // Luego de eliminar el alquiler, puedes actualizar la tabla si es necesario.
            DefaultTableModel modeloTodos = (DefaultTableModel) jtTodos.getModel();
            modeloTodos.removeRow(filaSeleccionada);
            jtTodos.revalidate();
            jtTodos.repaint();
        }
    }//GEN-LAST:event_jbEliminarNoActivoActionPerformed

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
                alquiler.getInquilino().getId(),
                alquiler.getInmueble().getId(),
                alquiler.getFechaInicio(),
                alquiler.getFechaFin(),
                alquiler.isEstado(),
                alquiler.getMonto()
            };
            modeloTodos.addRow(fila);
        }

        // Llenamos la tabla de alquileres activos
        for (Alquiler alquiler : alquileresActivos) {
            Object[] fila = {
                alquiler.getId(),
                alquiler.getInquilino().getId(),
                alquiler.getInmueble().getId(),
                alquiler.getFechaInicio(),
                alquiler.getFechaFin(),
                alquiler.isEstado(),
                alquiler.getMonto()
            };
            modeloActivos.addRow(fila);
        }

        // Llenamos la tabla de alquileres no activos
        for (Alquiler alquiler : alquileresNoActivos) {
            Object[] fila = {
                alquiler.getId(),
                alquiler.getInquilino().getId(),
                alquiler.getInmueble().getId(),
                alquiler.getFechaInicio(),
                alquiler.getFechaFin(),
                alquiler.isEstado(),
                alquiler.getMonto()
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
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
    private javax.swing.JTable jtActivos;
    private javax.swing.JTable jtNoActivos;
    private javax.swing.JTable jtTodos;
    private javax.swing.JTextField jtfBuscarActivos;
    private javax.swing.JTextField jtfBuscarNoActivos;
    private javax.swing.JTextField jtfBuscarTodos;
    // End of variables declaration//GEN-END:variables
}
