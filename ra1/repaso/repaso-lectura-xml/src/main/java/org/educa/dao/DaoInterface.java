package org.educa.dao;

import org.educa.ra1.model.Libreria;

public interface DaoInterface {
    public Libreria getLibreriaData(String path);

    void setLibreriaData(Libreria libreria, String path);
}
