package org.educa.service;

import org.educa.dao.AeropuertoDAO;
import org.educa.dao.AeropuertoDAOImpl;
import org.educa.entity.AeropuertoEntity;

public class AeropuertoService {
    private final AeropuertoDAO aeropuertoDAO = new AeropuertoDAOImpl();
    public void save(AeropuertoEntity aeropuertoEntity) {
        aeropuertoDAO.save(aeropuertoEntity);
    }
}
