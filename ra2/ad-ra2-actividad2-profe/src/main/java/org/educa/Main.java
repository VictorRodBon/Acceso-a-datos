package org.educa;

import org.educa.service.BilleteService;

import java.math.BigDecimal;

public class Main {

    private static final String ORIGIN = "Madrid";

    public static void main(String[] args) {
        BilleteService billeteService = new BilleteService();
        billeteService.discountPerOriginAirport(ORIGIN, new BigDecimal("5"));
    }
}