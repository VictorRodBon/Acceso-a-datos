package org.educa.dao;

import org.educa.entity.BilleteEntity;
import org.educa.pool.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BilleteDAOImpl implements BilleteDAO {

    @Override
    public List<BilleteEntity> findBilletesByOriginAirport(String origin) {
        List<BilleteEntity> billetes = new ArrayList<>();
        String sql = "SELECT b.id_billete, b.precio " +
                "FROM billetes b inner join vuelos v on v.id_vuelo = b.id_vuelo " +
                "inner join aeropuertos a on v.id_origen = a.id_aeropuerto " +
                "where a.ciudad = ?";
        try (Connection connection = ConnectionPool.getDataSource().getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, origin);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    BilleteEntity billeteEntity = new BilleteEntity();
                    billeteEntity.setIdBillete(rs.getLong(1));
                    billeteEntity.setPrecio(rs.getBigDecimal(2));
                    billetes.add(billeteEntity);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return billetes;
    }

    @Override
    public void updatePrecio(BilleteEntity billete) {
        String sql = "UPDATE billetes SET precio = ? where id_billete = ?";
        try (Connection connection = ConnectionPool.getDataSource().getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setBigDecimal(1, billete.getPrecio());
            ps.setLong(2, billete.getIdBillete());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
