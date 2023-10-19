
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
       // cerrar();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jmPropietario = new javax.swing.JMenu();
        jmInquilino = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jmGestion = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inmobiliaria Grupo 22");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        jMenu2.setText("Ingresos");

        jmPropietario.setText("Propietarios");
        jmPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPropietarioActionPerformed(evt);
            }
        });
        jMenu2.add(jmPropietario);

        jmInquilino.setText("Inquilinos");
        jmInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmInquilinoActionPerformed(evt);
            }
        });
        jMenu2.add(jmInquilino);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Gestion");

        jmGestion.setText("Recursos");
        jmGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGestionActionPerformed(evt);
            }
        });
        jMenu3.add(jmGestion);

        jMenuBar1.add(jMenu3);

        jmConsultas.setText("Alquileres");

        jMenuItem1.setText("Gestion de alquileres");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmConsultas.add(jMenuItem1);

        jMenuBar1.add(jmConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
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

    private void jmPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPropietarioActionPerformed
        escritorio.repaint();
        PropietarioView pV=new PropietarioView();
        pV.setVisible(true);
        escritorio.add(pV);
        escritorio.moveToFront(pV);
    }//GEN-LAST:event_jmPropietarioActionPerformed

    private void jmInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmInquilinoActionPerformed
        escritorio.repaint();
        InquilinoView iV=new InquilinoView();
        iV.setVisible(true);
        escritorio.add(iV);
        escritorio.moveToFront(iV);
    }//GEN-LAST:event_jmInquilinoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        escritorio.repaint();
        GestionAlquileresView gAV = new GestionAlquileresView();
        gAV.setVisible(true);
        escritorio.add(gAV);
        escritorio.moveToFront(gAV);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

  
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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenuItem jmGestion;
    private javax.swing.JMenu jmInquilino;
    private javax.swing.JMenu jmPropietario;
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
