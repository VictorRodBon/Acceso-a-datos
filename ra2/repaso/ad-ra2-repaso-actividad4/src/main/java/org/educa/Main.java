package org.educa;

import org.educa.entity.ClienteEntity;
import org.educa.service.ClienteService;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClienteService clienteService = new ClienteService();
        List<ClienteEntity> listaClientes = clienteService.selectWithReservasCount();
        for(ClienteEntity c : listaClientes){
            System.out.println(c.getId()+","+c.getDni()+","+c.getReservas());;
        }
    }
}