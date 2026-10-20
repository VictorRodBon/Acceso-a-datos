package org.educa.dao;

import org.educa.entity.AvionEntity;
import org.educa.pool.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AvionesDaoImpl implements AvionesDao{
    @Override
    public AvionEntity getDabaByPlate(String matricula) {
        String sql = "SELECT a.id_avion , a.matricula, ma.cod_modelo, ma.fabricante, ma.capacidad \n" +
                "FROM aviones a \n" +
                "INNER JOIN modelos_avion ma ON a.id_modelo = ma.id_modelo \n" +
                "WHERE a.matricula = ?";

        AvionEntity a = new AvionEntity();

        try (Connection connection = ConnectionPool.getDataSource().getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
        ){
            ps.setString(1, matricula);
            try (ResultSet rs = ps.executeQuery()){
                if (rs.next()){
                    a.setId(rs.getLong(1));
                    a.setMatricula(rs.getString(2));
                    a.setModelo(rs.getString(3));
                    a.setFabricante(rs.getString(4));
                    a.setCapacidad(rs.getLong(5));
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return a;
    }
}
