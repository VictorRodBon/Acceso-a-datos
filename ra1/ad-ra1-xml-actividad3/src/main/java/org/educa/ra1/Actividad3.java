package org.educa.ra1;

import org.educa.ra1.service.FacturaService;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Actividad3 {

    private static final String PATH_XML = "src/main/resources/xml/actividad3.xml";

    public static void main(String[] args) {
        File file = new File(PATH_XML);
        FacturaService facturaService = new FacturaService();
        facturaService.marshalling(file);
    }
}
