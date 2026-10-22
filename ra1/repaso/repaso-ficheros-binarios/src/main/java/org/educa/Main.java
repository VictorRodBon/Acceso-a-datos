package org.educa;

import org.educa.entity.PuntuacionEntity;
import org.educa.services.Service;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        String fichero = "src/main/resources/ranking.dat";

        List<PuntuacionEntity> puntuaciones = service.getData(fichero);
        service.setData(fichero);

        for (PuntuacionEntity p : puntuaciones){
            System.out.println(p.getNombre()+";"+p.getNivel()+";"+p.getPuntuacion());
        }
    }
}