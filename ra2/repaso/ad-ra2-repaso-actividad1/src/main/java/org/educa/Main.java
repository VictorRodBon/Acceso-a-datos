package org.educa;

import org.educa.entity.ModeloEntity;
import org.educa.service.ModeloService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ModeloService modeloService = new ModeloService();
        System.out.println("Se van a introducir 4 modelos de aviones en la base de datos");
        List<ModeloEntity> modelos = new ArrayList<>();
        modelos.add(new ModeloEntity(5, "A321neo", "Airbus", 180));
        modelos.add(new ModeloEntity(6, "A350-900", "Airbus", 280));
        modelos.add(new ModeloEntity(7, "B787-10", "Boeing", 186));
        modelos.add(new ModeloEntity(8, "B737-800", "Boeing", 180));
        try {
            modeloService.saveAll(modelos);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
