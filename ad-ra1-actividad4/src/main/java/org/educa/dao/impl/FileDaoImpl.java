package org.educa.dao.impl;

import org.educa.dao.FileDao;

import java.io.*;

public class FileDaoImpl implements FileDao {
    @Override
    public Boolean doesFileExists(File file){
        return file.exists();
    }

    @Override
    public String displayFile(File file){
            StringBuilder content = new StringBuilder();
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            while (true) {
                content.append(dis.readInt()).append(" ");
            }
        } catch (EOFException i){
            return content.toString().trim();
        }catch (IOException e){
            content.append("Error al leer el contenido del fichero").append(e.getMessage());
            return content.toString();
        }

    }

    @Override
    public void addToFile(File file, int number) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file,true))){
            dos.writeInt(number);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
