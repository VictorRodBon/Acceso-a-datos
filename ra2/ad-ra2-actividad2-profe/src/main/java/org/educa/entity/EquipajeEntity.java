package org.educa.entity;


import java.math.BigDecimal;

public class EquipajeEntity {
    private Long idEquipaje;

    private BilleteEntity billeteEntity;

    private BigDecimal peso;

    private String tipo;


    public Long getIdEquipaje() {
        return idEquipaje;
    }

    public void setIdEquipaje(Long idEquipaje) {
        this.idEquipaje = idEquipaje;
    }

    public BilleteEntity getBillete() {
        return billeteEntity;
    }

    public void setBillete(BilleteEntity billeteEntity) {
        this.billeteEntity = billeteEntity;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
