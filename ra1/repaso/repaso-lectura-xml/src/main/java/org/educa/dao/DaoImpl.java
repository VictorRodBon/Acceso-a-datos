package org.educa.dao;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.educa.ra1.model.Libreria;

import java.io.File;

public class DaoImpl implements DaoInterface{
    @Override
    public Libreria getLibreriaData(String path) {
        Libreria libreria = null;
        File f = new File(path);
        if(!f.exists()){
            System.err.println("Error, no se ha introducido un fichero");
            return null;
        }

        try {
            JAXBContext context = JAXBContext.newInstance(Libreria.class);
            Unmarshaller unmarshaller= context.createUnmarshaller();
            libreria = (Libreria) unmarshaller.unmarshal(f);
        }catch (JAXBException e){
            System.err.println(e.getMessage());
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
