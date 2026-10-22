package org.educa.services;

import org.educa.dao.DaoImpl;
import org.educa.dao.DaoInterface;
import org.educa.entity.ProductoEntity;

import java.util.ArrayList;
import java.util.List;

public class Service {
    DaoInterface dao = new DaoImpl();
    public List<ProductoEntity> getProductos(String pathOrigen) {
        return dao.getProductos(pathOrigen);
    }

    public void setReponer(String pathDestino, String pathOrigen) {
        // filtrar productos
        List<ProductoEntity> productos = getProductos(pathOrigen);
        List<ProductoEntity> reponer = new ArrayList<>();

        for(ProductoEntity p : productos){
            if(p.getCantidad()<5){
                reponer.add(p);
            }
        }


        // crear fichero
        dao.setReponer(pathDestino, reponer);
    }
}
