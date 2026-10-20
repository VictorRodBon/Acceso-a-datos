package org.educa.services;

import org.educa.dao.ReservaDao;
import org.educa.dao.ReservaDaoImpl;
import org.educa.entity.ReservaEntity;

import java.util.List;

public class ServicioReservas {
    ReservaDao reservaDao = new ReservaDaoImpl();

    public List<ReservaEntity> getReservaData(){
        return reservaDao.getReservaData();
    }
}
