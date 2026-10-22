package org.educa;

import org.educa.entity.ProductoEntity;
import org.educa.services.Service;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        final String  pathOrigen = "src/main/resources/productos.txt";
        final String  pathDestino = "src/main/resources/reposicion_urgente.txt";

        List<ProductoEntity> productos = service.getProductos(pathOrigen);
        service.setReponer(pathDestino, pathOrigen);

        for(ProductoEntity p : productos){
            System.out.println(p.getNombre());
        }
    }
}