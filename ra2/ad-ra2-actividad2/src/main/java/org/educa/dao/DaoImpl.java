package org.educa.dao;

import org.educa.pool.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoImpl implements DaoInterface {

    @Override
    public int updateBillete(String city) throws SQLException {
        String sql="SELECT * FROM Billetes JOIN Vuelos ON Billetes.id_vuelo = Vuelos.id_vuelo JOIN Aeropuertos ON Vuelos.id_origen = Aeropuertos.id_aeropuerto WHERE Aeropuertos.ciudad LIKE ?;";

        try(Connection connection = ConnectionPool.getDataSource().getConnection();PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, city);
            return ps.executeUpdate();
        }
    }
}
