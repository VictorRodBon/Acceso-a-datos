package org.educa;

import org.educa.entity.ReservaEntity;
import org.educa.services.ServicioReservas;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServicioReservas servicioReservas = new ServicioReservas();

        List<ReservaEntity> reservas = servicioReservas.getReservaData();

        for(ReservaEntity r : reservas){
            System.out.println(r.toString());
        }
    }
}
