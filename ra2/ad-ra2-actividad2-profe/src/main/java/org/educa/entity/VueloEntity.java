package org.educa.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class VueloEntity {
    private Long idVuelo;

    private String numVuelo;

    private AeropuertoEntity origen;

    private AeropuertoEntity destino;

    private AvionEntity avionEntity;

    private LocalDate fecSalida;

    private LocalDate fecLlegada;

    private Integer duracion;

    private BigDecimal costeExtra;

    private String estado;

    private List<TripulacionEntity> tripulacionEntity;

    public List<TripulacionEntity> getTripulacion() {
        return tripulacionEntity;
    }

    public void setTripulacion(List<TripulacionEntity> tripulacionEntity) {
        this.tripulacionEntity = tripulacionEntity;
    }

    public Long getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(Long idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(String numVuelo) {
        this.numVuelo = numVuelo;
    }

    public AeropuertoEntity getOrigen() {
        return origen;
    }

    public void setOrigen(AeropuertoEntity origen) {
        this.origen = origen;
    }

    public AeropuertoEntity getDestino() {
        return destino;
    }

    public void setDestino(AeropuertoEntity destino) {
        this.destino = destino;
    }

    public AvionEntity getAvion() {
        return avionEntity;
    }

    public void setAvion(AvionEntity avionEntity) {
        this.avionEntity = avionEntity;
    }

    public LocalDate getFecSalida() {
        return fecSalida;
    }

    public void setFecSalida(LocalDate fecSalida) {
        this.fecSalida = fecSalida;
    }

    public LocalDate getFecLlegada() {
        return fecLlegada;
    }

    public void setFecLlegada(LocalDate fecLlegada) {
        this.fecLlegada = fecLlegada;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public BigDecimal getCosteExtra() {
        return costeExtra;
    }

    public void setCosteExtra(BigDecimal costeExtra) {
        this.costeExtra = costeExtra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
