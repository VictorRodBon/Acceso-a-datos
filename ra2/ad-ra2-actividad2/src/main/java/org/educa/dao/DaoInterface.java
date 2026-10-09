package org.educa.dao;

import java.sql.SQLException;

public interface DaoInterface {
    Object obtenerObjetos(String tabla) throws SQLException;
}
