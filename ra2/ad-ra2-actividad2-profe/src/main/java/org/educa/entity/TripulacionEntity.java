package org.educa.entity;


import java.util.List;

public class TripulacionEntity {

    private Long idEmpleado;

    private String licencia;

    private String nombre;

    private String pApellido;

    private String sApellido;

    private String rol;

    private List<VueloEntity> vueloEntities;

    private List<ModeloAvionEntity> habilitaciones;

    public List<ModeloAvionEntity> getHabilitaciones() {
        return habilitaciones;
    }

    public void setHabilitaciones(List<ModeloAvionEntity> habilitaciones) {
        this.habilitaciones = habilitaciones;
    }

    public List<VueloEntity> getVuelos() {
        return vueloEntities;
    }

    public void setVuelos(List<VueloEntity> vueloEntities) {
        this.vueloEntities = vueloEntities;
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getpApellido() {
        return pApellido;
    }

    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
