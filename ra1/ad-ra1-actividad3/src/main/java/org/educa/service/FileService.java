package org.educa.service;

import org.educa.dao.FileDao;
import org.educa.dao.impl.FileDaoImpl;

public class FileService {
    private final FileDao fileDao;

    // Inyección de dependencias por constructor
    public FileService(FileDao fileDao) {
        this.fileDao = fileDao;
    }

    // Lógica de negocio: solo crear si no existe
    public boolean crearSiNoExiste(String fileName, String content) {
        if (fileDao.ficheroExiste(fileName)) {
            return false;  // ya existía, no se crea
        }
        fileDao.crearFichero(fileName, content);
        return true;
    }
}