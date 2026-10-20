package org.educa.dao;

import org.educa.entity.AvionEntity;

public interface AvionesDao {
    AvionEntity getDabaByPlate(String matricula);
}
