package org.educa;

import org.educa.entity.ClienteEntity;
import org.educa.service.ClienteService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClienteService clienteService = new ClienteService();
        System.out.println("Introduce el id del cliente del que quieres obtener la información:");
        try(Scanner sc = new Scanner(System.in)){
            Integer id = sc.nextInt();
            ClienteEntity cliente = clienteService.get(id);
            System.out.println(cliente.toString());
        }

    }
}
