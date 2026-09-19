package org.educa;

import org.educa.service.FileService;

public class Main {
    public static void main(String[] args) {
        FileService fileService = new FileService();
        fileService.processDirectoryFiles();
    }
}