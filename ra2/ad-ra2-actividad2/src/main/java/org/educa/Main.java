package org.educa;

import org.educa.service.BilleteService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Actualizar los precios de los billetes con salida del aeropuerto de Sevilla y añadir un descuento del 5%
        BilleteService billeteService = new BilleteService();

        try {
            System.out.println(billeteService.actualizarPreciosBilleteAeropuerto("Sevilla"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
