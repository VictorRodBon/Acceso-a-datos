package org.educa;

import org.educa.entity.FileEntity;
import org.educa.services.FileService;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileService fileService = new FileService();

        ArrayList<FileEntity> ficheros = fileService.getFiles("/home/alumnotd/Descargas");

        for (FileEntity f : ficheros) {
            try {
                fileService.setInfo(f);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        fileService.filesInfo(ficheros);
    }
}