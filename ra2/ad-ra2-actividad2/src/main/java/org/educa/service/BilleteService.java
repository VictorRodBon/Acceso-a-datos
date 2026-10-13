package org.educa.service;
<<<<<<< HEAD

import org.educa.dao.DaoImplBillete;
import org.educa.dao.DaoInterface;
=======
import org.educa.dao.DaoImpl;
import org.educa.entity.AeropuertoEntity;
import org.educa.entity.BilleteEntity;
import org.educa.entity.VueloEntity;
>>>>>>> 2c600a2d49235e87798e4aaa2dbba647aed1058c

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BilleteService {
<<<<<<< HEAD
    DaoInterface dao = new DaoImplBillete();
    public int actualizarPreciosBilleteAeropuerto(String city) throws SQLException {
=======
    private DataSource dataSource;
>>>>>>> 2c600a2d49235e87798e4aaa2dbba647aed1058c

    public BilleteService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void aplicarDescuentoPorCiudadOrigen(String ciudad, double porcentaje) {
        // Pedimos la conexión prestada del Pool
        try (Connection conexion = dataSource.getConnection()) {

            // Iniciamos la transacción
            conexion.setAutoCommit(false);

            // Instanciamos el único DAO con la conexión de la transacción
            DaoImpl dao = new DaoImpl(conexion);

            // 1. Buscamos el aeropuerto de Madrid
            AeropuertoEntity aeropuerto = dao.obtenerAeropuertoPorCiudad(ciudad);
            if (aeropuerto == null) {
                System.out.println("No se encontró ningún aeropuerto en la ciudad: " + ciudad);
                return;
            }

            // 2. Obtenemos los vuelos de ese aeropuerto
            List<VueloEntity> vuelos = dao.obtenerVuelosPorOrigen(aeropuerto.getIdAeropuerto());
            int totalActualizados = 0;

            // 3. Recorremos vuelos y billetes para aplicar el descuento del 5% (0.05)
            for (VueloEntity vuelo : vuelos) {
                List<BilleteEntity> billetes = dao.obtenerBilletesPorVuelo(vuelo.getIdVuelo());

                for (BilleteEntity billete : billetes) {
                    double nuevoPrecio = billete.getPrecio() * (1.0 - porcentaje); // Ej: precio * 0.95
                    billete.setPrecio(nuevoPrecio);

                    // Actualizamos usando el único DAO
                    dao.actualizarBillete(billete);
                    totalActualizados++;
                }
            }

            // 4. Si todo va bien, confirmamos cambios (Commit)
            conexion.commit();
            System.out.println("¡Descuento del 5% aplicado con éxito a " + totalActualizados + " billetes desde " + ciudad + "!");

        } catch (SQLException e) {
            System.err.println("Error en la operación. Se ha realizado un ROLLBACK.");
            e.printStackTrace();
        }
    }
}