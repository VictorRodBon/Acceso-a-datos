package org.educa;

import org.educa.service.ClienteService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        ClienteService clienteService = new ClienteService();
        try {
            int rows = clienteService.removeWithoutBooking();
            System.out.printf("Eliminado %d clientes sin reserva%n", rows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}