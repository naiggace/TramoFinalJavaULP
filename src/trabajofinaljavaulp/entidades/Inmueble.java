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
    private double precio;
    private boolean estado;

    public Inmueble() {
    }

    public Inmueble(String direccion, String tipo, double superficie, double precio, boolean estado) {
        this.direccion = direccion;
        this.tipo = tipo;
        this.superficie = superficie;
        this.precio = precio;
        this.estado = estado;
    }

    public Inmueble(int id, String direccion, Propietario propietario, String tipo, double superficie, double precio, boolean estado) {
        this.id = id;
        this.direccion = direccion;
        this.propietario = propietario;
        this.tipo = tipo;
        this.superficie = superficie;
        this.precio = precio;
        this.estado = estado;
    }

    public Inmueble(String direccion, Propietario propietario, String tipo, double superficie, double precio, boolean estado) {
        this.direccion = direccion;
        this.propietario = propietario;
        this.tipo = tipo;
        this.superficie = superficie;
        this.precio = precio;
        this.estado = estado;
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
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {

        return "ID "+id+" | "+direccion + " | " + tipo + " | " + superficie + " m2 | $" + precio;

    }

}
