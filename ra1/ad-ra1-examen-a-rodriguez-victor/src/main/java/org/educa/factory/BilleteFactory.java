package org.educa.factory;

import generated.*;

import java.math.BigDecimal;

public class BilleteFactory {
    /**
     * Genera Billetes con el precio final ya calculado
     *
     * @return Billetes con toda la información
     */
    public static Billetes create() {
        Billetes billetes = new Billetes();
        billetes.getBillete().add(createBillete("AAA111", "Paco Polo Pérez", "00000000X", Clase.TURISTA, 2,
                new BigDecimal("100.00"), new BigDecimal("115.00")));
        billetes.getBillete().add(createBillete("BBB222", "Marcos Alonso Pérez", "00000001R", Clase.BUSINESS, 1,
                new BigDecimal("100.00"), new BigDecimal("195.00")));
        billetes.getBillete().add(createBillete("CCC333", "Ana Gil Sanz", "00000002W", Clase.PRIMERA, 3,
                new BigDecimal("200.00"), new BigDecimal("515.00")));
        return billetes;
    }

    private static Billete createBillete(String localizador, String nombre, String dni, Clase clase, int maletas,
                                         BigDecimal precioBase, BigDecimal precioFinal) {
        Billete billete = new Billete();
        billete.setLocalizador(localizador);
        Pasajero pasajero = new Pasajero();
        pasajero.setValue(nombre);
        pasajero.setDni(dni);
        billete.setPasajero(pasajero);
        Vuelo vuelo = new Vuelo();
        vuelo.setCodigo("IB1234");
        vuelo.setOrigen("MAD");
        vuelo.setDestino("BCN");
        vuelo.setFecha("2026-12-15");
        billete.setVuelo(vuelo);
        billete.setClase(clase);
        billete.setMaletas(maletas);
        billete.setPrecioBase(precioBase);
        billete.setPrecioFinal(precioFinal);
        return billete;
    }
}
