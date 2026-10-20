package org.educa.dao;

import org.educa.entity.ClienteEntity;
import org.educa.pool.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDaoImpl implements ClienteDao {

    @Override
    public ClienteEntity getClientData(String dni) {
        String sql = "SELECT * FROM CLIENTES c WHERE c.dni LIKE ?";

        try(Connection connection = ConnectionPool.getDataSource().getConnection();
            PreparedStatement ps = connection.prepareStatement(sql)
        ){
            ps.setString(1, dni);
            try(ResultSet rs = ps.executeQuery()){

                ClienteEntity c=new ClienteEntity();
                if (rs.next()){
                    c.setIdCliente(rs.getLong("id_cliente"));
                    c.setDni(rs.getString("dni"));
                    c.setNombre(rs.getString("nombre"));
                    c.setPApellido(rs.getString("p_apellido"));
                    c.setSApellido(rs.getString("s_apellido"));
                    c.setEmail(rs.getString("email"));
                    c.setTelefono(rs.getString("telefono"));
                    return c;
                }
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
