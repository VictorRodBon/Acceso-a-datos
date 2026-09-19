package org.educa.dao.impl;

import org.educa.dao.FileDao;

import java.io.*;

public class FileDaoImpl implements FileDao {
    @Override
    public boolean ficheroExiste(String fileName) {
        File file = new File(fileName);
        return file.exists();
    }


    @Override
    public String crearFichero(String fileName, String fileContent){
        File file = new File(fileName);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, false))){
            bw.write(fileContent);
            bw.newLine();
            return "Escrito con éxito";
        }catch (IOException e){
            return e.getMessage();
        }
    }
}
