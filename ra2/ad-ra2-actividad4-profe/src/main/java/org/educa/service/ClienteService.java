package org.educa.service;

import org.educa.dao.ClienteDAO;
import org.educa.dao.ClienteDAOImpl;
import org.educa.entity.ClienteEntity;

import java.util.List;

public class ClienteService {
    private final ClienteDAO clienteDAO = new ClienteDAOImpl();

    public List<ClienteEntity> findAllWithReservationCount() {
        return clienteDAO.findAllWithReservationCount();
    }
}
