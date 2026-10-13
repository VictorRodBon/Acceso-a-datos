package org.educa.entity;

import java.util.List;

public class ModeloAvionEntity {

    private Long idModelo;

    private String codModelo;

    private String fabricante;

    private Integer capacidad;

    private List<TripulacionEntity> tripulacionEntityHabilitada;

    public List<TripulacionEntity> getTripulacionHabilitada() {
        return tripulacionEntityHabilitada;
    }

    public void setTripulacionHabilitada(List<TripulacionEntity> tripulacionEntityHabilitada) {
        this.tripulacionEntityHabilitada = tripulacionEntityHabilitada;
    }

    public Long getIdModelo() {
        return this.idModelo;
    }

    public void setIdModelo(Long idModelo) {
        this.idModelo = idModelo;
    }

    public String getCodModelo() {
        return this.codModelo;
    }

    public void setCodModelo(String codModelo) {
        this.codModelo = codModelo;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Integer getCapacidad() {
        return this.capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
}
