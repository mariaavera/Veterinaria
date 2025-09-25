package model;

import java.time.LocalDate;

public class Cita {

    private String codigo;
    private LocalDate fecha;
    private double costo;
    private String hora;
    private String motivo;
    private String observaciones;
    private String estado;
    private double duracion;

    public Cita(String codigo, LocalDate fecha, double costo, String hora, String motivo, String observaciones, String estado, double duracion) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.costo = costo;
        this.hora = hora;
        this.motivo = motivo;
        this.observaciones = observaciones;
        this.estado = estado;
        this.duracion = duracion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String toString() {
        return "Código: " + codigo + "\n" +
                "Fecha: " + fecha + "\n" +
                "Hora: " + hora + "\n" +
                "Costo: " + costo + "\n" +
                "Motivo: " + motivo + "\n" +
                "Observaciones: " + observaciones + "\n" +
                "Estado: " + estado + "\n" +
                "Duración: " + duracion + "\n";
    }
}



