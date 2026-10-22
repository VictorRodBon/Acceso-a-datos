package org.educa.dao;

import org.educa.entity.PuntuacionEntity;

import java.util.List;

public interface DaoInterface {
    public List<PuntuacionEntity> getPuntuacion(String path);
    public void setPuntuaciones(String path, List<PuntuacionEntity> puntuaciones);
}
