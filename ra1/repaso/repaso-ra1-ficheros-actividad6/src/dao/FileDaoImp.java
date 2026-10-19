package dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
}
