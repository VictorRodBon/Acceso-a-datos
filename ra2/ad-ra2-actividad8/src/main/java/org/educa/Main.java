package org.educa;

import org.educa.services.AvionesService;

import java.util.Scanner;

public class Main {
    /*
    * Obtener id y matricula de avion, modelo y fabricante de modelos de aviones por matricula solicitada por terminal
    * */
    public static void main(String[] args) {
        AvionesService avionesService = new AvionesService();

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la matricula de la que quieres obtener la información");
        String matricula = sc.nextLine();

        System.out.println(avionesService.getDataByPlate(matricula).toString());
    }
}
