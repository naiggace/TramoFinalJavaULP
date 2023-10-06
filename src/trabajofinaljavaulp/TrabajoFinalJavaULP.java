package trabajofinaljavaulp;

import java.sql.Connection;
import trabajofinaljavaulp.datos.Conexion;
import trabajofinaljavaulp.datos.InmuebleDatos;
import trabajofinaljavaulp.datos.PropietarioDatos;
import trabajofinaljavaulp.entidades.Inmueble;
import trabajofinaljavaulp.entidades.Propietario;

/**
 *
 * @author naigg
 */
public class TrabajoFinalJavaULP {

    public static void main(String[] args) {

        Connection con = Conexion.conectar();
         //Crear un objeto Propietario
        Propietario propietario = new Propietario(2302949, "Apellido", "Nombre", "correo@example.com", 123456789);
         //Crear un objeto Inmueble con el propietario
        Inmueble inmueble = new Inmueble("holanda 21", propietario, "local", 312, 321, true);
         //Crear objetos para acceder a la capa de datos
        PropietarioDatos propietarioDatos = new PropietarioDatos();
        InmuebleDatos inmuebleDato = new InmuebleDatos();
        PropietarioDatos.agregar(propietario);
         //Agregar el inmueble a la base de datos
        InmuebleDatos.agregar(inmueble);
    }
}
