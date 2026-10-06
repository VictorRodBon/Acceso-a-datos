package org.educa.service;

import org.educa.dao.DaoImpl;
import org.educa.dao.DaoInterface;

import java.sql.SQLException;

public class BilleteService {
    DaoInterface dao = new DaoImpl();
    public int actualizarPreciosBilleteAeropuerto(String city) throws SQLException {


        return dao.updateBillete(city);
    }
}
