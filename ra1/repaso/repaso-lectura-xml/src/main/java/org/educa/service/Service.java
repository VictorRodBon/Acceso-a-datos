package org.educa.service;

import org.educa.dao.DaoImpl;
import org.educa.dao.DaoInterface;
import org.educa.ra1.model.Libreria;

import java.math.BigDecimal;
import java.util.List;

public class Service {
    DaoInterface dao = new DaoImpl();

    public Libreria getLibreriaData(String path){
        return dao.getLibreriaData(path);
    }

    public String getTitulosYAutores(List<Libreria.Libro> listaLibros) {
        StringBuilder contenido = new StringBuilder();

        BigDecimal precioMax = new BigDecimal("15.00");
        for(Libreria.Libro l : listaLibros){

            if (l.getPrecio().compareTo(precioMax)<0){
                contenido.append("Titulo: ").append(l.getTitulo()).append(" | Autor: ").append(l.getAutor()).append("\n");
            }
        }
        return contenido.toString();
    }

    public void setNewLibro(Libreria.Libro libro, String path) {
        Libreria libreria = getLibreriaData(path);
        libro.setId(libreria.getLibro().size()+1);
        libreria.getLibro().add(libro);
        dao.setLibreriaData(libreria, path);
    }
}
