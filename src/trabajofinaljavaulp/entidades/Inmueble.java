
package trabajofinaljavaulp.entidades;

/**
 *
 * @author nikan
 */
public class Inmueble {
    private int id;                     // idInmueble
    private String direccion;           // Direccion
    private Propietario propietario;    // obterner con idPropietario
    private String tipo;                // Tipo
    private double superficie;          // Superficie (getDouble)
    private double precio;              // Precio (getDouble)
    public String getIdInmueble;

    public Inmueble(int id, int aInt1, String direccion, String tipo, String superficie, String precio, int aInt2, boolean aBoolean, ArrayList<Inmueble> inmueblesAlquilados) {
        this.id = id;
        this.direccion = direccion;
        this.propietario = propietario;
        this.tipo = tipo;
        this.superficie = superficie;
        this.precio = precio;
    }

    public Inmueble(String direccion, Propietario propietario, String tipo, double superficie, double precio) {
        this.direccion = direccion;
        this.propietario = propietario;
        this.tipo = tipo;
        this.superficie = superficie;
        this.precio = precio;
    }

    public Inmueble() {
    }

    @Override
    public String toString() {
        return "Inmueble{" + "direccion=" + direccion + ", propietario=" + propietario + ", tipo=" + tipo + ", superficie=" + superficie + ", precio=" + precio + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getIdPropietario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setIdInmueble(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
