package org.educa.dao;

import org.educa.pool.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoImplBillete implements DaoInterface {

    @Override
    public int updateBillete(String city) throws SQLException {
        String sql="UPDATE Billetes JOIN Vuelos " +
                "ON Billetes.id_vuelo = Vuelos.id_vuelo JOIN Aeropuertos " +
                "ON Vuelos.id_origen = Aeropuertos.id_aeropuerto " +
                "SET Billetes.precio = Billetes.precio * 0.95" +
                "WHERE Aeropuertos.ciudad LIKE ?;";

        try(Connection connection = ConnectionPool.getDataSource().getConnection()){
            try (PreparedStatement ps = connection.prepareStatement(sql)){
                connection.setAutoCommit(false);
                ps.setString(1, city);
                return ps.executeUpdate();

                //connection.commit();


            }catch (Exception e){
                connection.rollback();
                throw e;
            }

        }
    }
}
