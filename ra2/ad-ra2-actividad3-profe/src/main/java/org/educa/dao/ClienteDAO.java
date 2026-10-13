package org.educa.dao;

import java.sql.SQLException;

public interface ClienteDAO {
    int removeWithoutBooking() throws SQLException;
}
