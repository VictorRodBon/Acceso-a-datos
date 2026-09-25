package org.educa;

import org.educa.entity.FileEntity;
import org.educa.services.FileService;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Create an instance of FileService
        FileService fileService = new FileService();

        // 2. Call getFiles using the service instance
        ArrayList<FileEntity> ficheros = fileService.getFiles("/home/alumnotd/Descargas");

        for (FileEntity f : ficheros) {
            try {
                // 3. Call setInfo and handle the IOException
                fileService.setInfo(f);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 4. Call filesInfo using the service instance
        fileService.filesInfo(ficheros);
    }
}