package org.educa.dao;

import org.educa.entity.ClienteEntity;
import org.educa.pool.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDaoImpl implements ClienteDao {
    @Override
    public int addCliente(ClienteEntity cliente) {
        // Se elimina el punto y coma final del SQL
        String sql = "INSERT INTO clientes (dni, nombre, p_apellido, s_apellido, email, telefono) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = ConnectionPool.getDataSource().getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getPApellido());
            ps.setString(4, cliente.getSApellido());
            ps.setString(5, cliente.getEmail());
            ps.setString(6, cliente.getTelefono());

            return ps.executeUpdate();

        } catch (SQLException e) {
            // Opcional: registrar el error con un logger (ej. logger.error("Error al insertar cliente", e);)
            throw new RuntimeException("Error al insertar el cliente en la base de datos", e);
        }
    }
}