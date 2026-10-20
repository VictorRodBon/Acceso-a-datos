package org.educa.service;

import org.educa.dao.ClienteDao;
import org.educa.dao.ClienteDaoImpl;
import org.educa.entity.ClienteEntity;

import java.util.List;

public class ClienteService {
    private final ClienteDao clienteDao = new ClienteDaoImpl();

    public int addCliente(ClienteEntity cliente) {
        return clienteDao.addCliente(cliente);
    }
}
