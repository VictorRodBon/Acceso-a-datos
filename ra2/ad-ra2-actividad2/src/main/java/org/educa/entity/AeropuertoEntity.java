package org.educa.entity;

public class AeropuertoEntity {
    private int idAeropuerto;
    private String codIata;
    private String nombre;
    private String ciudad;
    private String pais;
    private int tasaAero;

    // Constructor vacío
    public AeropuertoEntity() {}

    // Constructor con parámetros
    public AeropuertoEntity(int idAeropuerto, String nombre, String ciudad) {
        this.idAeropuerto = idAeropuerto;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getCodIata() {
        return codIata;
    }
    public void setCodIata(String codIata) {
        this.codIata = codIata;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTasaAero() {
        return tasaAero;
    }
    public void setTasaAero(int tasaAero) {
        this.tasaAero = tasaAero;
    }

    public int getIdAeropuerto() { return idAeropuerto; }
    public void setIdAeropuerto(int idAeropuerto) { this.idAeropuerto = idAeropuerto; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    @Override
    public String toString() {
        return "Aeropuerto [id=" + idAeropuerto + ", ciudad=" + ciudad + "]";
    }
}
