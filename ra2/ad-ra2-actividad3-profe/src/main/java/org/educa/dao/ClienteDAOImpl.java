package org.educa.dao;

import org.educa.pool.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAOImpl implements ClienteDAO {
    @Override
    public int removeWithoutBooking() throws SQLException {
        String sql = "DELETE FROM Clientes c where c.id_cliente in (\n" +
                "select c.id_cliente FROM Clientes c left join Reservas r on c.id_cliente = r.id_cliente\n" +
                "where r.id_cliente is null\n" +
                ")";
        try (Connection connection = ConnectionPool.getDataSource().getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            return ps.executeUpdate();

        }
    }
}
