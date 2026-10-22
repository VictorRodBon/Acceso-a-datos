package org.educa.entity;

public class PuntuacionEntity {
    private String nombre;
    private int puntuacion;
    private int nivel;

    public PuntuacionEntity(String nombre, int puntuacion, int nivel) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
