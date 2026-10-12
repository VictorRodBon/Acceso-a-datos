package org.educa.dao;

import generated.Aeropuertos;
import jakarta.xml.bind.JAXBException;

import java.io.File;
import java.sql.SQLException;

public interface AeropuertoDAO {

    /**
     * Lee Aeropuertos de un XML
     *
     * @param fileXml La ruta al fichero XML
     * @return Los {@link Aeropuertos}
     * @throws JAXBException Excepcion procesando el fichero XML
     */
    Aeropuertos readFromXML(File fileXml) throws JAXBException;

    /**
     * Inserta {@link generated.Aeropuerto} incluido en {@link Aeropuertos} en la BBDD
     *
     * @param aeropuertos los {@link Aeropuertos}
     * @return El numero de filas afectadas
     * @throws SQLException Excepcion al ejecutar la sentencia SQL
     */
    int insertAll(Aeropuertos aeropuertos) throws SQLException;
}
