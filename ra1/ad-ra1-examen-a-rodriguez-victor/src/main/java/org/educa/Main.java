package org.educa;

import generated.Billete;
import generated.Billetes;
import org.educa.service.BilleteService;

public class Main {
    public static void main(String[] args) {
        BilleteService billeteService = new BilleteService();
        System.out.println("Bienvenido al programa para parsear billetes de TXT a XML.");
        try {
            //Actividad 1
            Billetes billetes = billeteService.readBilletes();
            if (billetes != null) {
                for (Billete billete : billetes.getBillete()) {
                    System.out.println("Localizador: " + billete.getLocalizador());
                    System.out.println("Pasajero: " + billete.getPasajero().getValue());
                    System.out.println("DNI: " + billete.getPasajero().getDni());
                    System.out.println("Vuelo: " + billete.getVuelo().getCodigo());
                    System.out.println("Origen: " + billete.getVuelo().getOrigen());
                    System.out.println("Destino: " + billete.getVuelo().getDestino());
                    System.out.println("Fecha: " + billete.getVuelo().getFecha());
                    System.out.println("Precio Base: " + billete.getPrecioBase());
                    System.out.println("Clase: " + billete.getClase().value());
                    System.out.println("Precio Final: " + billete.getPrecioFinal());
                }
            }
            //Actividad 2
            billeteService.createXML(billetes);
        } catch (Exception e) {
            System.err.println("Se ha producido una excepción");
            throw new RuntimeException(e);
        }
    }
}
