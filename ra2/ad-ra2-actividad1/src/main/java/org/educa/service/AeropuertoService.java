package org.educa.service;

import generated.Aeropuertos;
import jakarta.xml.bind.JAXBException;
import org.educa.dao.AeropuertoDAO;
import org.educa.dao.AeropuertoDAOImpl;

import java.io.File;
import java.sql.SQLException;

public class AeropuertoService {
    private final AeropuertoDAO aeropuertoDAO = new AeropuertoDAOImpl();

    /**
     * Lee Aeropuertos de un XML
     *
     * @param pathXml La ruta al fichero XML
     * @return Los {@link Aeropuertos}
     * @throws JAXBException Excepcion procesando el fichero XML
     */
    public Aeropuertos readFromXML(String pathXml) throws JAXBException {
        File fileXml = new File(pathXml);
        return aeropuertoDAO.readFromXML(fileXml);
    }

    /**
     * Inserta {@link generated.Aeropuerto} incluido en {@link Aeropuertos} en la BBDD
     *
     * @param aeropuertos los {@link Aeropuertos}
     * @return El numero de filas afectadas
     * @throws SQLException Excepcion al ejecutar la sentencia SQL
     */
    public int insertAll(Aeropuertos aeropuertos) throws SQLException {
        return aeropuertoDAO.insertAll(aeropuertos);
    }
}
