package org.educa.dao.impl;

import org.educa.dao.FileDao;
import org.educa.entity.FileEntity;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class FileDaoImpl implements FileDao {

    private final String BREAKLINE = "\n";
    private final String PATH = "/home/alumnotd/prueba/prueba.txt";

    @Override
    public boolean createFile(String path) {
        try {
            return new File(path).createNewFile();
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    public String addData(String data, String path) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path), StandardCharsets.ISO_8859_1))) {
            bw.write(data.toString());
            return "datos añadidos al fichero con éxito";
        }catch (IOException e){
            return "fallo al añadir los datos al fichero: "+e.getMessage();
        }
    }

    @Override
    public String displayFile(String path) {
        StringBuilder data = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(new File(PATH)))){
            String linea;
            while ((linea = br.readLine()) != null) {
                data.append(linea);
            }
        }catch (IOException e){
            data.append(e.getMessage());
        }finally {
            return data.toString();
        }
    }
}
