package org.educa.dao;

import org.educa.entity.ProductoEntity;

import java.util.List;

public interface DaoInterface {
    public List<ProductoEntity> getProductos(String path);
    public void setReponer(String path, List<ProductoEntity> productos);
}
