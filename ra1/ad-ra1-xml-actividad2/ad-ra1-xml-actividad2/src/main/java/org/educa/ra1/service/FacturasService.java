package org.educa.ra1.service;

import generated.Factura;
import jakarta.xml.bind.JAXBException;
import org.educa.ra1.dao.FacturasDAO;
import org.educa.ra1.dao.FacturasDAOImpl;
import org.xml.sax.SAXException;

public class FacturasService {

    private final FacturasDAO facturasDAO = new FacturasDAOImpl();

    public Factura unmarshall(String pathXml, String pathXsd) {
        try {
            return facturasDAO.getFactura(pathXml, pathXsd);
        } catch (JAXBException | SAXException e) {
            throw new RuntimeException(e);
        }
    }
}
