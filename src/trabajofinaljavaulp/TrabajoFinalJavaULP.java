package trabajofinaljavaulp;

import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import trabajofinaljavaulp.datos.AlquilerDatos;
import trabajofinaljavaulp.datos.Conexion;
import trabajofinaljavaulp.datos.InmuebleDatos;
import trabajofinaljavaulp.datos.InquilinoDatos;
import trabajofinaljavaulp.datos.PropietarioDatos;
import trabajofinaljavaulp.entidades.Alquiler;
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

        Propietario p = prop.buscarId(92, true);
        System.out.println(p.toString());
        InmuebleDatos inmD = new InmuebleDatos();

        Inmueble inm = inmD.buscar(61, true);
        System.out.println(inm.toString());

        InquilinoDatos inqD = new InquilinoDatos();

        Inquilino cliente = inqD.buscarDNI(45267765, true);
        System.out.println(cliente.toString());

        Alquiler al;

        Date fechaI = Date.valueOf(LocalDate.of(2022, 06, 05));
        Date fechaF = Date.valueOf(LocalDate.of(2024, 07, 25));
        al = new Alquiler(fechaI, fechaF, 149000.99, "39-1228292-9", "Martinez Jose", 40304040, "Coca Cola", true, inm, cliente);

        AlquilerDatos.agregar(al);
        
        ArrayList<Alquiler> ldalquileres = AlquilerDatos.listar(true);
        for (Alquiler a : ldalquileres) {
            System.out.println(a.toString());
        }

    }
}
