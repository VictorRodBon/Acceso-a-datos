package org.educa;

import org.educa.entity.ModeloEntity;
import org.educa.service.ModeloService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ModeloService service = new ModeloService();
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Código del modelo:");
            String codModelo=sc.nextLine();
            System.out.println("Fabricante:");
            String fabricante=sc.nextLine();
            System.out.println("Capacidad:");
            int capacidad=sc.nextInt();
            ModeloEntity modelo = new ModeloEntity(codModelo, fabricante, capacidad);
            service.create(modelo);
        }
    }
}