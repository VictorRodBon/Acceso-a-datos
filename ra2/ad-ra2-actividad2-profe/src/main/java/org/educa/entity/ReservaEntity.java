package org.educa.entity;


import java.time.LocalDate;

public class ReservaEntity {
    private Long idReserva;

    private String codReserva;

    private ClienteEntity clienteEntity;

    private LocalDate fecReserva;

    private String estado;

    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }

    public String getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(String codReserva) {
        this.codReserva = codReserva;
    }

    public ClienteEntity getCliente() {
        return clienteEntity;
    }

    public void setCliente(ClienteEntity clienteEntity) {
        this.clienteEntity = clienteEntity;
    }

    public LocalDate getFecReserva() {
        return fecReserva;
    }

    public void setFecReserva(LocalDate fecReserva) {
        this.fecReserva = fecReserva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
