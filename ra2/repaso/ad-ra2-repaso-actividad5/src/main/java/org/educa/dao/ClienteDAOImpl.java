package org.educa.dao;

import org.educa.entity.ClienteEntity;
import org.educa.pool.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAOImpl implements ClienteDAO {
    @Override
    public int insert(ClienteEntity cliente) {
        String sql = "insert into clientes (dni, nombre, p_apellido, s_apellido, email, telefono) values (?, ?, ?, ?, ?, ?)";
        try(Connection connection = ConnectionPool.getDataSource().getConnection();
            PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1 ,cliente.getDni());
            ps.setString(2 ,cliente.getNombre());
            ps.setString(3 ,cliente.getPApellido());
            ps.setString(4 ,cliente.getSApellido());
            ps.setString(5 ,cliente.getEmail());
            ps.setString(6 ,cliente.getTlf());

            return ps.executeUpdate();
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return 0;
    }
}
