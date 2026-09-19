package org.educa.dao;

import java.io.File;

public interface FileDao {
    File[] listFiles(String path);
    String getPermissions(File file);
    boolean renameFile(File source, String newName);
}
