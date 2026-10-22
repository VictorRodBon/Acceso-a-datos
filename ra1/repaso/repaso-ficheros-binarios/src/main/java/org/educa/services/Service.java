package org.educa.services;

import org.educa.dao.DaoImpl;
import org.educa.dao.DaoInterface;
import org.educa.entity.PuntuacionEntity;

import java.util.ArrayList;
import java.util.List;

public class Service {
    DaoInterface dao = new DaoImpl();

    public List<PuntuacionEntity> getData(String path){
        return dao.getPuntuacion(path);
    }
    public void setData(String path){
        List<PuntuacionEntity> puntuaciones = new ArrayList<>();
        puntuaciones.add(new PuntuacionEntity("victor", 15000, 30));
        puntuaciones.add(new PuntuacionEntity("sergio", 20000, 35));
        puntuaciones.add(new PuntuacionEntity("pablo", 8000, 15));
        puntuaciones.add(new PuntuacionEntity("adrian", 10000, 20));

        dao.setPuntuaciones(path, puntuaciones);
    }
}
