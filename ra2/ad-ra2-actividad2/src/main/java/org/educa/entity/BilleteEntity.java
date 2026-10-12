package org.educa.entity;

public class BilleteEntity {
    private int idBillete;
    private int idPadajero;
    private int idVuelo;
    private int idAsiento;
    private double precio;

    public BilleteEntity(int idBillete, int idVuelo, double precio) {
        this.idBillete = idBillete;
        this.idVuelo = idVuelo;
        this.precio = precio;
    }

    public int getIdBillete() {
        return idBillete;
    }
    public void setIdBillete(int idBillete) {
        this.idBillete = idBillete;
    }

    public int getIdPadajero() {
        return idPadajero;
    }
    public void setIdPadajero(int idPadajero) {
        this.idPadajero = idPadajero;
    }

    public int getIdVuelo() {
        return idVuelo;
    }
    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public int getIdAsiento() {
        return idAsiento;
    }
    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
