package org.educa;

import org.educa.ra1.model.Libreria;
import org.educa.service.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        Scanner sc = new Scanner(System.in);

        final String  XML = "src/main/resources/xml/libreria.xml";

        List<Libreria.Libro> listaLibros = service.getLibreriaData(XML).getLibro();
        String titulosYAutores = service.getTitulosYAutores(listaLibros);

        Libreria.Libro libro = new Libreria.Libro();

        System.out.println(titulosYAutores);
        System.out.println(listaLibros.size());

        System.out.println("===== AÑADIR UN NUEVO LIBRO =====");
        System.out.println("Titulo:");
        libro.setTitulo(sc.nextLine());
        System.out.println("Autor:");
        libro.setAutor(sc.nextLine());
        System.out.println("Año:");
        libro.setAnyo(sc.nextBigInteger());
        System.out.println("Precio:");
        libro.setPrecio(sc.nextBigDecimal());
        System.out.println("Genero:");
        libro.setGenero(sc.nextLine());
        libro.setGenero(sc.nextLine());


        service.setNewLibro(libro, XML);
    }
}