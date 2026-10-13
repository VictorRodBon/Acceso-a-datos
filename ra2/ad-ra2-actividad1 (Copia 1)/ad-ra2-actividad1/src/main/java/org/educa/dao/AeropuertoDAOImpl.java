package org.educa.dao;

import generated.Aeropuerto;
import generated.Aeropuertos;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.educa.pool.ConnectionPool;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AeropuertoDAOImpl implements AeropuertoDAO {

    @Override
    public Aeropuertos readFromXML(File fileXml) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Aeropuertos.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (Aeropuertos) unmarshaller.unmarshal(fileXml);
    }

    @Override
    public int insertAll(Aeropuertos aeropuertos) throws SQLException {
        try (Connection connection = ConnectionPool.getDataSource().getConnection()) {
            return inertAll(aeropuertos, connection);
        }
    }

    private static int inertAll(Aeropuertos aeropuertos, Connection connection) throws SQLException {
        String sql = "INSERT INTO Aeropuertos (cod_iata, nombre, ciudad, pais, tasa_aero) " +
                "VALUES (?,?,?,?,?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            connection.setAutoCommit(false);

            int contador = 0;
            for (Aeropuerto aeropuerto : aeropuertos.getAeropuerto()) {
                ps.setString(1, aeropuerto.getIata());
                ps.setString(2, aeropuerto.getNombre());
                ps.setString(3, aeropuerto.getCiudad());
                ps.setString(4, aeropuerto.getPais());
                ps.setBigDecimal(5, aeropuerto.getTasa());

                contador = contador + ps.executeUpdate();
            }

            connection.commit();

            return contador;
        } catch (Exception e) {
            connection.rollback();
            throw e;
        }
    }
}
