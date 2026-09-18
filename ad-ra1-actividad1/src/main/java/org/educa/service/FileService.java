package org.educa.service;

import java.io.File;

public class FileService {

    public static final String LINE_BREAK = "\n";
    public static final String PATH = "/home/alumnotd/victor";

    public String checkDirectory() {
        StringBuilder result = new StringBuilder();
        File file = new File(PATH);
        if (file.isDirectory()) {
            for (File fichero : file.listFiles()) {
                if (fichero.isDirectory()) {
                    result.append(fichero.getName()).append("is directory").append(LINE_BREAK);
                } else {
                    result.append(fichero.getName()).append("is file").append(LINE_BREAK);
                }
            }
        }
        return result.toString();
    }
}
