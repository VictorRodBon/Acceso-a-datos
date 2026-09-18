package org.educa.service;

import java.io.File;

public class FileService {

    public static final String PATH = "/home/alumnotd/victor/";

    public void renameFile(File file, String permisos){
        StringBuilder name = new StringBuilder().append(file.getName()).append(permisos);

        file.renameTo()
    }
}
