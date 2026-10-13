package org.educa;

import org.educa.entity.ClienteEntity;
import org.educa.service.ClienteService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClienteService clienteService = new ClienteService();
        List<ClienteEntity> clientes = clienteService.findAllWithReservationCount();
        for (ClienteEntity cliente : clientes) {
            System.out.printf("DNI: %s, Nombre: %s %s %s, Reservas: %d%n",
                    cliente.getDni(),
                    cliente.getNombre(),
                    cliente.getPApellido(),
                    cliente.getSApellido(),
                    cliente.getNumReservas());
        }
    }
}
