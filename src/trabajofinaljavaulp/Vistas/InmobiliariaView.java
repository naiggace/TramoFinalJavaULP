
package trabajofinaljavaulp.Vistas;

import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import trabajofinaljavaulp.imagen.Fondo;


/**
 *
 * @author Ignacio C.
 */
public class InmobiliariaView extends javax.swing.JFrame {
    public InmobiliariaView() {
        initComponents();
        setLocationRelativeTo(null);
        FondoPantalla();
        cerrar();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jmGestion = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inmobiliaria Grupo 22");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1344, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(136, 30));

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabajofinaljavaulp/Fondo/Gestion.png"))); // NOI18N
        jMenu3.setText("Recursos");

        jmGestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabajofinaljavaulp/Fondo/Gestion2.png"))); // NOI18N
        jmGestion.setText("Gestion de recursos");
        jmGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGestionActionPerformed(evt);
            }
        });
        jMenu3.add(jmGestion);

        jMenuBar1.add(jMenu3);

        jmConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabajofinaljavaulp/Fondo/Alquiler.png"))); // NOI18N
        jmConsultas.setText("Alquileres");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabajofinaljavaulp/Fondo/Alquiler2.png"))); // NOI18N
        jMenuItem1.setText("Gestion de alquileres");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmConsultas.add(jMenuItem1);

        jMenuBar1.add(jmConsultas);

        jmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabajofinaljavaulp/Fondo/Salir.png"))); // NOI18N
        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGestionActionPerformed
        escritorio.repaint();
        GestionView gV = new GestionView();
        gV.setVisible(true);
        escritorio.add(gV);
        escritorio.moveToFront(gV);
    }//GEN-LAST:event_jmGestionActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        escritorio.repaint();
        GestionAlquileresView gAV = new GestionAlquileresView();
        gAV.setVisible(true);
        escritorio.add(gAV);
        escritorio.moveToFront(gAV);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        confirmarSalida();
    }//GEN-LAST:event_jmSalirActionPerformed

  
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
            java.util.logging.Logger.getLogger(InmobiliariaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InmobiliariaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InmobiliariaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InmobiliariaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InmobiliariaView().setVisible(true);
            }
        });
    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenuItem jmGestion;
    private javax.swing.JMenu jmSalir;
    // End of variables declaration//GEN-END:variables

     public void FondoPantalla(){
        Fondo fondo=new Fondo();
             escritorio = new JDesktopPane() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    // Dibuja la imagen de fondo
                    g.drawImage(fondo.getImagen(), 0, 0, getWidth(), getHeight(), this);
                }
            };
        setContentPane(escritorio);
        setVisible(true);
        if (fondo.getImagen() != null) {
            System.out.println("Imagen cargada correctamente.");
        } else {
           System.out.println("Imagen no se pudo cargar.");
        }
    }
    
    public void confirmarSalida(){
        int valor=JOptionPane.showConfirmDialog(this, "¿Está seguro que desea abandonar la aplicación?", 
        /**/                                    "ADVERTENCIA", JOptionPane.YES_NO_OPTION); //YES=0 NO=1
        //                                      this. se refiere a la ventana padre ara el cuadro de diálogo
        if(valor==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this,"Nos vemos en la próxima consulta","Adiós",JOptionPane.CLOSED_OPTION);
            System.exit(0);
        }
    }
    
    public void cerrar(){
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//Configura que hace la X de la ventana (personaliza la X)
        addWindowListener(new WindowAdapter(){ //WindowListener escucha eventos relacionados con la ventana
            //                                   WindowAdapter proporciona una implementación vacía para todos los métodos de la interfaz
            public void windowClosing(WindowEvent e){ //se anula el método WindowClosing de WindowAdapter
                confirmarSalida();                    //código para confirmar la salida
            }
         });
        this.setVisible(true); //Establece la visibilidad de la ventana
    }
}
