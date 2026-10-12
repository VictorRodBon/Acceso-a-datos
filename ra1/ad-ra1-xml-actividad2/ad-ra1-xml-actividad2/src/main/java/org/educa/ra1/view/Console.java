package org.educa.ra1.view;

import generated.DatosCliente;
import generated.DatosFactura;
import generated.Factura;
import generated.Linea;

import java.util.List;

public class Console {

    public void print(Factura factura) {
        printClientData(factura.getDatosCliente());
        printInvoiceData(factura.getDatosFactura());
    }

    private void printClientData(DatosCliente datosCliente) {
        System.out.println("------");
        System.out.println("Cliente. NumCli: " + datosCliente.getNCli());
        System.out.println("------");
        System.out.println("Nombre: " + datosCliente.getNombre());
        System.out.println("Dirección: " + datosCliente.getNombre());
        System.out.println("Población: " + datosCliente.getPoblacion().getValue());
        System.out.println("CP: " + datosCliente.getPoblacion().getCodPostal());
        System.out.println("Provincia: " + datosCliente.getProvincia());
    }

    private void printInvoiceData(DatosFactura datosFactura) {
        System.out.println("------");
        System.out.println("Factura");
        System.out.println("------");
        System.out.println("Num Ped: " + datosFactura.getNPed());
        System.out.println("IVA: " + datosFactura.getIva());
        System.out.println("Fecha: " + datosFactura.getFecha());
        System.out.println("Forma de pago: " + datosFactura.getFPago());
        System.out.println("Moneda: " + datosFactura.getMoneda());
        System.out.println("Total Base: " + datosFactura.getBase());
        System.out.println("Total IVA: " + datosFactura.getCuotaIva());
        System.out.println("Total Factura: " + datosFactura.getTotal());

        printInvoiceLine(datosFactura.getLinea());
    }

    private void printInvoiceLine(List<Linea> lineas) {
        for (Linea linea : lineas) {
            System.out.println("\t ref: " + linea.getRef());
            System.out.println("\t descripcion: " + linea.getRef());
            System.out.println("\t cantidad: " + linea.getCant());
            System.out.println("\t precio: " + linea.getPrecio());
            System.out.println("\t importe: " + linea.getImporte());
            System.out.println("\t ================================================");
        }

    }
}
