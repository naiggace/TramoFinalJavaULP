
package trabajofinaljavaulp.entidades;

import java.util.ArrayList;

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

    public Inmueble(int id, String direccion, Propietario propietario, String tipo, double superficie, double precio, String getIdInmueble) {
        this.id = id;
        this.direccion = direccion;
        this.propietario = propietario;
        this.tipo = tipo;
        this.superficie = superficie;
        this.precio = precio;
        this.getIdInmueble = getIdInmueble;
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

    public String getGetIdInmueble() {
        return getIdInmueble;
    }

    public void setGetIdInmueble(String getIdInmueble) {
        this.getIdInmueble = getIdInmueble;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "id=" + id + ", direccion=" + direccion + ", propietario=" + propietario + ", tipo=" + tipo + ", superficie=" + superficie + ", precio=" + precio + ", getIdInmueble=" + getIdInmueble + '}';
    }

}
