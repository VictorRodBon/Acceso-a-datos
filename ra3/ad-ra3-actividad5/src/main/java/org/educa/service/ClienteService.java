package org.educa.service;

import org.educa.dao.ClienteDAO;
import org.educa.dao.ClienteDAOImpl;
import org.educa.entity.ClienteEntity;

public class ClienteService {
    ClienteDAO clienteDAO = new ClienteDAOImpl();
    public void crear(ClienteEntity cliente) {
        clienteDAO.crear(cliente);
    }

    public void update(int id, String nombre) {
        clienteDAO.update(id, nombre);
    }
}
