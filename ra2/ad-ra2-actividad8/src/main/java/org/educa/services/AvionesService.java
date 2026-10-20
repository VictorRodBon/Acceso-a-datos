package org.educa.services;

import org.educa.dao.AvionesDao;
import org.educa.dao.AvionesDaoImpl;
import org.educa.entity.AvionEntity;

public class AvionesService {
    AvionesDao dao = new AvionesDaoImpl();
    public AvionEntity getDataByPlate(String matricula) {
        return dao.getDabaByPlate(matricula);
    }
}
