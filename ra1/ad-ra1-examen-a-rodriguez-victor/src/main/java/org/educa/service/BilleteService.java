package org.educa.service;

import generated.*;
import jakarta.xml.bind.JAXBException;
import org.educa.dao.BilleteDao;
import org.educa.dao.BilleteDaoImpl;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;

public class BilleteService {

    private static final String TXT = "src/main/resources/import/billetes.txt";
    private static final String XML = "src/main/resources/export/billetes.xml";
    BilleteDao dao = new BilleteDaoImpl();

    /**
     * Obtener un listado de los billetes almacenados en el fichero src/main/resources/import/billetes.txt
     * @return Billetes
     * @throws IOException
     */
    public Billetes readBilletes() throws IOException {
        Billetes billetes = new Billetes();

        String[] contenido = dao.readTxt(TXT).split("\n");
        String[] linea;

        for(int i = 0; i<contenido.length; i++){
            Billete billete = new Billete();
            Pasajero p = new Pasajero();
            Vuelo v = new Vuelo();
            linea=contenido[i].split(";");
            // localizador
            billete.setLocalizador(linea[0]);
            // pasajero
            p.setValue(linea[1]);
            p.setDni(linea[2]);
            billete.setPasajero(p);
            // vuelo
            v.setCodigo(linea[3]);
            v.setOrigen(linea[4]);
            v.setDestino(linea[5]);
            v.setFecha(linea[6]);
            billete.setVuelo(v);
            // clase
            billete.setClase(Clase.valueOf(linea[7]));
            // maletas
            billete.setMaletas(Integer.parseInt(linea[8]));
            // precio base
            billete.setPrecioBase(new BigDecimal(linea[9]));
            // precio final
            billete.setPrecioFinal(calcularPrecioFinal(new BigDecimal(linea[9]), linea[7].toString()));

            billetes.getBillete().add(billete);
        }

        return billetes;
    }

    /**
     * Exportar los billetes introducidos a un fichero "src/main/resources/export/billetes.xml"
     * @param billetes objeto Billetes con objetos Billete dentro
     * @throws JAXBException excepción de fallo de ejecución de JAXB
     * @throws IOException excepción de fallo de ejecución de entrada/salida
     */
    public void createXML(Billetes billetes) throws JAXBException, IOException {
        dao.exportBilletes(billetes, XML);
    }

    private BigDecimal calcularPrecioFinal(BigDecimal precioBase, String categoria){
        BigDecimal c= null;
        BigDecimal tasaAero = new BigDecimal("15");

        switch (categoria){
            case "TURISTA": c=new BigDecimal("1.0");
            case "BUSINESS": c=new BigDecimal("1.8");
            case "PRIMERA": c=new BigDecimal("2.5");
        }

        BigDecimal preciofinal = precioBase.multiply(c).add(tasaAero);
        return preciofinal;
    }
}