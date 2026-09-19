package org.educa.dao;

import java.io.File;

public interface FileDao {
    Boolean doesFileExists(File file);
    String displayFile(File file);
    void addToFile(File file, int number);
}
