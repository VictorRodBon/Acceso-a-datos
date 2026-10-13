package org.educa.dao;

import org.educa.entity.ClienteEntity;
import org.educa.pool.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
    @Override
    public List<ClienteEntity> findAllWithReservationCount() {
        List<ClienteEntity> clientes = new ArrayList<>();
        String sql = "SELECT c.dni, c.nombre, c.p_apellido, c.s_apellido, COUNT(r.id_reserva) as num_reservas " +
                "FROM clientes c LEFT JOIN reservas r ON c.id_cliente = r.id_cliente " +
                "GROUP BY c.id_cliente, c.dni, c.nombre, c.p_apellido, c.s_apellido " +
                "ORDER BY c.nombre";
        try (Connection connection = ConnectionPool.getDataSource().getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                ClienteEntity cliente = new ClienteEntity();
                cliente.setDni(rs.getString("dni"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setPApellido(rs.getString("p_apellido"));
                cliente.setSApellido(rs.getString("s_apellido"));
                cliente.setNumReservas(rs.getInt("num_reservas"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return clientes;
    }
}
