package org.educa.dao;

import jakarta.xml.bind.*;
import org.educa.ra1.model.Libreria;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.validation.SchemaFactory;
import java.io.File;

public class DaoImpl implements DaoInterface{
    String xsd = "src/main/resources/xsd/libbreria.xsd";

    @Override
    public Libreria getLibreriaData(String path) {
        Libreria libreria = null;
        File f = new File(path);
        if (!f.exists()) {
            System.err.println("Error, no se ha introducido un fichero XML válido.");
            return null;
        }

        try {
            JAXBContext context = JAXBContext.newInstance(Libreria.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // CORRECCIÓN 1: Usar W3C_XML_SCHEMA_NS_URI (sin la palabra INSTANCE)
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            unmarshaller.setSchema(schemaFactory.newSchema(new File(xsd)));

            libreria = (Libreria) unmarshaller.unmarshal(f);

        } catch (JAXBException e) {
            System.err.println("Error de JAXB / Validación XML: " + e.getMessage());
        } catch (SAXException e) {
            System.err.println("Error al cargar el esquema XSD: " + e.getMessage());
        }

        return libreria;
    }

    @Override
    public void setLibreriaData(Libreria libreria, String path) {
        try {
            JAXBContext context = JAXBContext.newInstance(Libreria.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(libreria, new File(path));
        }catch (JAXBException e){
            System.err.println(e.getMessage());
        }
    }
}
