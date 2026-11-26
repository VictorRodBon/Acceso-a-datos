package org.educa.service;

import org.educa.dao.ClienteDAO;
import org.educa.dao.ClienteDAOImpl;
import org.educa.entity.ClienteEntity;

import java.util.List;

public class ClienteService {
    private ClienteDAO clienteDAO = new ClienteDAOImpl();
    public List<ClienteEntity> selectWithReservasCount() {
        return clienteDAO.selectWithReservasCount();
    }
}
