package org.educa.service;

import org.educa.dao.ClienteDAO;
import org.educa.dao.ClienteDAOImpl;
import org.educa.entity.ClienteEntity;

public class ClienteService {
    private final ClienteDAO clienteDAO = new ClienteDAOImpl();
    public int insertCliente(ClienteEntity cliente) {
        return clienteDAO.insert(cliente);
    }
}
