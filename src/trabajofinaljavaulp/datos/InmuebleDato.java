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
 * @author Ignacio C.
 */
public class InmuebleDato {

    private Connection con;

    public InmuebleDato() {
        con = Conexion.conectar();
    }

    /**
     * Guarda un objeto <b>Inmueble</b> en la base de datos.
     *
     * @param Inmueble El objeto Materia a guardar.
     * @see Inmueble
     */
    public void agregarInmueble(Inmueble inmueble) {
        String sql = "INSERT INTO `inmueble`(`Tipo`, `Dirección`, `Superficie`, `Precio`, `Estado`, `idPropietario`) VALUES (?,?,?,?,?,?)";

        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, inmueble.getTipo());
            ps.setString(2, inmueble.getDireccion());
            ps.setDouble(3, inmueble.getSuperficie());
            ps.setDouble(4, inmueble.getPrecio());
            ps.setBoolean(5, inmueble.isEstado());
            ps.setInt(6, inmueble.getIdPropietario());

            // Ejecutamos el comando
            ps.executeUpdate();

            // Recuperamos el id.
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                inmueble.setIdInmueble(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "El inmueble se añadió con exito, ID: " + inmueble.getIdInmueble, "Exito", JOptionPane.INFORMATION_MESSAGE);
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
    public void bajaInmueble(int idInmueble) {
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
    public void altaInmueble(int idInmueble) {
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
    public int estadoInmueble(int idInmueble) {
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

}
