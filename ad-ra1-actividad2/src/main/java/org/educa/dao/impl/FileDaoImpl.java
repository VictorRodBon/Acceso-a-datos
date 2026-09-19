package org.educa.dao.impl;

import org.educa.dao.FileDao;
import java.io.File;

public class FileDaoImpl implements FileDao{
    @Override
    public File[] listFiles(String path){
        File dir = new File(path);
        if (dir.exists() && dir.isDirectory()){
            return dir.listFiles();
        }
        return new File[0];
    }

    @Override
    public String getPermissions(File file) {
        StringBuilder permisos = new StringBuilder();
        if (file.canWrite()) permisos.append("W");
        if (file.canRead()) permisos.append("R");
        if (file.canExecute()) permisos.append("X");
        return permisos.toString();
    }

    @Override
    public boolean renameFile(File file, String newFileName) {
        File targetFile = new File(file.getParentFile(), newFileName);
        return file.renameTo(targetFile);
    }
}
