package trabajofinaljavaulp.datos;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static trabajofinaljavaulp.datos.PropietarioDatos.buscarId;
import trabajofinaljavaulp.entidades.Inmueble;
import trabajofinaljavaulp.entidades.Propietario;


public class InmuebleDato {

    private static Connection con;

    public InmuebleDato() {
        con = Conexion.conectar();
    }

    /**
     * Guarda un objeto <b>Inmueble</b> en la base de datos.
     *
     * @param Inmueble El objeto Materia a guardar.
     * @see Inmueble
     */
    public static void agregar(Inmueble inmueble) {
        String sql = "INSERT INTO `inmueble`(`tipo`, `direccion`, `superficie`, `precio`, `estado`, `idPropietario`) VALUES (?,?,?,?,?,?)";

        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, inmueble.getTipo());
            ps.setString(2, inmueble.getDireccion());
            ps.setDouble(3, inmueble.getSuperficie());
            ps.setDouble(4, inmueble.getPrecio());
            ps.setBoolean(5, inmueble.isEstado());
            ps.setInt(6, inmueble.getPropietario().getId()); // Obtener el ID del propietario

            //Ejecutamos el comando
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                inmueble.setId(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "El inmueble se añadió con exito, ID: " + inmueble.getId(), "Exito", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al acceder a la tabla", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * *
     * Baja logica de <b>Inmueble</b>
     *
     * @param idInmueble <b>int</b> id del Inmueble a dar de baja.
     * @see Inmueble
     */
    public static void baja(int idInmueble) {
        // Llenamos el statement
        String sql = "UPDATE inmueble SET estado = 0 WHERE idInquilino = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            //LLenamos el statement
            ps.setInt(1, idInmueble);

            //Ejecutamos el comando
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja al inmueble con id: " + idInmueble, "Exito", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al dar de baja inquilino: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * *
     * Alta logica de <b>Inmueble</b>
     *
     * @param idInmueble <b>int</b> id del Inmueble a dar de alta.
     * @see Inmueble
     */
    public static void alta(int idInmueble) {
        // Llenamos el statement
        String sql = "UPDATE inmueble SET estado = 1 WHERE idInquilino = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            //LLenamos el statement
            ps.setInt(1, idInmueble);

            //Ejecutamos el comando
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Se dio de alta al inmueble con id: " + idInmueble, "Exito", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al dar de alta inquilino: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * *
     * Chequea si el <b>Inmueble</b> existe en la base de datos, asi su estado
     * sea activo o no
     *
     * @param idInmueble <b>int</b> id del Inmueble
     * @return  <b>0</b> si el Inmueble no existe en la base de datos.<br>
     * <b>1</b> si el Inmueble existe en la base de datos y esta activo<br>
     * <b>2</b> si el Inmueble existe en la base de datos y <i>no</i> esta
     * activo
     * @see Inmueble
     */
    public static int estado(int idInmueble) {
        String sql = "SELECT estado FROM inmueble WHERE idInmueble = ?";
        int resultado = 0; // Se asume que el Inmueble no existe, si sigue igual al final es por que la hipotesis es correcta.

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idInmueble);

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

    /**
     * *
     * Regresa de la base de datos el objeto <b>Inmueble</b> correspondiente al
     * id proporcionado.
     *
     * @param idInmueble id de Inmueble en la base de datos (<b>idInmueble</b>).
     * @return el objeto correspondiente al id.
     * @see Inmueble
     */
    public static Inmueble buscar(int idInmueble, boolean estado) {
        Inmueble inmueble = null;
        String sql = "SELECT `idInmueble`, `tipo`, `direccion`, `superficie`, `precio`, `estado`, `idPropietario` FROM `inmueble` WHERE idInmueble = ? AND estado = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idInmueble);
            ps.setBoolean(2, estado);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                // valores de las columnas de la consulta
                int id = rs.getInt("idInmueble");
                String tipo = rs.getString("tipo");
                String direccion = rs.getString("direccion");
                double superficie = rs.getDouble("superficie");
                double precio = rs.getDouble("precio");
                boolean estadoInmueble = rs.getBoolean("estado");
                int idPropietario = rs.getInt("idPropietario");

                // Busco el objeto Propietario correspondiente al ID del propietario
                Propietario propietario = buscarId(idPropietario, estado);

                // Creo un objeto Inmueble con los valores obtenidos de la base de datos
                inmueble = new Inmueble(id, direccion, propietario, tipo, superficie, precio, estado);

            } else {
                JOptionPane.showMessageDialog(null, "No existe el inmueble con el ID: " + idInmueble, "Sin resultados", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'inmueble': " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            return inmueble;
        }
    }
    
    /**
     * Obtener lista de inmuebles de la base de datos con el estado proporcionado
     * @param estado <b>boolean</b> estado de los inmuebles a listar.
     * @return <b>ArrayList</b> con objetos <i>Inmueble</i>
     */
    public static ArrayList<Inmueble> listar(boolean estado) {
        //TODO
        return new ArrayList<Inmueble>();
    }
}
