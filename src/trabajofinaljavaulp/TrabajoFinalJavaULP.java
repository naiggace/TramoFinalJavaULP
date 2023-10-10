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

//    public static void main(String[] args) {
//
//        Connection con = Conexion.conectar();
//
//        PropietarioDatos prop = new PropietarioDatos();
//
//        Propietario p = prop.buscarId(92, true);
//        System.out.println(p.toString());
//        InmuebleDatos inmD = new InmuebleDatos();
//
//        Inmueble inm = inmD.buscar(61, true);
//        System.out.println(inm.toString());
//
//        InquilinoDatos inqD = new InquilinoDatos();
//
//        Inquilino cliente = inqD.buscarDni(45267765, true);
//        System.out.println(cliente.toString());
//
//        Alquiler al;
//
//        Date fechaI = Date.valueOf(LocalDate.of(2022, 06, 05));
//        Date fechaF = Date.valueOf(LocalDate.of(2024, 07, 25));
//        al = new Alquiler(fechaI, fechaF, 149000.99, "39-1228292-9", "Martinez Jose", 40304040, "Coca Cola", true, inm, cliente);
//
//        AlquilerDatos.agregar(al);
//
//        ArrayList<Alquiler> ldalquileres = AlquilerDatos.listar(true);
//        for (Alquiler a : ldalquileres) {
//            System.out.println(a.toString());
//        }

//// Crear un objeto Propietario con los datos que deseas modificar
//        Propietario propietario = new Propietario();
//        // Configurar los datos que deseas modificar
//        propietario.setId(114);  // ID del propietario que deseas modificar
//        propietario.setDni(1234);
//        propietario.setApellido("Nuevo Apellido");
//        propietario.setNombre("Nuevo Nombre");
//        propietario.setEmail("nuevo@correo.com");
//        propietario.setTelefono(123456789);
//
//        // Crear una instancia de PropietarioDAO
//        PropietarioDatos propietarioDatos = new PropietarioDatos();
//
//        // Llamar al método modificar y pasar el objeto Propietario
//        propietarioDatos.modificar(propietario);
        // Connection con = Conexion.conectar();
        //  PropietarioDatos prop = new PropietarioDatos();
        // Crear un objeto Propietario
        // Propietario propietario = new Propietario(120, 1211, "GOMEZ", "Lucio", "correo@example.com", 123456789);
        // Crear un objeto Inmueble con el propietario
        //Inmueble inmueble = new Inmueble("holanda 21", propietario, "local", 312, 321, true);
        // Crear objetos para acceder a la capa de datos
        //  PropietarioDatos propietarioDatos = new PropietarioDatos();
        // PropietarioDatos.baja(116);
        //PropietarioDatos.agregar(propietario);
        // Agregar el inmueble a la base de datos
        //    Propietario p = prop.buscarId(92, true);
        //   System.out.println(p.toString());
        //  InmuebleDatos inmD = new InmuebleDatos();
        //    Inmueble inm = inmD.buscar(61, true);
        //   System.out.println(inm.toString());
        //  InquilinoDatos inqD = new InquilinoDatos();
        //Inquilino cliente = inqD.buscarDni(45267765, true);
        //System.out.println(cliente.toString());
        //Alquiler al;
        //    Date fechaI = Date.valueOf(LocalDate.of(2022, 06, 05));
        //    Date fechaF = Date.valueOf(LocalDate.of(2024, 07, 25));
        //   al = new Alquiler(fechaI, fechaF, 149000.99, "39-1228292-9", "Martinez Jose", 40304040, "Coca Cola", true, inm, cliente);
        //   AlquilerDatos.agregar(al);
        //   ArrayList<Alquiler> ldalquileres = AlquilerDatos.listar(true);
        //   for (Alquiler a : ldalquileres) {
        //       System.out.println(a.toString());
//    }
}
