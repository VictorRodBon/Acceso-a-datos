package org.educa.dao;

public interface FileDao {
    boolean ficheroExiste(String fileName);
    String crearFichero(String fileName, String fileContent);  // fileCoontent → fileContent
}