package org.educa;

import java.util.Scanner;

import org.educa.dao.impl.FileDaoImpl;
import org.educa.service.FileService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del fichero: ");
        String name = scanner.nextLine();
        System.out.println("Contenido del fichero: ");
        String content = scanner.nextLine();
        scanner.close();

        final String PATH = "/home/victor/prueba/";
        StringBuffer rutaCompleta = new StringBuffer();
        rutaCompleta.append(PATH).append(name);

        FileService fileService = new FileService(new FileDaoImpl());
        if (fileService.crearSiNoExiste(rutaCompleta.toString(), content)) {
            System.out.println("Fichero creado con éxito");
        } else {
            System.out.println("El fichero ya existe, no se sobrescribe");
        }
    }
}