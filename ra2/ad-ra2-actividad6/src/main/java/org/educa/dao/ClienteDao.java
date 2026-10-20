package org.educa.dao;

import org.educa.entity.ClienteEntity;

public interface ClienteDao {
    ClienteEntity getClientData(String dni);
}
