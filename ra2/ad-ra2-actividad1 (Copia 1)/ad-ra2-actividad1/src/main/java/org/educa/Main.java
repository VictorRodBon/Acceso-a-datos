package org.educa;

import generated.Aeropuertos;
import jakarta.xml.bind.JAXBException;
import org.educa.service.AeropuertoService;

import java.sql.SQLException;

public class Main {

    private static final String PATH_XML = "src/main/resources/xml/aeropuertos.xml";

    public static void main(String[] args) {
        AeropuertoService aeropuertoService = new AeropuertoService();

        try {
            Aeropuertos aeropuertos = aeropuertoService.readFromXML(PATH_XML);
            int inserted = aeropuertoService.insertAll(aeropuertos);
            System.out.printf("Ejecución finalizada con %d filas insertadas %n", inserted);
        } catch (JAXBException e) {
            System.err.println("Error deserializando el fichero");
            throw new RuntimeException(e);
        } catch (SQLException e) {
            System.err.println("Error insertando en la base de datos");
            throw new RuntimeException(e);
        }
    }

}
