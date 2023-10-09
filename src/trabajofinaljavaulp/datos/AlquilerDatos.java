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
        String sql = "INSERT INTO `alquiler`(`idAlquiler`, `idInquilino`, `idInmueble`, `cuitInquilino`, `lugarTrabajo`, `nombreGarante`,"
                + " `dniGarante`, `fechaInicio`, `fechaFin`, `estado`, `montoAlquiler`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, a.getId());
            ps.setInt(2, a.getInquilino().getId());
            ps.setInt(3, a.getInmueble().getId());
            ps.setString(4, a.getCuit());
            ps.setString(5, a.getLugarTrabajo());
            ps.setString(6, a.getNombreGarante());
            ps.setInt(7, a.getDniGarante());
            ps.setDate(8, a.getFechaInicio());
            ps.setDate(9, a.getFechaFin());
            ps.setBoolean(10, a.isEstado());
            ps.setDouble(11, a.getMonto());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                a.setId(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alquiler añadido con exito, ID: " + a.getId(), "Exito", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar alquiler: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     * Regresa un resultado dependiendo de si el <b>Alquiler</b> existe.
     *
     * @param id <i>int</i> el Id a chequear.
     * @return  <b>0</b> El Alquiler no existe en la base de datos.<br>
     * <b>1</b> El Alquiler existe y esta activo.<br>
     * <b>2</b> El Alquiler existe y no esta activo.
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
     *
     * @param id <i>int</i> correspondiente al idAlquiler.
     */
    public static void baja(int id) {
        String sql = "UPDATE alquiler SET estado = 0 WHERE idAlquiler= ?";
        try(PreparedStatement ps = con.prepareStatement(sql)){
            ps.setInt(1, id);
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Se ha dado de baja al alquiler", "Baja", JOptionPane.INFORMATION_MESSAGE);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alquiler" + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Da de alta un <b>Alquiler</b>.
     *
     * @param id <i>int</i> correspondiente al idAlquiler.
     */
    public static void alta(int id) {
        String sql = "UPDATE alquiler SET estado = 1 WHERE idAlquiler= ?";
        try(PreparedStatement ps = con.prepareStatement(sql)){
            ps.setInt(1, id);
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Se ha dado de alta al alquiler", "Alta", JOptionPane.INFORMATION_MESSAGE);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alquiler" + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
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
        //TODO
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
        String sql = "SELECT * FROM alquiler WHERE estado = ?";
        ArrayList<Alquiler> alquileres = new ArrayList();

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setBoolean(1, estado);

            //Ejecutamos el PreparedStatment y guardamos el resultado en un ResultSet.
            ResultSet rs = ps.executeQuery();

            //Recorremos el ResultSet guardando los resultados en el ArrayList alquileres
            while (rs.next()) {
                // Encontramos el Inmueble
                int id = rs.getInt("idInmueble");
                Inmueble inmueble = InmuebleDatos.buscar(id,
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
                        rs.getDouble("montoAlquiler"),
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
