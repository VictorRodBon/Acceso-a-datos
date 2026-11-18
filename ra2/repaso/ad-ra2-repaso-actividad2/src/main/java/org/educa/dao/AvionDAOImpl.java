package org.educa.dao;

import org.educa.pool.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public record AvionDAOImpl() implements AvionDAO {
    @Override
    public int update() {
        String sql = "update aviones SET estado = 'MANTENIMIENTO'" +
                "where consumo_hora > ? and id_modelo IN(" +
                "Select id_modelo from modelos_avion where LOWER(fabricante) = ?)";
        try(Connection connection = ConnectionPool.getDataSource().getConnection(); PreparedStatement ps = connection.prepareStatement(sql) ){
            ps.setInt(1, 3500);
            ps.setString(2, "boeing");
            return ps.executeUpdate();
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return 0;
    }
}
