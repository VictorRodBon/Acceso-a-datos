package org.educa.ra1.dao;

import generated.Factura;
import jakarta.xml.bind.JAXBException;

import java.io.File;

public interface FacturaDAO {
    void marshalling(Factura factura, File file) throws JAXBException;
}
