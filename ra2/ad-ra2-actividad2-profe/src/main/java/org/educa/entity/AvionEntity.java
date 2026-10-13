package org.educa.entity;


import java.math.BigDecimal;

public class AvionEntity {
    private Long idAvion;

    private String matricula;

    private ModeloAvionEntity modelo;

    private BigDecimal costeFlete;

    private BigDecimal consumoHora;

    private String estado;

    public Long getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(Long idAvion) {
        this.idAvion = idAvion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ModeloAvionEntity getModelo() {
        return modelo;
    }

    public void setModelo(ModeloAvionEntity modelo) {
        this.modelo = modelo;
    }

    public BigDecimal getCosteFlete() {
        return costeFlete;
    }

    public void setCosteFlete(BigDecimal costeFlete) {
        this.costeFlete = costeFlete;
    }

    public BigDecimal getConsumoHora() {
        return consumoHora;
    }

    public void setConsumoHora(BigDecimal consumoHora) {
        this.consumoHora = consumoHora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}