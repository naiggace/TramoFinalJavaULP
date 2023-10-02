
package trabajofinaljavaulp.entidades;

import java.util.ArrayList;

/**
 *
 * @author nikan
 */
public class Inquilino {
    private String nombre;
    private String apellido;
    private int dni;
    private int id;
    private ArrayList<Inmueble> propiedades;

    public Inquilino(String nombre, String apellido, int dni, int id, ArrayList<Inmueble> propiedades) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.id = id;
        this.propiedades = propiedades;
    }

    public Inquilino(String nombre, String apellido, int dni, ArrayList<Inmueble> propiedades) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.propiedades = propiedades;
    }

    public Inquilino(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Inquilino() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Inmueble> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(ArrayList<Inmueble> propiedades) {
        this.propiedades = propiedades;
    }

    @Override
    public String toString() {
        return "Inquilino{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
}
