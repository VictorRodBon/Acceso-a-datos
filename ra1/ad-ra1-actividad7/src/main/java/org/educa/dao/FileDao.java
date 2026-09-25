package org.educa.dao;

import org.educa.entity.FileEntity;

import java.io.File;
import java.util.List;

public interface FileDao {
    boolean createFile(String path);
    String addData(String content, String path);
    String displayFile(String path);
}
