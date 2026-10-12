package org.educa.ra1.service;

import org.educa.ra1.dao.FacturaDAO;
import org.educa.ra1.dao.FacturaDAOImpl;
import generated.*;
import jakarta.xml.bind.JAXBException;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class FacturaService {
    private final FacturaDAO facturaDAO = new FacturaDAOImpl();
    public void marshalling(File file) {
        Factura invoice = createInvoice();
        try {
            facturaDAO.marshalling(invoice, file);

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    private Factura createInvoice() {
        Factura factura = new Factura();
        factura.setNFac(new BigInteger("999"));
        factura.setDatosEmpresa(createCompanyData());
        factura.setDatosFactura(createInvoiceData());
        factura.setDatosCliente(createClientdData());
        return factura;
    }

    private DatosCliente createClientdData() {
        DatosCliente datosCliente = new DatosCliente();
        datosCliente.setNombre("Darío, Bueno Gutiérrez");
        datosCliente.setNCli(new BigInteger("879"));
        datosCliente.setPoblacion(createTownDataClient());
        datosCliente.setDirEnv("Av. Oporto nº7 4ºd");
        datosCliente.setProvincia("Madrid");
        return datosCliente;
    }

    private Poblacion createTownDataClient() {
        Poblacion poblacion = new Poblacion();
        poblacion.setCodPostal(new BigInteger("28043"));
        poblacion.setValue("Madrid");
        return poblacion;
    }

    private DatosFactura createInvoiceData() {
        DatosFactura datosFactura = new DatosFactura();
        datosFactura.setBase(new BigDecimal("970.00"));
        datosFactura.setCuotaIva(new BigDecimal("155.20"));
        datosFactura.setIva(new BigInteger("16"));
        datosFactura.setNPed(new BigInteger("731"));
        datosFactura.setTotal(new BigDecimal("1125.20"));
        datosFactura.setMoneda("EUR");
        datosFactura.setFPago("efectivo");
        datosFactura.setFecha(getXMLGregorianCalendar("2005-12-01"));
        createLineInvoice(datosFactura.getLinea());
        return datosFactura;
    }

    private void createLineInvoice(List<Linea> lineas) {
        Linea linea1 = new Linea();
        linea1.setCant(new BigInteger("1"));
        linea1.setDesc("MICRO PENTIUM IV 3000MHZ FB800");
        linea1.setPrecio(new BigInteger("230"));
        linea1.setImporte(new BigDecimal("266.80"));
        linea1.setRef("MII93000F/8");
        lineas.add(linea1);

        Linea linea2 = new Linea();
        linea2.setCant(new BigInteger("1"));
        linea2.setDesc("PLACA BASE QDI P4");
        linea2.setPrecio(new BigInteger("180"));
        linea2.setImporte(new BigDecimal("208.80"));
        linea2.setRef("MB8QDIP4");
        lineas.add(linea2);

        Linea linea3 = new Linea();
        linea3.setCant(new BigInteger("2"));
        linea3.setDesc("DIMM DDR 512MB 3200");
        linea3.setPrecio(new BigInteger("40"));
        linea3.setImporte(new BigDecimal("92.80"));
        linea3.setRef("MEDD512M32");
        lineas.add(linea3);

        Linea linea4 = new Linea();
        linea4.setCant(new BigInteger("4"));
        linea4.setDesc("DISCO DURO 250GB S-ATA 7200");
        linea4.setPrecio(new BigInteger("120"));
        linea4.setImporte(new BigDecimal("556.80"));
        linea4.setRef("HD250GSA7");
        lineas.add(linea4);
    }

    private XMLGregorianCalendar getXMLGregorianCalendar(String s) {
        XMLGregorianCalendar xmlGregorianCalendar;
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(s);
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(date);
            xmlGregorianCalendar = DatatypeFactory.newInstance().
                    newXMLGregorianCalendar(gregorianCalendar);
        } catch (ParseException | DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
        return xmlGregorianCalendar;
    }

    private DatosEmpresa createCompanyData() {
        DatosEmpresa datosEmpresa = new DatosEmpresa();
        datosEmpresa.setCif("Q-9876543");
        datosEmpresa.setDir("Av. Valladolid");
        datosEmpresa.setNombre("Equipos Digitales S.L.");
        datosEmpresa.setPoblacion(createTownData());
        datosEmpresa.setProvincia("Madrid");
        return datosEmpresa;
    }

    private Poblacion createTownData() {
        Poblacion poblacion = new Poblacion();
        poblacion.setCodPostal(new BigInteger("28043"));
        poblacion.setValue("Madrid");
        return poblacion;
    }
}
