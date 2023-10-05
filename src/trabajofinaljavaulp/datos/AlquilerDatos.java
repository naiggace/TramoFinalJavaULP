package trabajofinaljavaulp.datos;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import trabajofinaljavaulp.entidades.Alquiler;
import trabajofinaljavaulp.entidades.Inmueble;
import trabajofinaljavaulp.entidades.Inquilino;


public class AlquilerDatos {
    private static Connection con = Conexion.conectar();
    
    /**
     * Agregar <b>Alquiler</b> a la base de datos
     * 
     * @param a <i>Alquiler</i> a agregar.
     * @see Alqulier
     */
    public static void agregar(Alquiler a) {
    
    }
    
    /**
     * Regresa un resultado dependiendo de si el <b>Alquiler</b> existe.
     * 
     * @param id <i>int</i> el Id a chequear.
     * @return  <b>0</b> El Alquiler no existe en la base de datos.
     *          <b>1</b> El Alquiler existe y esta activo.
     *          <b>2</b> El Alquiler existe y no esta activo.
     */
    public static int existe(int id) {
        String sql = "SELECT estado FROM alquiler WHERE idAlquiler = ?";
        int existe = 0;
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            
            //Ejecutamos el PreparedStatement y guardamos el resultado.
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) { //El Alquiler con ese id existe.
                if (rs.getInt("estado") == 1) { //Está activo
                    existe = 1;
                } else { //Está inactivo
                    existe = 2;
                }
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a alquiler: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return existe;
    }
    
    /**
     * Da de baja un <b>Alquiler</b>.
     * @param id <i>int</i> correspondiente al idAlquiler.
     */
    public static void baja(int id) {
    
    }
    
    /**
     * Da de alta un <b>Alquiler</b>.
     * @param id <i>int</i> correspondiente al idAlquiler.
     */
    public static void alta(int id) {
    
    }
    
    /**
     * Regresa el <b>Alquiler</b> con el idAlquiler correspondiente.<br>
     * No nos interesa el estado.
     * 
     * @param id <i>int</i> corresponde a idAlquiler.
     * @return <b>Alquiler</b>
     * @see Alquiler
     */
    public static Alquiler buscarId(int id) {
        return new Alquiler();
    }
    
    /**
     * Listar todos los alquileres con el correspondiente estado
     * 
     * @param estado <i>boolean</i> Estado de los alquileres.
     * @return <b>ArrayList</b> Con alquileres.
     * @see Alquiler
     */
    public static ArrayList<Alquiler> listar(boolean estado) {
        String sql = "SELECT * FROM alquileres WHERE estado = ?";
        ArrayList<Alquiler> alquileres = new ArrayList();
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setBoolean(1, estado);
            
            //Ejecutamos el PreparedStatment y guardamos el resultado en un ResultSet.
            ResultSet rs = ps.executeQuery();
            
            //Recorremos el ResultSet guardando los resultados en el ArrayList alquileres
            while (rs.next()) {
                // Encontramos el Inmueble
                int id = rs.getInt("idInmueble");
                Inmueble inmueble = InmuebleDatos.buscar(rs.getInt(id), 
                        InmuebleDatos.estado(id) == 1
                );
                
                // Encontramos el Inquilino
                id = rs.getInt("idInquilino");
                Inquilino inquilino = InquilinoDatos.buscarID(id, 
                        InquilinoDatos.existe(id) == 1
                );
                
                //Agregamos el alquiler a la lista
                alquileres.add(new Alquiler(
                        rs.getInt("idAlquiler"), 
                        rs.getDate("fechaInicio"), 
                        rs.getDate("fechaFin"), 
                        rs.getDouble("monto"), 
                        rs.getString("cuitInquilino"), 
                        rs.getString("nombreGarante"), 
                        rs.getInt("dniGarante"), 
                        rs.getString("lugarTrabajo"), 
                        rs.getBoolean("estado"), 
                        inmueble, 
                        inquilino)
                );
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar alquileres: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return alquileres;
    }
    
}
