package trabajofinaljavaulp.entidades;

import java.sql.Date;

public class Alquiler {

    private int idAlquiler;
    private Date fechaInicio;
    private Date fechaFin;
    private double montoAlquiler;
    private boolean estado;
    private Inmueble inmueble;
    private Inquilino inquilino;

    public Alquiler() {
    }

    public Alquiler(Date fechaInicio, Date fechaFin, double montoAlquiler, boolean estado, Inmueble inmueble, Inquilino inquilino) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.montoAlquiler = montoAlquiler;
        this.estado = estado;
        this.inmueble = inmueble;
        this.inquilino = inquilino;
    }

    public Alquiler(int idAlquiler, Date fechaInicio, Date fechaFin, double montoAlquiler, boolean estado, Inmueble inmueble, Inquilino inquilino) {
        this.idAlquiler = idAlquiler;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.montoAlquiler = montoAlquiler;
        this.estado = estado;
        this.inmueble = inmueble;
        this.inquilino = inquilino;
    }

    public int getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getMontoAlquiler() {
        return montoAlquiler;
    }

    public void setMontoAlquiler(double montoAlquiler) {
        this.montoAlquiler = montoAlquiler;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "idAlquiler=" + idAlquiler + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", montoAlquiler=" + montoAlquiler + ", estado=" + estado + ", inmueble=" + inmueble + ", inquilino=" + inquilino + '}';
    }

}
