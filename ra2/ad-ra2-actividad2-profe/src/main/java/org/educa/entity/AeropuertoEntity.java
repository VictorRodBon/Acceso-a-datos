package org.educa.entity;


import java.math.BigDecimal;

public class AeropuertoEntity {

    private Long id;

    private String codIata;

    private String nombre;

    private String ciudad;

    private String pais;

    private BigDecimal tasaAero;

    public Long getIdAeropuerto() {
        return this.id;
    }

    public void setIdAeropuerto(Long idAeropuerto) {
        this.id = idAeropuerto;
    }

    public String getCodIata() {
        return this.codIata;
    }

    public void setCodIata(String codIata) {
        this.codIata = codIata;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public BigDecimal getTasaAero() {
        return this.tasaAero;
    }

    public void setTasaAero(BigDecimal tasaAero) {
        this.tasaAero = tasaAero;
    }
}
