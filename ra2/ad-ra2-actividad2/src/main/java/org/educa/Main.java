package org.educa;

import org.educa.pool.ConnectionPool;
import org.educa.service.BilleteService;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {
        // Obtenemos el DataSource (Pool de conexiones)
        DataSource dataSource = ConnectionPool.getDataSource();

<<<<<<< HEAD
        try {
            billeteService.actualizarPreciosBilleteAeropuerto("Madrid");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
=======
        // Creamos el servicio pasándole el pool
        BilleteService billeteService = new BilleteService(dataSource);
>>>>>>> 2c600a2d49235e87798e4aaa2dbba647aed1058c

        // Ejecutamos la lógica de negocio (Aplicar un 5% de descuento = 0.05)
        billeteService.aplicarDescuentoPorCiudadOrigen("Madrid", 0.05);
    }
}
