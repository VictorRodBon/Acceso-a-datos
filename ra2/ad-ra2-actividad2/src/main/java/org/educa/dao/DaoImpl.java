package org.educa.dao;

import org.educa.entity.AeropuertoEntity;
import org.educa.entity.BilleteEntity;
import org.educa.entity.VueloEntity;
import org.educa.pool.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoImpl {
    private Connection conexion;

    public DaoImpl(Connection conexion) {
        this.conexion = conexion;
    }

    // 1. Obtener Aeropuerto por ciudad
    public AeropuertoEntity obtenerAeropuertoPorCiudad(String ciudad) {
        String sql = "SELECT id_aeropuerto, nombre, ciudad FROM Aeropuertos WHERE ciudad = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, ciudad);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new AeropuertoEntity(
                            rs.getInt("id_aeropuerto"),
                            rs.getString("nombre"),
                            rs.getString("ciudad")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // 2. Obtener Vuelos por ID de origen
    public List<VueloEntity> obtenerVuelosPorOrigen(int idAeropuertoOrigen) {
        List<VueloEntity> vuelos = new ArrayList<>();
        String sql = "SELECT id_vuelo, id_origen, id_destino FROM Vuelos WHERE id_origen = ?";

        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setInt(1, idAeropuertoOrigen);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    vuelos.add(new VueloEntity(
                            rs.getInt("id_vuelo"),
                            rs.getInt("id_origen"),
                            rs.getInt("id_destino")
                    ));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vuelos;
    }

    // 3. Obtener Billetes por ID de vuelo
    public List<BilleteEntity> obtenerBilletesPorVuelo(int idVuelo) {
        List<BilleteEntity> billetes = new ArrayList<>();
        String sql = "SELECT id_billete, id_vuelo, precio FROM Billetes WHERE id_vuelo = ?";

        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setInt(1, idVuelo);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    billetes.add(new BilleteEntity(
                            rs.getInt("id_billete"),
                            rs.getInt("id_vuelo"),
                            rs.getDouble("precio")
                    ));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return billetes;
    }

    // 4. Actualizar el precio de un Billete
    public void actualizarBillete(BilleteEntity billete) {
        String sql = "UPDATE Billetes SET precio = ? WHERE id_billete = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setDouble(1, billete.getPrecio());
            pstmt.setInt(2, billete.getIdBillete());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}