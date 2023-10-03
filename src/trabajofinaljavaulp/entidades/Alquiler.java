package trabajofinaljavaulp.entidades;

import java.sql.Date;

public class Alquiler {

    private int id;
    private Date fechaInicio;
    private Date fechaFin;
    private double monto;
    private boolean estado;
    private Inmueble inmueble;
    private Inquilino inquilino;

    public Alquiler() {
    }

    public Alquiler(Date fechaInicio, Date fechaFin, double monto, boolean estado, Inmueble inmueble, Inquilino inquilino) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = monto;
        this.estado = estado;
        this.inmueble = inmueble;
        this.inquilino = inquilino;
    }

    public Alquiler(int id, Date fechaInicio, Date fechaFin, double monto, boolean estado, Inmueble inmueble, Inquilino inquilino) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = monto;
        this.estado = estado;
        this.inmueble = inmueble;
        this.inquilino = inquilino;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
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
        return "Alquiler{" + "idAlquiler=" + id + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", monto=" + monto + ", estado=" + estado + ", inmueble=" + inmueble + ", inquilino=" + inquilino + '}';
    }

}
