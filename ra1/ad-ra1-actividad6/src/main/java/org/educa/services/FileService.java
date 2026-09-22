package org.educa.services;

import org.educa.dao.FileDao;
import org.educa.dao.impl.FileDaoImpl;
import org.educa.entity.FileEntity;

import java.io.File;
import java.util.ArrayList;

public class FileService {
    //private final FileDao FileDao = new FileDaoImpl();

    ArrayList<FileEntity> filesEntitys = new ArrayList<FileEntity>();

    public ArrayList<FileEntity> getFiles(String PATH){
        File files = new File(PATH);
        for (File file:files.listFiles()){
            filesEntitys.add(new FileEntity(file.getName(), file));
        }
        return filesEntitys;
    }


}
