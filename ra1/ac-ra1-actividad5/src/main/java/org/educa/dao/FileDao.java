package org.educa.dao;

import java.io.File;
import java.io.IOException;

public interface FileDao extends AutoCloseable{
    long contarEnteros() throws IOException;
    int obtenerPorPosicion(int posicion) throws IOException;
    void actualizar(int posicion, int nuevoValor) throws IOException;
}
