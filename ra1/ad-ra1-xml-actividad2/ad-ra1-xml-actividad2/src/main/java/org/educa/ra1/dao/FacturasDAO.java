package org.educa.ra1.dao;

import generated.Factura;
import jakarta.xml.bind.JAXBException;
import org.xml.sax.SAXException;

public interface FacturasDAO {
    Factura getFactura(String pathXml, String pathXsd) throws JAXBException, SAXException;
}
