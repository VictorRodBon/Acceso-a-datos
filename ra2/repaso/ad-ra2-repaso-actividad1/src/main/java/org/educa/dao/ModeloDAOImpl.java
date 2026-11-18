package org.educa.dao;

import org.educa.entity.ModeloEntity;
import org.educa.pool.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ModeloDAOImpl implements ModeloDAO {
    @Override
    public void save(List<ModeloEntity> modelos) {
        String sql="insert into modelos_avion (cod_modelo, fabricante, capacidad) " +
                "values (?,?,?)";
        try (
                Connection connection = ConnectionPool.getDataSource().getConnection();
                PreparedStatement ps = connection.prepareStatement(sql)
        ){
            connection.setAutoCommit(false);
            for(ModeloEntity m : modelos){
                ps.setString(1,m.getCodModelo());
                ps.setString(2,m.getFabricante());
                ps.setInt(3,m.getCapacidad());

                ps.execute();
            }
            connection.commit();
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    }
}
