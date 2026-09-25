package org.educa.services;

import org.educa.dao.FileDao;
import org.educa.dao.impl.FileDaoImpl;
import org.educa.entity.FileEntity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class FileService {
    private final FileDao fileDao = new FileDaoImpl();

    private final String BREAK_LINE="\n";

    public ArrayList<FileEntity> getFiles(String PATH){
        ArrayList<FileEntity> filesEntitys = new ArrayList<FileEntity>();

        File files = new File(PATH);
        for (File file:files.listFiles()){
            filesEntitys.add(new FileEntity(file.getName(), file));
        }
        return filesEntitys;
    }

    public void setInfo(FileEntity fileEntity) throws IOException {
        File file=fileEntity.getFile();

        // almacenamos tipo
        fileEntity.setType(file.isDirectory() ? "D" : "F");

        // almacenamos permisos
        StringBuilder perm = new StringBuilder();
        if(file.canExecute()){perm.append("X");}
        if(file.canWrite()){perm.append("W");}
        if(file.canRead()){perm.append("R");}
        fileEntity.setPermissions(perm.toString());

        // almacenamos tamaño
        fileEntity.setSize((int) Files.size(Path.of(file.getAbsolutePath())));
    }

    public void filesInfo(ArrayList<FileEntity> filesEntitys){

        StringBuilder files= new StringBuilder();
        StringBuilder dirs= new StringBuilder();

        for (FileEntity file : filesEntitys){
            if (file.getFile().isFile()){
                files.append(file.getName()).append(";").append(file.getType()).append(";").append(file.getPermissions()).append(";").append(file.getSize()).append(BREAK_LINE);
            }else{
                dirs.append(file.getName()).append(";").append(file.getType()).append(";").append(file.getPermissions()).append(";").append(file.getSize()).append(BREAK_LINE);
            }
        }

        fileDao.addData(files.toString(), "/home/alumnotd/victor/ficheros.txt");
        fileDao.addData(dirs.toString(), "/home/alumnotd/victor/dirs.txt");


    }
}
