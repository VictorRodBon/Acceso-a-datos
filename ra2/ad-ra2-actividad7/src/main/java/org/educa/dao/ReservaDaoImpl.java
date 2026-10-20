package org.educa.dao;

import org.educa.entity.ReservaEntity;
import org.educa.pool.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReservaDaoImpl implements ReservaDao{
    @Override
    public List<ReservaEntity> getReservaData() {
        String sql ="SELECT r.id_reserva, r.fec_reserva, p.nombre, b.precio \n" +
                "FROM reservas r \n" +
                "inner join pasajeros p  on r.id_reserva  = p.id_reserva \n" +
                "inner join billetes b on b.id_pasajero = p.id_pasajero \n" +
                "where b.precio <=160; ";

        List<ReservaEntity> lista= new ArrayList<>();

        try (Connection connection = ConnectionPool.getDataSource().getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
        ){
            while(rs.next()){
                lista.add(new ReservaEntity(
                        rs.getLong("id_reserva"),
                        rs.getString("nombre"),
                        rs.getString("fec_reserva"),
                        rs.getDouble("precio")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return lista;
    }
}
