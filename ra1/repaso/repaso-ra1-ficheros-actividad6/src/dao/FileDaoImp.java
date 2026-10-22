package dao;

import java.io.*;

public class FileDaoImp implements FileDao {

    @Override
    public boolean createFile(String contenido) {
        try(FileWriter fw = new FileWriter(new File("/home/victor/DAM/fichero.txt"))){
            fw.write(contenido);
            return true;
        } catch (IOException e) {
            return false;
        }

    }

    @Override
    public String readFile() {
        StringBuilder contenido=new StringBuilder();

        try (BufferedReader br = new BufferedReader(
                new FileReader("/home/victor/DAM/fichero.txt")
        )) {
            String linea;
            while ((linea = br.readLine()) != null){
                contenido.append(linea).append("\n");
            }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
        return contenido.toString();
    }
}
