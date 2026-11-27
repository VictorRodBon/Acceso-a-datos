package org.educa;

import org.educa.entity.PasajeroEntity;
import org.educa.entity.ReservaEntity;
import org.educa.service.PasajeroService;
import org.educa.service.ReservaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReservaService reservaService = new ReservaService();
        PasajeroService pasajeroService = new PasajeroService();
        System.out.println("indica el id de la reserva: ");
        try (Scanner sc = new Scanner(System.in)){
            int idReserva = sc.nextInt();
            sc.next();
            ReservaEntity reserva = reservaService.getById(idReserva);
            System.out.println("===== PASAJEROS =====");
            for(PasajeroEntity p : reserva.getPasajeros()){
                System.out.println(p.getPasajeroId());
            }
            System.out.println("Indica el id del pasajero a eliminar: ");
            int idPasajero = sc.nextInt();
            sc.next();
            pasajeroService.delete(idPasajero);
        }
    }
}