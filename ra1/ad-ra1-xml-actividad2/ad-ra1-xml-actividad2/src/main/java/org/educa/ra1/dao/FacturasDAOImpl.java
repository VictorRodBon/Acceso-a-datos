package org.educa.ra1.dao;

import generated.Factura;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.educa.ra1.handler.ValidationHandler;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.validation.SchemaFactory;
import java.io.File;

public class FacturasDAOImpl implements FacturasDAO {
    @Override
    public Factura getFactura(String pathXml, String pathXsd) throws JAXBException, SAXException {
        File xml = new File(pathXml);
        File xsd = new File(pathXsd);
        JAXBContext jaxbContext = JAXBContext.newInstance(Factura.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        unmarshaller.setSchema(SchemaFactory.newInstance(
                XMLConstants.W3C_XML_SCHEMA_NS_URI).newSchema(xsd));
        unmarshaller.setEventHandler(new ValidationHandler());
        return (Factura) unmarshaller.unmarshal(xml);
    }
}
