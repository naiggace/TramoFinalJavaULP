
package trabajofinaljavaulp.entidades;

import java.util.ArrayList;

/**
 *
 * @author nikan
 */
public class Inquilino {
    private int id;
    private int dni;
    private int cuil;
    private String nombre;
    private String apellido;
    private String direccion;
    private String email;
    private int telefono;
    private boolean estado;
    private ArrayList<Inmueble> propiedades;

    public Inquilino(int id, int dni, String nombre, String apellido, String direccion, String email, int telefono, boolean estado, ArrayList<Inmueble> propiedades) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.estado = estado;
        this.propiedades = propiedades;
    }

    public Inquilino(int dni, String nombre, String apellido, String direccion, String email, int telefono, boolean estado, ArrayList<Inmueble> propiedades) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.estado = estado;
        this.propiedades = propiedades;
    }

    public Inquilino(int id, int dni, String nombre, String apellido, String direccion, String email, int telefono, boolean estado) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Inquilino(int dni, String nombre, String apellido, String direccion, String email, int telefono, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.estado = estado;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    

    @Override
    public String toString() {
<<<<<<< Updated upstream
        return "ID "+id+ " | " + nombre + " | " + apellido + 
                " | dni " + dni +" | Email "+email+" | Telefono "+telefono+ '}';
=======
        return "ID:"+id+ "-" + nombre + "," + apellido + 
                "-dni=" + dni +"-Email= "+email+"-Telefono= "+telefono;
>>>>>>> Stashed changes
    }
}
