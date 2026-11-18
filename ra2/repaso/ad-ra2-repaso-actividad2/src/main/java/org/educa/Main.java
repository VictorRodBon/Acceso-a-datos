package org.educa;

import org.educa.service.AvionService;

public class Main {
    public static void main(String[] args) {
        AvionService avionService = new AvionService();
        System.out.println("Se han actualizado "+avionService.update()+" aviones");
    }
}
