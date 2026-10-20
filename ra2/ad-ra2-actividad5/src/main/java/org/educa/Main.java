package org.educa;

import org.educa.entity.ClienteEntity;
import org.educa.service.ClienteService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DNI:");String dni = sc.nextLine();
        System.out.println("Nombre:");String nombre = sc.nextLine();
        System.out.println("Primer apellido:");String pApellido = sc.nextLine();
        System.out.println("Segundo apellido:");String sApellido = sc.nextLine();
        System.out.println("Email:");String email = sc.nextLine();
        System.out.println("Teléfono:");String telefono = sc.nextLine();

        ClienteEntity cliente = new ClienteEntity(dni,nombre, pApellido, sApellido, email, telefono);

        ClienteService clienteService = new ClienteService();

        System.out.println(clienteService.addCliente(cliente));


    }
}
