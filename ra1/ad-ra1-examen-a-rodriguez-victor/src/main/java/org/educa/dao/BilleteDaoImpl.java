package org.educa.dao;

import generated.Billete;
import generated.Billetes;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BilleteDaoImpl implements BilleteDao{
    @Override
    public String readTxt(String path) throws IOException {
        StringBuilder contenido= new StringBuilder();
        String linea = "";
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            br.readLine();
            while((linea = br.readLine())!=null){
                contenido.append(linea).append("\n");
            }
        }
        return contenido.toString();
    }


    @Override
    public void exportBilletes(Billetes billetes, String path) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Billetes.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(billetes, new File(path));
    }
}
