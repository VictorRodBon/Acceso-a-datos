package org.educa;

import org.educa.entity.AeropuertoEntity;
import org.educa.service.AeropuertoService;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al programa para insertar aeropuertos.");
        System.out.println("Por favor introduce los datos del nuevo aeropuerto.");
        AeropuertoService aeropuertoService = new AeropuertoService();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduce el código IATA (3 letras):");
            String codIATA = scanner.nextLine();
            System.out.println("Introduce el nombre del aeropuerto:");
            String nombre = scanner.nextLine();
            System.out.println("Introduce la ciudad:");
            String ciudad = scanner.nextLine();
            System.out.println("Introduce el país:");
            String pais = scanner.nextLine();
            System.out.println("Introduce la tasa aeroportuaria (ej: 1200.00)");
            BigDecimal tasa = scanner.nextBigDecimal();
            scanner.nextLine();

            AeropuertoEntity aeropuertoEntity = new AeropuertoEntity(null, codIATA, nombre, ciudad,
                    pais, tasa);

            aeropuertoService.save(aeropuertoEntity);

            System.out.println("Aeropuerto creado con id: " + aeropuertoEntity.getIdAeropuerto());

        }
    }
}