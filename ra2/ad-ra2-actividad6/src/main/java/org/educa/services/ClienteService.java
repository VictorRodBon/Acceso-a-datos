package org.educa.services;

import org.educa.dao.ClienteDao;
import org.educa.dao.ClienteDaoImpl;
import org.educa.entity.ClienteEntity;

public class ClienteService {
    private ClienteDao dao = new ClienteDaoImpl();

    public ClienteEntity getClientData(String dni){
        return dao.getClientData(dni);
    }
}
