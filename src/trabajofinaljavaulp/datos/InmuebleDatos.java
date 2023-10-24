package trabajofinaljavaulp.datos;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static trabajofinaljavaulp.datos.PropietarioDatos.buscarId;
import trabajofinaljavaulp.entidades.Inmueble;
import trabajofinaljavaulp.entidades.Propietario;

public class InmuebleDatos {

    private static Connection con = Conexion.conectar();

    /**
     * Guarda un objeto <b>Inmueble</b> en la base de datos.
     *
     * @param inmueble El objeto Materia a guardar.
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
        String sql = "UPDATE inmueble SET estado = 0 WHERE idInmueble = ?";

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
     * @param estado
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
                Propietario propietario = buscarId(idPropietario, PropietarioDatos.existe(idPropietario) == 1);

                // Creo un objeto Inmueble con los valores obtenidos de la base de datos
                inmueble = new Inmueble(id, direccion, propietario, tipo, superficie, precio, estadoInmueble);

            } else {
                JOptionPane.showMessageDialog(null, "No existe el inmueble con el ID: " + idInmueble, "Sin resultados", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'inmueble': " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            return inmueble;
        }
    }

    public static void modificar(Inmueble inmueble) {

        String sql = "UPDATE inmueble SET tipo = ?, direccion = ?, superficie = ?, precio = ?, estado = ? WHERE estado = 1 AND idInmueble = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, inmueble.getTipo());
            ps.setString(2, inmueble.getDireccion());
            ps.setDouble(3, inmueble.getSuperficie());
            ps.setDouble(4, inmueble.getPrecio());
            ps.setBoolean(5, inmueble.isEstado());
            ps.setInt(6, inmueble.getId());

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Modificado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "El inmueble no existe en la base de datos.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Obtener lista de inmuebles de la base de datos con el estado
     * proporcionado
     *
     * @param estado <b>boolean</b> estado de los inmuebles a listar.
     * @return <b>ArrayList</b> con objetos <i>Inmueble</i>
     */
    public static ArrayList<Inmueble> listar(boolean estado) {
        String sql = "SELECT * FROM inmueble WHERE estado = ?";
        ArrayList<Inmueble> inmuebles = new ArrayList();

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setBoolean(1, estado);

            //Ejecutamos y guardamos el resultado.
            ResultSet rs = ps.executeQuery();

            //Añadimos cada elemento del resultado
            while (rs.next()) {
                //Obtenemos el propietario necesario para el inmueble.
                Propietario propietario = PropietarioDatos.buscarId(
                        rs.getInt("idPropietario"), PropietarioDatos.existe(
                        rs.getInt("idPropietario")) == 1 // True si existe y esta activo, sino false.
                );

                //Creamos un objeto Inmueble y lo agregamos a la lista.
                inmuebles.add(new Inmueble(rs.getInt("idInmueble"),
                        rs.getString("direccion"),
                        propietario,
                        rs.getString("tipo"),
                        rs.getDouble("superficie"),
                        rs.getDouble("precio"),
                        rs.getBoolean("estado"))
                );
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'inmueble': " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        return inmuebles;
    }

    /**
     * Dado un ID de <b>Inquilino</b> arma una lista con todos los inmuebles que
     * tiene alquilados
     *
     * @param idInquilino <i>int</i> ID del inquilino en la base de datos
     * @param estado <i>boolean</i> Estado del alquiler. (para listas de
     * inmuebles activos y de inmuebles inactivos).
     * @return <b>ArrayList</b> Con todos los inmuebles que el inquilino tiene
     * alquilados.
     * @see Inquilino
     * @see Inmueble
     */
    public static ArrayList<Inmueble> obtenerInmueblesInquilino(int idInquilino, boolean estado) {
        String sql = "SELECT inmueble.* FROM alquiler "
                + "INNER JOIN inmueble ON inmueble.idInmueble = alquiler.idInmueble "
                + "INNER JOIN inquilino ON inquilino.idInquilino = alquiler.idInquilino "
                + "WHERE inquilino.idInquilino = ? "
                + "AND alquiler.estado = ?;";
        ArrayList<Inmueble> inmuebles = new ArrayList();
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            //LLenamos el PreparedStatement
            ps.setInt(1, idInquilino);
            ps.setBoolean(2, estado);
            //Ejecutamos el PreparedStatement, y guardamos el resultado
            ResultSet rs = ps.executeQuery();
            //Recorremos la lista de resultados agregando cada uno al ArrayList a retornar.
            while (rs.next()) {
                //Buscamos el propietario del inmueble.
                int idProp = rs.getInt("idPropietario");
                Propietario propietario = PropietarioDatos.buscarId(idProp, PropietarioDatos.existe(idProp) == 1);
                inmuebles.add(new Inmueble(rs.getInt("idInmueble"), rs.getString("direccion"), propietario, rs.getString("tipo"), rs.getDouble("superficie"), rs.getDouble("precio"), rs.getBoolean("estado")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error obteniendo lista de alquileres: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return inmuebles;
    }
}
