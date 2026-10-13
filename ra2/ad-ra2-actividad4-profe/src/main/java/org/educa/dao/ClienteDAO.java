package org.educa.dao;

import org.educa.entity.ClienteEntity;

import java.util.List;

public interface ClienteDAO {
    List<ClienteEntity> findAllWithReservationCount();
}
