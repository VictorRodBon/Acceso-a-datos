package org.educa;

import java.util.Scanner;
import org.educa.services.FileService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileService fileService = new FileService();

        System.out.println(fileService.mostrarContenido());

        System.out.println("indica el número que quieres añadir al fichero datos.dat.");
        int numero = scanner.nextInt();

        fileService.anadirNumero(numero);

        System.out.println(fileService.mostrarContenido());
    }
}
