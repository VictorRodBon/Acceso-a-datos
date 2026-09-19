package org.educa.services;

import org.educa.dao.FileDao;
import org.educa.dao.impl.FileDaoImpl;

import java.io.File;

public class FileService {
    public static final String PATH = "/home/victor/DAM/prueba/datos.dat";

    private final FileDao fileDao;

    public FileService() {
        this.fileDao=new FileDaoImpl();
    }

    public String mostrarContenido(){
        File file = new File(PATH);

        if (!fileDao.doesFileExists(file)){
            return "no existe";
        }else{
            return fileDao.displayFile(file);
        }
    }

    public void anadirNumero(int numero){
        File file = new File(PATH);

        if (fileDao.doesFileExists(file)){
            fileDao.addToFile(file, numero);
        }
    }
}