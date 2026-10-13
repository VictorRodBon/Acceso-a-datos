package org.educa.ra1.dao;

import generated.Factura;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;

public class FacturaDAOImpl implements FacturaDAO {

    @Override
    public void marshalling(Factura factura, File file) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Factura.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(factura, file);
    }
}
