package org.educa.entity;


import java.math.BigDecimal;

public class BilleteEntity {
    private Long idBillete;

    private PasajeroEntity pasajeroEntity;

    private VueloEntity vueloEntity;

    private AsientoEntity asientoEntity;

    private BigDecimal precio;

    public Long getIdBillete() {
        return idBillete;
    }

    public void setIdBillete(Long idBillete) {
        this.idBillete = idBillete;
    }

    public PasajeroEntity getPasajero() {
        return pasajeroEntity;
    }

    public void setPasajero(PasajeroEntity pasajeroEntity) {
        this.pasajeroEntity = pasajeroEntity;
    }

    public VueloEntity getVuelo() {
        return vueloEntity;
    }

    public void setVuelo(VueloEntity vueloEntity) {
        this.vueloEntity = vueloEntity;
    }

    public AsientoEntity getAsiento() {
        return asientoEntity;
    }

    public void setAsiento(AsientoEntity asientoEntity) {
        this.asientoEntity = asientoEntity;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
}
