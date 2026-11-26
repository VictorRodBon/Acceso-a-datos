package org.educa;

import org.educa.entity.ClienteEntity;
import org.educa.service.ClienteService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            ClienteService clienteService = new ClienteService();

            System.out.println("Introduce el dni del usuario a registrar:");
            String dni = sc.nextLine();
            System.out.println("Introduce el nombre del usuario a registrar:");
            String nombre = sc.nextLine();
            System.out.println("Introduce el primer apellido del usuario a registrar:");
            String pApellido = sc.nextLine();
            System.out.println("Introduce el segundo apellido del usuario a registrar:");
            String sApellido = sc.nextLine();
            System.out.println("Introduce el email del usuario a registrar:");
            String email = sc.nextLine();
            System.out.println("Introduce el telefono del usuario a registrar:");
            String telefono = sc.nextLine();

            ClienteEntity cliente = new ClienteEntity(dni, nombre, pApellido, sApellido, email, telefono);

            System.out.println("se va a registrar al cliente");
            if(clienteService.insertCliente(cliente)==1){
                System.out.println("cliente insertado correctamente");
            }else{
                System.out.println("error al insertar al cliente");
            }
        }
    }
}