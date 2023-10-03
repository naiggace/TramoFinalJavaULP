
package trabajofinaljavaulp.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import trabajofinaljavaulp.entidades.Inmueble;
import trabajofinaljavaulp.entidades.Inquilino;

/**
 *
 * @author nikan
 */
public class InquilinoDatos {
    
    private static Connection con = Conexion.conectar();
    
    /***
     * Chequea si el <b>Inquilino</b> existe en la base de datos, asi su estado sea activo o no
     * @param i <b>int</b> id del inquilino
     * @return  <b>0</b> si el inquilino no existe en la base de datos.<br>
     *          <b>1</b> si el inquilino existe en la base de datos y esta activo<br>
     *          <b>2</b> si el inquilino existe en la base de datos y <i>no</i> esta activo
     * @see Inquilino
     */
    public int existe(int i) {
        String sql = "SELECT estado FROM inquilino WHERE idInquilino = ?";
        int resultado = 0; // Se asume que el inquilino no existe, si sigue igual al final es por que la hipotesis es correcta.
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, i);
            
            //Recibimos los resultados
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                // Si hay rs.next(), significa que hay un resultado, por lo tanto existe en la base de datos
                if (rs.getInt("estado") == 1) {
                    resultado = 1; // El inquilino existe y esta activo.
                } else {
                    resultado = 2; // El inquilino existe y no esta activo.
                }
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a inquilino: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return resultado;
    }
    
    /***
     * Agregar <b>Inquilino</b> a la base de datos
     * @param i objeto <b>Inquilino</b> a agregar a la base de datos
     * @see Inquilino
     */
    public void agregar(Inquilino i) {
        String sql = "INSERT INTO inquilino (dni,apellido,nombre,direccion,telefono,email,estado) VALUES (?,?,?,?,?,?,1)";
        
        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            //LLenamos el statement
            ps.setInt(1, i.getDni());
            ps.setString(2, i.getApellido());
            ps.setString(3, i.getNombre());
            ps.setString(4, i.getDireccion());
            ps.setInt(5, i.getTelefono());
            ps.setString(6, i.getEmail());
            
            //Ejecutamos el comando
            ps.executeUpdate();
            
            //Recuperamos el id
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                i.setId(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inquilino añadido con exito, ID: " + i.getId(), "Exito", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al añadir inquilino: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /***
     * Baja logica de <b>Inquilino</b>
     * @param i <b>int</b> id del inquilino a dar de baja.
     * @see Inquilino
     */
    public void baja(int i) {
        String sql = "UPDATE inquilino SET estado = 0 WHERE idInquilino = ?";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            //LLenamos el statement
            ps.setInt(1, i);
            
            //Ejecutamos el comando
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja al inquilino con id: " + i, "Exito", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al dar de baja inquilino: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /***
     * Alta logica de <b>Inquilino</b>, para los inquilinos que han sido dados de baja en el pasado.
     * @param i <b>int</b> id del <i>Inquilino</i> a dar de alta.
     * @see Inquilino
     */
    public void alta(int i) {
        String sql = "UPDATE inquilino SET estado = 1 WHERE idInquilino = ?";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            //LLenamos el statement
            ps.setInt(1, i);
            
            //Ejecutamos el comando
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Se dio de alta al inquilino con id: " + i, "Exito", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al dar de alta inquilino: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /***
     * Buscar <b>Inquilino</b> en la base de datos a partir de su ID.
     * @param id <b>int</b> id del <b>Inquilino</b> a buscar.
     * @param estado <b>boolean</b> estado de alta del inquilino a buscar.
     * @return  <b>Inquilino</b>
     *          <b>null</b> si no hay resultado.
     * @see Inquilino
     */
    public Inquilino buscarID(int id, boolean estado) {
        String sql = "SELECT * FROM inquilino WHERE idInqilino = ? AND estado = ?";
        Inquilino inquilino = null;
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            //Llenamos el statement
            ps.setInt(1, id);
            ps.setBoolean(2, estado);
            
            //Ejecutamos el comando y guardamos el resultado
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) { // Si hay resultado
                ArrayList<Inmueble> inmueblesAlquilados = AlquilerDato.obtenerInmueblesInquilino(id);
                inquilino = new Inquilino(
                        rs.getInt("idInquilino"),
                        rs.getInt("dni"), 
                        rs.getString("nombre"), 
                        rs.getString("apellido"), 
                        rs.getString("direccion"), 
                        rs.getString("email"), 
                        rs.getInt("telefono"), 
                        rs.getBoolean("estado"), 
                        inmueblesAlquilados);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el inquilino con el ID: " + id + " y estado: " + estado, "Sin resultados", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar inquilino: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return inquilino;
    }
    
    /***
     * Buscar <b>Inquilino</b> en la base de datos a partir de su DNI.
     * @param dni <b>int</b> dni del <b>Inquilino</b> a buscar.
     * @param estado <b>boolean</b> estado de alta del inquilino a buscar.
     * @return  <b>Inquilino</b>
     *          <b>null</b> si no hay resultado.
     * @see Inquilino
     */
    public Inquilino buscarDNI(int dni, boolean estado) {
        String sql = "SELECT * FROM inquilino WHERE dni = ? AND estado = ?";
        Inquilino inquilino = null;
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            //Llenamos el statement
            ps.setInt(1, dni);
            ps.setBoolean(2, estado);
            
            //Ejecutamos el comando y guardamos el resultado
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) { // Si hay resultado
                ArrayList<Inmueble> inmueblesAlquilados = AlquilerDato.obtenerInmueblesInquilino(rs.getInt("idInquilino"));
                inquilino = new Inquilino(
                        rs.getInt("idInquilino"),
                        rs.getInt("dni"), 
                        rs.getString("nombre"), 
                        rs.getString("apellido"), 
                        rs.getString("direccion"), 
                        rs.getString("email"), 
                        rs.getInt("telefono"), 
                        rs.getBoolean("estado"), 
                        inmueblesAlquilados);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el inquilino con el DNI: " + dni + " y estado: " + estado, "Sin resultados", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar inquilino: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return inquilino;
    }
    
    /***
     * Cambia el <b>Inquilino</b> correspondiente en la base de datos.
     * @param i <b>Inquilino</b> a modificar en la base de datos.
     */
    public void modificarDatos(Inquilino i) {
        String sql = "UPDATE inquilino SET apellido = ?, nombre = ?, direccion = ?, telefono = ?, email = ? WHERE idInquilino = ?";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            //LLenamos el statement
            ps.setString(1, i.getApellido());
            ps.setString(2, i.getNombre());
            ps.setString(3, i.getDireccion());
            ps.setInt(4, i.getTelefono());
            ps.setString(5,i.getEmail());
            ps.setInt(6, i.getId());
            
            //Ejecutamos el statement
            if (ps.executeUpdate() == 1) { // Devuelve 1 si el update hizo cambios.
                JOptionPane.showMessageDialog(null, String.format("El inquilino con ID: %d y DNI: %d ha sido modificado con exito.", i.getId(), i.getDni()),"Exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "El inquilino no se encontro en la base de datos.", "Inquilino no encontrado", JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar inquilino: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
