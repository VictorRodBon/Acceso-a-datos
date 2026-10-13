package org.educa.entity;


public class AsientoEntity {
    private Long idAsiento;

    private AvionEntity avionEntity;

    private String codAsiento;

    private String clase;

    public Long getIdAsiento() {
        return this.idAsiento;
    }

    public void setIdAsiento(Long idAsiento) {
        this.idAsiento = idAsiento;
    }


    public String getCodAsiento() {
        return this.codAsiento;
    }

    public void setCodAsiento(String codAsiento) {
        this.codAsiento = codAsiento;
    }

    public AvionEntity getAvion() {
        return avionEntity;
    }

    public void setAvion(AvionEntity avionEntity) {
        this.avionEntity = avionEntity;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
}
