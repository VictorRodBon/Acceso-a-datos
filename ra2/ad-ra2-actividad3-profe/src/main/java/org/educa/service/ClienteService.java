package org.educa.service;

import org.educa.dao.ClienteDAO;
import org.educa.dao.ClienteDAOImpl;

import java.sql.SQLException;

public class ClienteService {
    private final ClienteDAO clienteDAO = new ClienteDAOImpl();

    public int removeWithoutBooking() throws SQLException {
        return clienteDAO.removeWithoutBooking();
    }
}
