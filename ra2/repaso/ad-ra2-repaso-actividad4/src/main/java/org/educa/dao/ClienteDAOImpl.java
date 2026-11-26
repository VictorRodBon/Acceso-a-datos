package org.educa.dao;

import org.educa.entity.ClienteEntity;
import org.educa.pool.ConnectionPool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
    @Override
    public List<ClienteEntity> selectWithReservasCount() {
        List<ClienteEntity> listaClientes = new ArrayList<>();
        String sql = "SELECT c.*, count(c.id_cliente) as reservasCount FROM clientes c INNER JOIN reservas r ON r.id_cliente = c.id_cliente GROUP BY c.id_cliente";
        try(Connection connection = ConnectionPool.getDataSource().getConnection();
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sql);
        ){
            while(rs.next()){
                listaClientes.add(
                    new ClienteEntity(
                        rs.getInt("id_cliente"),
                        rs.getString("dni"),
                        rs.getString("nombre"),
                        rs.getString("p_apellido"),
                        rs.getString("s_apellido"),
                        rs.getString("email"),
                        rs.getString("telefono"),
                        rs.getInt("reservasCount")
                    )
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaClientes;
    }
}
