package org.educa;

import org.educa.service.FileService;

public class Main {
    public static void main(String[] args) {
        FileService f = new FileService();
        String msg = f.checkDirectory();
        System.out.println(msg);
    }
}
