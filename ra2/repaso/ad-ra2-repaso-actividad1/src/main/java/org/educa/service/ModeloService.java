package org.educa.service;

import org.educa.dao.ModeloDAO;
import org.educa.dao.ModeloDAOImpl;
import org.educa.entity.ModeloEntity;

import java.util.List;

public class ModeloService {
    private ModeloDAO modeloDAO = new ModeloDAOImpl();
    public void saveAll(List<ModeloEntity> modelos) {
        modeloDAO.save(modelos);
    }
}
