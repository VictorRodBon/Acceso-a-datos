package org.educa.service;

import org.educa.entity.ClienteEntity;
import org.educa.dao.ClienteDAO;
import org.educa.dao.ClienteDAOImpl;

public class ClienteService {
    private final ClienteDAO clienteDAO = new ClienteDAOImpl();
    public ClienteEntity get(Integer id) {
        return clienteDAO.get(id);
    }
}
