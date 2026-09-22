package org.educa.dao;

import org.educa.entity.FileEntity;

import java.io.File;
import java.util.List;

public interface FileDao {
    boolean createFile(String path);

    String addData(List<FileEntity> filesEntitys);
    String displayFile(String path);
}
