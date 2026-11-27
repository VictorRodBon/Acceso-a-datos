package org.educa;

import org.educa.entity.BilleteEntity;
import org.educa.service.ServicioBilletes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServicioBilletes servicio = new ServicioBilletes();
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("id del billete a buscar:");
            int id = sc.nextInt();
            BilleteEntity billete = servicio.getBilleteById(id);
            System.out.println("id billete: " + billete.getIdBillete());
            System.out.println("id vuelo: " + billete.getVuelo().getIdVuelo());
            System.out.println("id pasajero: " + billete.getPasajero().getIdPasajero());
        }
    }
}