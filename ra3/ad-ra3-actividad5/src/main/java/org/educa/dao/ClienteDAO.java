package org.educa.dao;

import org.educa.entity.ClienteEntity;

public interface ClienteDAO {
    void crear(ClienteEntity cliente);

    void update(int id, String nombre);

    ClienteEntity getById(int id);

    void delete(ClienteEntity cliente);
}
