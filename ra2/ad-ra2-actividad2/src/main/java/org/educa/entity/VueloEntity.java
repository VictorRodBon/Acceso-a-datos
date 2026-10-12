package org.educa.entity;

public class VueloEntity {
    private int idVuelo;
    private String numVuelo;
    private int idOrigen;
    private int idDestino;
    private int idAvion;
    private String fechaSalida;
    private String fechaLlegada;
    private String duracion;

    public VueloEntity(int idVuelo, int idOrigen, int idDestino) {
        this.idVuelo = idVuelo;
        this.idOrigen = idOrigen;
        this.idDestino = idDestino;
    }

    private int idCosteExtra;

    public int getIdVuelo() {
        return idVuelo;
    }
    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getNumVuelo() {
        return numVuelo;
    }
    public void setNumVuelo(String numVuelo) {
        this.numVuelo = numVuelo;
    }

    public int getIdOrigen() {
        return idOrigen;
    }
    public void setIdOrigen(int idOrigen) {
        this.idOrigen = idOrigen;
    }

    public int getIdDestino() {
        return idDestino;
    }
    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
    }

    public int getIdAvion() {
        return idAvion;
    }
    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }
    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }
    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getDuracion() {
        return duracion;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getIdCosteExtra() {
        return idCosteExtra;
    }
    public void setIdCosteExtra(int idCosteExtra) {
        this.idCosteExtra = idCosteExtra;
    }
}
