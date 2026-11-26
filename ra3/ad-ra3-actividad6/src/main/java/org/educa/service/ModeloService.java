package org.educa.service;

import org.educa.dao.ModeloDAO;
import org.educa.dao.ModeloDAOImpl;
import org.educa.entity.ModeloEntity;

public class ModeloService {
    ModeloDAO dao = new ModeloDAOImpl();
    public void create(ModeloEntity modelo) {
        dao.create(modelo);
    }
}
