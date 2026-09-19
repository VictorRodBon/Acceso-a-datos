package org.educa.service;

import org.educa.dao.FileDao;
import org.educa.dao.impl.FileDaoImpl;
import java.io.File;
import java.util.logging.Logger;
import java.util.logging.Level;

public class FileService {

    private static final Logger LOGGER = Logger.getLogger(FileService.class.getName());
    public static final String PATH = "/home/victor/prueba";

    private final FileDao fileDao;

    public FileService(FileDao fileDao) {
        this.fileDao = fileDao;
    }

    public FileService() {
        this(new FileDaoImpl());
    }

    /**
     * Procesa los archivos del directorio.
     * @return El número de archivos renombrados con éxito.
     */
    public int processDirectoryFiles() {
        File[] files = fileDao.listFiles(PATH);

        if (files == null || files.length == 0) {
            LOGGER.log(Level.WARNING, "El directorio está vacío o no es accesible: {0}", PATH);
            return 0;
        }

        int successCount = 0;

        for (File file : files) {
            if (file.isFile()) {
                String permisos = fileDao.getPermissions(file);
                String newFileName = calculateNewName(file.getName(), permisos);

                boolean success = fileDao.renameFile(file, newFileName);
                if (success) {
                    successCount++;
                } else {
                    LOGGER.log(Level.SEVERE, "Fallo al renombrar el archivo: {0}", file.getName());
                }
            }
        }

        return successCount;
    }

    private String calculateNewName(String originalName, String permisos) {
        int dotIndex = originalName.lastIndexOf('.');
        String baseName = (dotIndex > 0) ? originalName.substring(0, dotIndex) : originalName;
        String extension = (dotIndex > 0) ? originalName.substring(dotIndex) : "";

        return baseName + "_" + permisos.toUpperCase() + extension;
    }
}