
package trabajofinaljavaulp.imagen;

/**
 * @author Ignacio C.
 */
public class Imagen {

    public static void main(String[] args) {
        Fondo fot=new Fondo();
         if (fot.getImagen() != null) {
            System.out.println("Imagen cargada correctamente.");
        } else {
            System.out.println("Error al cargar la imagen.");
        }
    }

}
