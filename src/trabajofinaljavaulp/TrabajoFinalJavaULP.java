package trabajofinaljavaulp;

import java.sql.Connection;
import trabajofinaljavaulp.datos.AlquilerDatos;
import trabajofinaljavaulp.datos.Conexion;
import trabajofinaljavaulp.datos.InmuebleDatos;
import trabajofinaljavaulp.datos.InquilinoDatos;
import trabajofinaljavaulp.datos.PropietarioDatos;
import trabajofinaljavaulp.entidades.Inmueble;
import trabajofinaljavaulp.entidades.Inquilino;
import trabajofinaljavaulp.entidades.Propietario;

/**
 *
 * @author naigg
 */
public class TrabajoFinalJavaULP {

    public static void main(String[] args) {


        Connection con = Conexion.conectar();
        
        PropietarioDatos prop = new PropietarioDatos();
        
        Propietario p = prop.buscarId(91,true);
        System.out.println(p.toString());
        InmuebleDatos inmD = new InmuebleDatos();
        
        Inmueble inm = inmD.buscar(60,true);
        System.out.println(inm.toString());
        
        InquilinoDatos inqD = new InquilinoDatos();
        
        Inquilino cliente = inqD.buscarDNI(46497062, true);
        System.out.println(cliente.toString());
        
        AlquilerDatos alq = new AlquilerDatos();
        
        System.out.println(alq.listar(true));
        

    }
}
