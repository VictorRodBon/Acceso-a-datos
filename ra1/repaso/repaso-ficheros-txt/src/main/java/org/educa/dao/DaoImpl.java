package org.educa.dao;

import org.educa.entity.ProductoEntity;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DaoImpl implements DaoInterface{
    @Override
    public List<ProductoEntity> getProductos(String path) {
        List<ProductoEntity> productos = new ArrayList<>();
        String linea;
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            while((linea=br.readLine())!=null){
                productos.add(
                        new ProductoEntity(
                                linea.split(",")[0],
                                linea.split(",")[1],
                                Integer.parseInt(linea.split(",")[2]),
                                Double.parseDouble(linea.split(",")[3])
                        )
                );
            }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
        return productos;
    }

    @Override
    public void setReponer(String path, List<ProductoEntity> productos) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            StringBuilder contenido = new StringBuilder();
            int contador = 0;
            for(ProductoEntity p : productos){
                contenido.append(p.toString()).append("\n");
                contador+=p.getCantidad();
            }
            contenido.append("Total de productos a reponer: ").append(contador);

            bw.write(contenido.toString());
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
