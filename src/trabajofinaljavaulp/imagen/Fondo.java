
package trabajofinaljavaulp.imagen;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 * @author Ignacio C.
 */
public class Fondo {
     public BufferedImage imagen;
    
    public Fondo(){
        try {
            InputStream iS=getClass().getResourceAsStream("/trabajofinaljavaulp/Fondo/fondo.png");
            if(iS!=null){
                imagen= ImageIO.read(iS);
            }else{
                System.out.println("Recurso imagen no encontrado");
            }
            
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Imagen no encontrada");
        }
    }
    
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height){
        g.drawImage(imagen, (x+(width-imagen.getWidth()/2)), (y+(height-imagen.getHeight()/2)), null);
    }
    public Insets getBorderInsets(Component c){
        return new Insets(0,0,0,0);
    }
    public boolean isBorderOpaque(){
        return false;
    }
    public BufferedImage getImagen() {
        return imagen;
    }
}
