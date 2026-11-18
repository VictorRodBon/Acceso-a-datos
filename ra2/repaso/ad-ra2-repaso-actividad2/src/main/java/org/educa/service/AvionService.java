package org.educa.service;

import org.educa.dao.AvionDAO;
import org.educa.dao.AvionDAOImpl;

public class AvionService {
    private final AvionDAO avionDao = new AvionDAOImpl();
    public int update() {
        return avionDao.update();
    }
}
