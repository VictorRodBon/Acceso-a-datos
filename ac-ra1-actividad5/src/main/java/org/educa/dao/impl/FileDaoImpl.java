package org.educa.dao.impl;

import org.educa.dao.FileDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileDaoImpl implements FileDao {

    private final RandomAccessFile raf;

    public FileDaoImpl(File archivo) throws FileNotFoundException {
        this.raf = new RandomAccessFile(archivo, "rw");
    }

    @Override
    public long contarEnteros() throws IOException {
        return raf.length() / 4;
    }

    @Override
    public int obtenerPorPosicion(int posicion) throws IOException {
        long bytePosicion = calcularBytePosicion(posicion);
        raf.seek(bytePosicion);
        return raf.readInt();
    }

    @Override
    public void actualizar(int posicion, int nuevoValor) throws IOException {
        long bytePosicion = calcularBytePosicion(posicion);
        raf.seek(bytePosicion);
        raf.writeInt(nuevoValor);
    }

    private long calcularBytePosicion(int posicion) {
        return (posicion - 1) * 4L;
    }

    @Override
    public void close() throws IOException {
        if (raf != null) {
            raf.close();
        }
    }
}