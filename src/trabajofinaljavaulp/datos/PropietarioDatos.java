package trabajofinaljavaulp.datos;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import trabajofinaljavaulp.entidades.Propietario;

public class PropietarioDatos {

    private static Connection con = Conexion.conectar();

    /**
     * Revisa si existe el Propietario con el ID proporcionado.
     * @param id <b>int</b> correspondiente a idPropietario en la base de datos.
     * @return  <b>0</b> Si no existe el <i>Propietario</i> correspondiente al ID proporcionado en la base de datos.<br>
     *          <b>1</b> Si existe <i>Propietario</i> correspondiente al ID proporcionado y su estado es <i>activo.</i><br>
     *          <b>2</b> Si existe <i>Propietario</i> correspondiente al ID proporcionado y su estado es <i>inactivo</i>.
     */
    public static int existe(int id) {
        String sql = "SELECT estado FROM propietario WHERE idPropietario = ?";
        int resultado = 0; //Ponemos 0 por defecto, si se encuentra algo se modificará.
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            
            //Ejecutamos el comando y guardamos el resultado
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                //Si hay next() significa que hay resultado y el propietario existe en la base de datos.
                if (rs.getInt("estado") == 1) { //Esta activo
                    resultado = 1;
                } else { // Existe, pero no esta activo.
                    resultado = 2;
                }
            }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error a acceder a propietario: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return resultado;
    }
    
    /**
     * Da baja logica al propietario correspondiente al ID proporcionado.
     * @param id <b>int</b> correspondiente al idPropietario en la base de datos.
     */
    public static void baja(int id) {
        String sql = "UPDATE propietario SET estado = 0 WHERE idPropietario = ?";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            
            //Ejecutamos y chequeamos exito.
            if (ps.executeUpdate() == 1) { //Si todo salio bien, solo una fila fue afectada.
                JOptionPane.showMessageDialog(null, String.format("El propietario con ID: %d ha sido dado de baja", id), "Éxito", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al dar de baja propietario: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Da alta logica al propietario correspondiente al ID proporcionado.
     * @param id <b>int</b> correspondiente al idPropietario en la base de datos.
     */
    public static void alta(int id) {
        String sql = "UPDATE propietario SET estado = 1 WHERE idPropietario = ?";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            
            //Ejecutamos y chequeamos exito.
            if (ps.executeUpdate() == 1) { //Si todo salio bien, solo una fila fue afectada.
                JOptionPane.showMessageDialog(null, String.format("El propietario con ID: %d ha sido dado de alta", id), "Éxito", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al dar de alta propietario: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Añadir <b>Propietario</b> a la base de datos.
     *
     * @param p <b>Propietario</b> a añadir
     * @see Propietario
     */
    public static void agregar(Propietario p) {
        String sql = "INSERT INTO propietario (apellido, nombre, dni, estado, telefono, email) VALUES (?,?,?,1,?,?)";

        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            //LLenamos el statement.
            ps.setString(1, p.getApellido());
            ps.setString(2, p.getNombre());
            ps.setInt(3, p.getDni());
            ps.setInt(4, p.getTelefono());
            ps.setString(5, p.getEmail());

            //Ejecutamos el comando
            ps.executeUpdate();

            //Guardamos el resultset que contiene el ID asignado
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {    //Si el resultset contiene algo, hubo exito.
                p.setId(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "El propietario se añadió con éxito, ID: " + p.getId(), "Éxito", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar propietario: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Buscar un <b>Propietario</b> por ID en la base de datos.
     *
     * @param id <b>int</b> ID correspondiente al propietario en la base de datos
     * @param estado <b>boolean</b> Estado del propietario a buscar en la base de datos.
     * @return  <b>Propietario</b> con los datos correspondientes al ID.<br>
     *          <b>null</b> si no se encuentra resultado en la base de datos.
     * @see Propietario
     */
    public static Propietario buscarId(int id, boolean estado) {
        String sql = "SELECT * FROM propietario WHERE idPropietario = ? AND estado = ?";
        Propietario p = null;

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            //LLenamos el PreparedStatement.
            ps.setInt(1, id);
            ps.setBoolean(2, estado);

            //Ejecutamos el statement y guardamos el resultado.
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {    // Si hubo resultado, sera true.
                p = new Propietario( // Creamos un objeto propietario con los datos recibidos.
                        rs.getInt("idPropietario"),
                        rs.getInt("dni"),
                        rs.getString("apellido"),
                        rs.getString("nombre"),
                        rs.getString("email"),
                        rs.getInt("telefono")
                );
            } else {    // No hubo resultado.
                JOptionPane.showMessageDialog(null, "No existe el Propietario con ID: " + id + " y estado: " + estado, "Propietario no encontrado.", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar propietario: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return p;
    }

    /**
     * Buscar un <b>Propietario</b> por DNI en la base de datos.
     *
     * @param dni <b>int</b> DNI correspondiente al <i>Propietario</i> en la base de datos.
     * @param estado <b>boolean</b> Estado del propietario a buscar en la base de datos.
     * @return  <b>Propietario</b> con los datos correspondientes.<br>
     *          <b>null</b> si no se encuentra resultado en la base de datos.
     * @see Propietario
     */
    public static Propietario buscarDni(int dni, boolean estado) {
        String sql = "SELECT * FROM propietario WHERE dni = ? AND estado = ?";
        Propietario p = null;

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            //LLenamos el PreparedStatement.
            ps.setInt(1, dni);
            ps.setBoolean(2, estado);

            //Ejecutamos el statement y guardamos el resultado.
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {    // Si hubo resultado, sera true.
                p = new Propietario( // Creamos un objeto propietario con los datos recibidos.
                        rs.getInt("idPropietario"),
                        rs.getInt("dni"),
                        rs.getString("apellido"),
                        rs.getString("nombre"),
                        rs.getString("email"),
                        rs.getInt("telefono")
                );
            } else {    // No hubo resultado.
                JOptionPane.showMessageDialog(null, "No existe el Propietario con DNI: " + dni + " y estado: " + estado, "Propietario no encontrado.", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar propietario: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return p;
    }

    /**
     * Modificar un <b>Propietario</b> que ya existe en la base de datos.
     *
     * @param p <b>Propietario</b> a modificar.
     * @see Propietario
     */
    public static void modificar(Propietario p) {
        String sql = "UPDATE propietario SET apellido = ?, nombre = ?, telefono = ?, email = ? WHERE idPropietario = ?";
    
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            //LLenamos el PreparedStatement.
            ps.setString(1, p.getApellido());
            ps.setString(2, p.getNombre());
            ps.setInt(3, p.getTelefono());
            ps.setString(4, p.getEmail());
            
            //Ejecutamos el comando y chequeamos exito.
            if (ps.executeUpdate() == 1) { //Si salio todo bien, deberia solo haberse modificado 1 fila.
                JOptionPane.showMessageDialog(null, String.format("El propietario con ID: %d y DNI: %d ha sido modificado con éxito.", p.getId(), p.getDni()),"Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "El propietario no se encontro en la base de datos.", "Propietario no encontrado", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar propietario: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Lista todos los propietarios de la base de datos con el estado indicado.
     * @param estado <b>boolean</b> el estado de los propietarios a buscar
     * @return <b>ArrayList</b> con todos los propietarios en la base de datos.
     */
    public static ArrayList<Propietario> listar(boolean estado) {
        String sql = "SELECT * FROM propietarios WHERE estado = ?";
        ArrayList<Propietario> propietarios = new ArrayList();
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setBoolean(1, estado);
            
            //Ejecutamos y guardamos el resultado.
            ResultSet rs = ps.executeQuery();
            
            //Recorremos todo el resultset
            while (rs.next()) {
                //Añadimos cada propietario del resultado a la lista
                propietarios.add(new Propietario(
                        rs.getInt("idPropietario"), 
                        rs.getInt("dni"), 
                        rs.getString("apellido"), 
                        rs.getString("nombre"), 
                        rs.getString("Email"), 
                        rs.getInt("telefono"))
                );
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar propietarios: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return propietarios;
    }
}
