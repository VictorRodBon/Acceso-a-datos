package org.educa;

import org.educa.entity.ClienteEntity;
import org.educa.services.ClienteService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca el dni del que quiere buscar la información");
        String dni = sc.nextLine();

        ClienteService clienteService = new ClienteService();

        ClienteEntity data= clienteService.getClientData(dni);
        System.out.println(data.toString());
    }
}
